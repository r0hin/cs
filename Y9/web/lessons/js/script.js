function yeet() {
    a = document.getElementById('a').value
    b = document.getElementById('b').value
    c = document.getElementById('ye').value


    if (a == "" || b == "" || c == "") {
        error('You are trash')
    }
    else {


        document.getElementById('poop').innerHTML = 'Welcome, ' + a + '. You are ' + b + ". Your favourite food is " + c
    }
}