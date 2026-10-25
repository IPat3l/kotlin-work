// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }   // compute no. of items with NotStarted status
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }  // compute no. of items with InProgress status
    val done get() = items.count { it.status == ItemStatus.Done }         // compute no. of items with Done status
    val overdue get() = items.count { it.isOverdue() }     // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // For every line/task, split into 3 items by : , parse 1st into LocalDate
        // convert status string into ItemStatus, and take task details, then add to list
        Path(filename).forEachLine { items.add(ToDoItem( LocalDate.parse(it.split(':')[0]), ItemStatus.valueOf(it.split(':')[1].trim()), it.split(':')[2].trim() ))}
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed

        // remove all items where status matches
        // returns true if any items are removed, false otherwise
        return items.removeAll { it.status == ItemStatus.Done }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        if (status == null) { return items } else { return items.filter { it.status == status } }
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        return items.filter { it.dueDate == date }
    }
}
