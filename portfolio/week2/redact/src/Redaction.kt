// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(inputDoc: String, toRedact: String, redactChar: Char = 'X'): String {
    // Convert to regex for searching/replacing
    val wordToRedact = toRedact.toRegex()

    // Create redacted version of word to replace with
    var redacted = buildString {
        for (n in 1..toRedact.length) {
            append(redactChar)
        }
    }

    // Replace every instance of the sensitive word with the redacted one
    return wordToRedact.replace(inputDoc, redacted)
}