function showMenu(menuID,index){document.getElementById(menuID).style.display=(index==0?"none":"block");}
//加入收藏
function AddFavorite() {
    try { //IE
        window.external.addFavorite("http://wangchaoyang.jaadee.com/", "玉雕大师王朝阳作品");
    } catch (e) {
        try { //Firefox
            window.sidebar.addPanel("玉雕大师王朝阳作品", "http://wangchaoyang.jaadee.com/", "");
        } catch (e) {
   try{//Chrome
    createShortcut();
   } catch(e){
    alert("您的浏览器不支持自动加入收藏，请使用浏览器菜单或者快捷键‘ctrl+D’手动设置。"); 
   }
        }
    }
}
//得到浏览器可视区域高宽
function getViewSizeWithScrollbar() { //包含滚动条 
    if (window.innerWidth) {
        return {
			width: window.innerWidth,
            height: window.innerHeight
        }
    } else if (document.documentElement.offsetWidth == document.documentElement.clientWidth) {
        return {
			width: document.documentElement.offsetWidth,
            height: document.documentElement.offsetHeight
        }
    } else {
        return {
            width: document.documentElement.clientWidth + getScrollWith(),
			height: document.documentElement.clientHeight + getScrollWith()
        }
    }
}