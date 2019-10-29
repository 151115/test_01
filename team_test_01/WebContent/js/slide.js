let banner = document.getElementById('banner');
let num = 1;

function pre(){
 if(num == 1){
	 num = 2;
 }else 
  num--;
 banner.style.background='url(images/'+num+'.jpg)';
}

function next(){
 if(num == 2){
	 num = 1;
 }else
	 num ++;
 banner.style.background='url(images/'+num+'.jpg)'; 
}
