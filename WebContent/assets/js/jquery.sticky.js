/* jSticky Plugin
 * =============
 * Author: Andrew Henderson (@AndrewHenderson)
 * Contributor: Mike Street (@mikestreety)
 * Date: 9/7/2012
 * Update: 09/20/2016
 * Website: http://github.com/andrewhenderson/jsticky/
 * Description: A jQuery plugin that keeps select DOM element(s)
 * in view while scrolling the page.
 */
!function(t){t.fn.sticky=function(s){function i(){return"number"==typeof o.zIndex?!0:!1}function e(){return 0<t(o.stopper).length||"number"==typeof o.stopper?!0:!1}var n={topSpacing:0,zIndex:"",stopper:".sticky-stopper",stickyClass:!1},o=t.extend({},n,s),r=i(),p=e();return this.each(function(){function s(){var s=u.scrollTop(),n=f,h=i.parent().width();if(l.width(h),p&&"string"==typeof f){var y=t(f).offset().top;n=y-e-c}if(s>d){if(o.stickyClass&&i.addClass(o.stickyClass),i.after(l).css({position:"fixed",top:c,width:h}),r&&i.css({zIndex:a}),p&&s>n){var v=n-s+c;i.css({top:v})}}else o.stickyClass&&i.removeClass(o.stickyClass),i.css({position:"static",top:null,left:null,width:"auto"}),l.remove()}var i=t(this),e=i.outerHeight(),n=i.outerWidth(),c=o.topSpacing,a=o.zIndex,d=i.offset().top-c,l=t("<div></div>").width(n).height(e).addClass("sticky-placeholder"),f=o.stopper,u=t(window);u.innerHeight()>e&&(u.bind("scroll",s),u.bind("load",s),u.bind("resize",s))})}}(jQuery);