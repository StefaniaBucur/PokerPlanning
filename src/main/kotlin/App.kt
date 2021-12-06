import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.Props
import react.dom.*
import react.fc
import styled.css
import styled.styledDiv


val app = fc<Props> {
    // typesafe HTML goes here!
    styledDiv {
        css {
            top = 10.px
            right = 10.px
            color = Color.pink
        }
        h1 {
            +"Poker Planning"
        }
        div {
            h1 {
                +"Vote!"
            }

            for (card in cards) {
                styledDiv {
                    css {
                        top = 10.px
                        right = 10.px
                    }

                    attrs {
                        onClickFunction = {
                            window.alert("Clicked ${card.value}!")
                        }
                    }
                    button {
                        +"Choose: ${card.value}"
                    }
                }

            }
        }
    }

    div {
        h3 {
            +"The average:"
        }
        img {
            attrs {
                src =
                    "https://static5.depositphotos.com/1030629/534/i/600/depositphotos_5344901-stock-photo-funny-goat-puts-out-its.jpg"
            }
        }
    }
}

