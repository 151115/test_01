/*let div = document.getElementById('index.html');
let num = 0;

function banner_pre() {
 if (num === 0) {
  num = 14;
 } else {
  num--;
 }
 div.style.backgroundImage='url(../test_img_01/' + num + '.jpg'
}

function banner_next() {
 if (num === 14) {
  num = 0;
 } else {
  num++;
 }
 div.style.backgroundImage='url(../images/r' + num + '.jpg'
}




let img = document.getElementById('slide_test_01');
// 같은 뜻 document.querySelector('#img')
let current=0;

setInterval(function(){
	console.log('반복');
	
	banner_next();
	
} , 1000);


function banner_pre(){

	imgChange((current ==0 )? current=14 : current--);
	
	
}

function banner_next(){

	imgChange((current ==14)? current=0 : current++);
	
}
function imgChange(imgNum){
	img.style.backgroundImage = 'url(../images/r'+ imgNum +'.jpg)';

}


function btn_test_every_01(){
	
}

function btn_test_every_02(){
	
}*/