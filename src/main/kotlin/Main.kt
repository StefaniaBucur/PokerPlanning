import react.dom.*
import kotlinx.browser.document
import kotlinx.css.*
import kotlinx.css.properties.Time
import kotlinx.serialization.Serializable
import styled.*
import kotlin.time.Duration

val cards = listOf(
    Card(1),
    Card(2),
    Card(3),
    Card(5),
    Card(8),
    Card(13),
    Card(21)
)

fun main() {
    render(document.getElementById("root")) {
        child(app)
    }
}
