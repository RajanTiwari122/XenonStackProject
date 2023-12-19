// Questions that will be asked
const Questions = [{
	q: "The latest HTML standard is?",
	a: [{ text: "HTML 4.0", isCorrect: false },
	{ text: "XML", isCorrect: false },
	{ text: "HTML 5.0", isCorrect: true },
	{ text: "SGML", isCorrect: false }
	]

},
{
	q: "Why are cookies designed?",
	a: [{ text: "for client side programming", isCorrect: false, isSelected: false },
	{ text: "both server and client side programming", isCorrect: false },
	{ text: "None", isCorrect: false },
	{ text: "for server side programming", isCorrect: true }
	]

},
{
	q: "What are the variables used in JS programs",
	a: [{ text: "varying randomly ", isCorrect: false },
	{ text: "using as header file", isCorrect: false },
	{ text: "storing numbers dates and other values", isCorrect: true },
	{ text: "none of the above", isCorrect: false }
	]

},
{
	q: "Identify incorrect HTML tag among the following",
	a: [{ text: "<list>", isCorrect: true },
    { text: "<head>", isCorrect: false },
	{ text: "<select>", isCorrect: false },
	{ text: "<textarea>", isCorrect: false }
	]

},
{
	q: "Full form of W3C",
	a: [{ text: "world wide web community", isCorrect: false },
	{ text: "world wide website community", isCorrect: false },
	{ text: "none of the above", isCorrect: false },
    { text: "world wide web consortium", isCorrect: true }
	]

},
{
	q: "Identify the empty tag in HTML",
	a: [{ text: "<sup>", isCorrect: false },
	{ text: "<p>", isCorrect: false },
	{ text: "<br>", isCorrect: true },
	{ text: "<abbr>", isCorrect: false }
	]

},
{
	q: "which of the following is used to transmit information on the web ",
	a:[{ text: "HTTP", isCorrect: true },
    { text: "HTTTP", isCorrect: false },
	{ text: "HPTP", isCorrect: false },
	{ text: "HTPP", isCorrect: false }
	]

},
{
	q: "A website is _____ cookie",
	a: [{ text: "volatile", isCorrect: false },
    { text: "transient", isCorrect: true },
	{ text: "intransient", isCorrect: false },
	{ text: "non-volatile", isCorrect: false }
	]

},
{
	q: "When is <body> tag is uesd",
	a: [{ text: "after FORM tag", isCorrect: false },
	{ text: "after TITLE tag", isCorrect: false },	
	{ text: "after EM tag", isCorrect: false },
    { text: "after HEAD tag", isCorrect: true },
	]

},
{
	q: "Identify the container among the following",
	a: [{ text: "<body>", isCorrect: false },
	{ text: "<select>", isCorrect: false },
	{ text: "both a and b", isCorrect: true },
	{ text: "<input>", isCorrect: false }
	]

},


]

let currQuestion = 0
let score = 0

function loadQues() {
	const question = document.getElementById("ques")
	const opt = document.getElementById("opt")

	question.textContent = Questions[currQuestion].q;
	opt.innerHTML = ""

	for (let i = 0; i < Questions[currQuestion].a.length; i++) {
		const choicesdiv = document.createElement("div");
		const choice = document.createElement("input");
		const choiceLabel = document.createElement("label");

		choice.type = "radio";
		choice.name = "answer";
		choice.value = i;

		choiceLabel.textContent = Questions[currQuestion].a[i].text;

		choicesdiv.appendChild(choice);
		choicesdiv.appendChild(choiceLabel);
		opt.appendChild(choicesdiv);
	}
}

loadQues();

function loadScore() {
	const totalScore = document.getElementById("score")
	totalScore.textContent = `You scored ${score} out of ${Questions.length}`
}


function nextQuestion() {
	if (currQuestion < Questions.length - 1) {
		currQuestion++;
		loadQues();
	} else {
		document.getElementById("opt").remove()
		document.getElementById("ques").remove()
		document.getElementById("btn").remove()
		loadScore();
	}
}

function checkAns() {
	const selectedAns = parseInt(document.querySelector('input[name="answer"]:checked').value);

	if (Questions[currQuestion].a[selectedAns].isCorrect) {
		score++;
		console.log("Correct")
		nextQuestion();
	} else {
		nextQuestion();
	}
}
