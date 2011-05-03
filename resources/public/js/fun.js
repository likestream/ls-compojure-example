(function($) {
   $(document).ready(function() {
       var $myImg = $('img#myimage');  
       var $myTxt = $('h1#mystring');
       var origImg = $myImg.attr('src');
       var origTxt = $myTxt.text();
       var origImgHeight = $myImg.height();

       $myImg.hover(function () { $(this).attr('src', "/RichHickey.jpg").height(origImgHeight) }, 
                   function () { $(this).attr('src', origImg) });
       $myTxt.hover(function () { $(this).text("Compojure Rocks Too!") }, 
                   function () { $(this).text(origTxt) });

   });
})(jQuery);
