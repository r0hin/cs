$('#status').html('Loaded game.')    

function reset() {
    $('#status').html('Reset game.')    
    load()
}

function load() {
    $(`.valueItem`).html('<i class="material-icons">add_box</i>')

    startValue = Math.trunc(Math.random() * 10) + 1;
    
    $('#item1').html(startValue)
    
    missValue = Math.trunc(Math.random() * 5) + 2;
    operator = Math.trunc(Math.random() * 2);
    
    nextValue = startValue;
    
    step = Math.trunc(Math.random() * 25) + 1;

    for (i = 2; i < 7; i++) {
        nextValue = nextValue + step;
        if (i !== missValue) {
            $(`#item${i}`).html(nextValue)
        } else {
            answer = nextValue;
            $(`#item${i}`).get(0).onclick = () => {
                response = prompt('Enter the missing value: ')
                if (!response) {
                    $('#status').html('Prompt cancelled. Nothing happened.')
                    return;
                }

                if (answer == response) {
                    $('#status').html('<span class="success">Correct, congratulations!</span>')
                    $(`#item${missValue}`).html(response)
                }
                else {
                    $('#status').html('<span class="wrong">Sorry, incorrect!</span>')
                }
            }
        }

    }
    
}

load()