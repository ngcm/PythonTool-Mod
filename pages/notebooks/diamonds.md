---
layout: page
title: Turn blocks into diamonds
permalink: startcoding/diamonds/
---


<html>
<head><meta charset="utf-8" />
<title>Diamonds</title>

<script src="https://cdnjs.cloudflare.com/ajax/libs/require.js/2.1.10/require.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

<style type="text/css">
    /*!
*
* Twitter Bootstrap
*
*/
/*!
 * Bootstrap v3.3.6 (http://getbootstrap.com)
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 */
/*! normalize.css v3.0.3 | MIT License | github.com/necolas/normalize.css */
html {
  font-family: sans-serif;
  -ms-text-size-adjust: 100%;
  -webkit-text-size-adjust: 100%;
}
body {
  margin: 0;
}
article,
aside,
details,
figcaption,
figure,
footer,
header,
hgroup,
main,
menu,
nav,
section,
summary {
  display: block;
}
audio,
canvas,
progress,
video {
  display: inline-block;
  vertical-align: baseline;
}
audio:not([controls]) {
  display: none;
  height: 0;
}
[hidden],
template {
  display: none;
}
a {
  background-color: transparent;
}
a:active,
a:hover {
  outline: 0;
}
abbr[title] {
  border-bottom: 1px dotted;
}
b,
strong {
  font-weight: bold;
}
dfn {
  font-style: italic;
}
h1 {
  font-size: 2em;
  margin: 0.67em 0;
}
mark {
  background: #ff0;
  color: #000;
}
small {
  font-size: 80%;
}
sub,
sup {
  font-size: 75%;
  line-height: 0;
  position: relative;
  vertical-align: baseline;
}
sup {
  top: -0.5em;
}
sub {
  bottom: -0.25em;
}
img {
  border: 0;
}
svg:not(:root) {
  overflow: hidden;
}
figure {
  margin: 1em 40px;
}
hr {
  box-sizing: content-box;
  height: 0;
}
pre {
  overflow: auto;
}
code,
kbd,
pre,
samp {
  font-family: monospace, monospace;
  font-size: 1em;
}
button,
input,
optgroup,
select,
textarea {
  color: inherit;
  font: inherit;
  margin: 0;
}
button {
  overflow: visible;
}
button,
select {
  text-transform: none;
}
button,
html input[type="button"],
input[type="reset"],
input[type="submit"] {
  -webkit-appearance: button;
  cursor: pointer;
}
button[disabled],
html input[disabled] {
  cursor: default;
}
button::-moz-focus-inner,
input::-moz-focus-inner {
  border: 0;
  padding: 0;
}
input {
  line-height: normal;
}
input[type="checkbox"],
input[type="radio"] {
  box-sizing: border-box;
  padding: 0;
}
input[type="number"]::-webkit-inner-spin-button,
input[type="number"]::-webkit-outer-spin-button {
  height: auto;
}
input[type="search"] {
  -webkit-appearance: textfield;
  box-sizing: content-box;
}
input[type="search"]::-webkit-search-cancel-button,
input[type="search"]::-webkit-search-decoration {
  -webkit-appearance: none;
}
fieldset {
  border: 1px solid #c0c0c0;
  margin: 0 2px;
  padding: 0.35em 0.625em 0.75em;
}
legend {
  border: 0;
  padding: 0;
}
textarea {
  overflow: auto;
}
optgroup {
  font-weight: bold;
}
table {
  border-collapse: collapse;
  border-spacing: 0;
}
td,
th {
  padding: 0;
}
/*! Source: https://github.com/h5bp/html5-boilerplate/blob/master/src/css/main.css */
@media print {
  *,
  *:before,
  *:after {
    background: transparent !important;
    color: #000 !important;
    box-shadow: none !important;
    text-shadow: none !important;
  }
  a,
  a:visited {
    text-decoration: underline;
  }
  a[href]:after {
    content: " (" attr(href) ")";
  }
  abbr[title]:after {
    content: " (" attr(title) ")";
  }
  a[href^="#"]:after,
  a[href^="javascript:"]:after {
    content: "";
  }
  pre,
  blockquote {
    border: 1px solid #999;
    page-break-inside: avoid;
  }
  thead {
    display: table-header-group;
  }
  tr,
  img {
    page-break-inside: avoid;
  }
  img {
    max-width: 100% !important;
  }
  p,
  h2,
  h3 {
    orphans: 3;
    widows: 3;
  }
  h2,
  h3 {
    page-break-after: avoid;
  }
  .navbar {
    display: none;
  }
  .btn > .caret,
  .dropup > .btn > .caret {
    border-top-color: #000 !important;
  }
  .label {
    border: 1px solid #000;
  }
  .table {
    border-collapse: collapse !important;
  }
  .table td,
  .table th {
    background-color: #fff !important;
  }
  .table-bordered th,
  .table-bordered td {
    border: 1px solid #ddd !important;
  }
}
@font-face {
  font-family: 'Glyphicons Halflings';
  src: url('../components/bootstrap/fonts/glyphicons-halflings-regular.eot');
  src: url('../components/bootstrap/fonts/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('../components/bootstrap/fonts/glyphicons-halflings-regular.woff2') format('woff2'), url('../components/bootstrap/fonts/glyphicons-halflings-regular.woff') format('woff'), url('../components/bootstrap/fonts/glyphicons-halflings-regular.ttf') format('truetype'), url('../components/bootstrap/fonts/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}
.glyphicon {
  position: relative;
  top: 1px;
  display: inline-block;
  font-family: 'Glyphicons Halflings';
  font-style: normal;
  font-weight: normal;
  line-height: 1;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
.glyphicon-asterisk:before {
  content: "\002a";
}
.glyphicon-plus:before {
  content: "\002b";
}
.glyphicon-euro:before,
.glyphicon-eur:before {
  content: "\20ac";
}
.glyphicon-minus:before {
  content: "\2212";
}
.glyphicon-cloud:before {
  content: "\2601";
}
.glyphicon-envelope:before {
  content: "\2709";
}
.glyphicon-pencil:before {
  content: "\270f";
}
.glyphicon-glass:before {
  content: "\e001";
}
.glyphicon-music:before {
  content: "\e002";
}
.glyphicon-search:before {
  content: "\e003";
}
.glyphicon-heart:before {
  content: "\e005";
}
.glyphicon-star:before {
  content: "\e006";
}
.glyphicon-star-empty:before {
  content: "\e007";
}
.glyphicon-user:before {
  content: "\e008";
}
.glyphicon-film:before {
  content: "\e009";
}
.glyphicon-th-large:before {
  content: "\e010";
}
.glyphicon-th:before {
  content: "\e011";
}
.glyphicon-th-list:before {
  content: "\e012";
}
.glyphicon-ok:before {
  content: "\e013";
}
.glyphicon-remove:before {
  content: "\e014";
}
.glyphicon-zoom-in:before {
  content: "\e015";
}
.glyphicon-zoom-out:before {
  content: "\e016";
}
.glyphicon-off:before {
  content: "\e017";
}
.glyphicon-signal:before {
  content: "\e018";
}
.glyphicon-cog:before {
  content: "\e019";
}
.glyphicon-trash:before {
  content: "\e020";
}
.glyphicon-home:before {
  content: "\e021";
}
.glyphicon-file:before {
  content: "\e022";
}
.glyphicon-time:before {
  content: "\e023";
}
.glyphicon-road:before {
  content: "\e024";
}
.glyphicon-download-alt:before {
  content: "\e025";
}
.glyphicon-download:before {
  content: "\e026";
}
.glyphicon-upload:before {
  content: "\e027";
}
.glyphicon-inbox:before {
  content: "\e028";
}
.glyphicon-play-circle:before {
  content: "\e029";
}
.glyphicon-repeat:before {
  content: "\e030";
}
.glyphicon-refresh:before {
  content: "\e031";
}
.glyphicon-list-alt:before {
  content: "\e032";
}
.glyphicon-lock:before {
  content: "\e033";
}
.glyphicon-flag:before {
  content: "\e034";
}
.glyphicon-headphones:before {
  content: "\e035";
}
.glyphicon-volume-off:before {
  content: "\e036";
}
.glyphicon-volume-down:before {
  content: "\e037";
}
.glyphicon-volume-up:before {
  content: "\e038";
}
.glyphicon-qrcode:before {
  content: "\e039";
}
.glyphicon-barcode:before {
  content: "\e040";
}
.glyphicon-tag:before {
  content: "\e041";
}
.glyphicon-tags:before {
  content: "\e042";
}
.glyphicon-book:before {
  content: "\e043";
}
.glyphicon-bookmark:before {
  content: "\e044";
}
.glyphicon-print:before {
  content: "\e045";
}
.glyphicon-camera:before {
  content: "\e046";
}
.glyphicon-font:before {
  content: "\e047";
}
.glyphicon-bold:before {
  content: "\e048";
}
.glyphicon-italic:before {
  content: "\e049";
}
.glyphicon-text-height:before {
  content: "\e050";
}
.glyphicon-text-width:before {
  content: "\e051";
}
.glyphicon-align-left:before {
  content: "\e052";
}
.glyphicon-align-center:before {
  content: "\e053";
}
.glyphicon-align-right:before {
  content: "\e054";
}
.glyphicon-align-justify:before {
  content: "\e055";
}
.glyphicon-list:before {
  content: "\e056";
}
.glyphicon-indent-left:before {
  content: "\e057";
}
.glyphicon-indent-right:before {
  content: "\e058";
}
.glyphicon-facetime-video:before {
  content: "\e059";
}
.glyphicon-picture:before {
  content: "\e060";
}
.glyphicon-map-marker:before {
  content: "\e062";
}
.glyphicon-adjust:before {
  content: "\e063";
}
.glyphicon-tint:before {
  content: "\e064";
}
.glyphicon-edit:before {
  content: "\e065";
}
.glyphicon-share:before {
  content: "\e066";
}
.glyphicon-check:before {
  content: "\e067";
}
.glyphicon-move:before {
  content: "\e068";
}
.glyphicon-step-backward:before {
  content: "\e069";
}
.glyphicon-fast-backward:before {
  content: "\e070";
}
.glyphicon-backward:before {
  content: "\e071";
}
.glyphicon-play:before {
  content: "\e072";
}
.glyphicon-pause:before {
  content: "\e073";
}
.glyphicon-stop:before {
  content: "\e074";
}
.glyphicon-forward:before {
  content: "\e075";
}
.glyphicon-fast-forward:before {
  content: "\e076";
}
.glyphicon-step-forward:before {
  content: "\e077";
}
.glyphicon-eject:before {
  content: "\e078";
}
.glyphicon-chevron-left:before {
  content: "\e079";
}
.glyphicon-chevron-right:before {
  content: "\e080";
}
.glyphicon-plus-sign:before {
  content: "\e081";
}
.glyphicon-minus-sign:before {
  content: "\e082";
}
.glyphicon-remove-sign:before {
  content: "\e083";
}
.glyphicon-ok-sign:before {
  content: "\e084";
}
.glyphicon-question-sign:before {
  content: "\e085";
}
.glyphicon-info-sign:before {
  content: "\e086";
}
.glyphicon-screenshot:before {
  content: "\e087";
}
.glyphicon-remove-circle:before {
  content: "\e088";
}
.glyphicon-ok-circle:before {
  content: "\e089";
}
.glyphicon-ban-circle:before {
  content: "\e090";
}
.glyphicon-arrow-left:before {
  content: "\e091";
}
.glyphicon-arrow-right:before {
  content: "\e092";
}
.glyphicon-arrow-up:before {
  content: "\e093";
}
.glyphicon-arrow-down:before {
  content: "\e094";
}
.glyphicon-share-alt:before {
  content: "\e095";
}
.glyphicon-resize-full:before {
  content: "\e096";
}
.glyphicon-resize-small:before {
  content: "\e097";
}
.glyphicon-exclamation-sign:before {
  content: "\e101";
}
.glyphicon-gift:before {
  content: "\e102";
}
.glyphicon-leaf:before {
  content: "\e103";
}
.glyphicon-fire:before {
  content: "\e104";
}
.glyphicon-eye-open:before {
  content: "\e105";
}
.glyphicon-eye-close:before {
  content: "\e106";
}
.glyphicon-warning-sign:before {
  content: "\e107";
}
.glyphicon-plane:before {
  content: "\e108";
}
.glyphicon-calendar:before {
  content: "\e109";
}
.glyphicon-random:before {
  content: "\e110";
}
.glyphicon-comment:before {
  content: "\e111";
}
.glyphicon-magnet:before {
  content: "\e112";
}
.glyphicon-chevron-up:before {
  content: "\e113";
}
.glyphicon-chevron-down:before {
  content: "\e114";
}
.glyphicon-retweet:before {
  content: "\e115";
}
.glyphicon-shopping-cart:before {
  content: "\e116";
}
.glyphicon-folder-close:before {
  content: "\e117";
}
.glyphicon-folder-open:before {
  content: "\e118";
}
.glyphicon-resize-vertical:before {
  content: "\e119";
}
.glyphicon-resize-horizontal:before {
  content: "\e120";
}
.glyphicon-hdd:before {
  content: "\e121";
}
.glyphicon-bullhorn:before {
  content: "\e122";
}
.glyphicon-bell:before {
  content: "\e123";
}
.glyphicon-certificate:before {
  content: "\e124";
}
.glyphicon-thumbs-up:before {
  content: "\e125";
}
.glyphicon-thumbs-down:before {
  content: "\e126";
}
.glyphicon-hand-right:before {
  content: "\e127";
}
.glyphicon-hand-left:before {
  content: "\e128";
}
.glyphicon-hand-up:before {
  content: "\e129";
}
.glyphicon-hand-down:before {
  content: "\e130";
}
.glyphicon-circle-arrow-right:before {
  content: "\e131";
}
.glyphicon-circle-arrow-left:before {
  content: "\e132";
}
.glyphicon-circle-arrow-up:before {
  content: "\e133";
}
.glyphicon-circle-arrow-down:before {
  content: "\e134";
}
.glyphicon-globe:before {
  content: "\e135";
}
.glyphicon-wrench:before {
  content: "\e136";
}
.glyphicon-tasks:before {
  content: "\e137";
}
.glyphicon-filter:before {
  content: "\e138";
}
.glyphicon-briefcase:before {
  content: "\e139";
}
.glyphicon-fullscreen:before {
  content: "\e140";
}
.glyphicon-dashboard:before {
  content: "\e141";
}
.glyphicon-paperclip:before {
  content: "\e142";
}
.glyphicon-heart-empty:before {
  content: "\e143";
}
.glyphicon-link:before {
  content: "\e144";
}
.glyphicon-phone:before {
  content: "\e145";
}
.glyphicon-pushpin:before {
  content: "\e146";
}
.glyphicon-usd:before {
  content: "\e148";
}
.glyphicon-gbp:before {
  content: "\e149";
}
.glyphicon-sort:before {
  content: "\e150";
}
.glyphicon-sort-by-alphabet:before {
  content: "\e151";
}
.glyphicon-sort-by-alphabet-alt:before {
  content: "\e152";
}
.glyphicon-sort-by-order:before {
  content: "\e153";
}
.glyphicon-sort-by-order-alt:before {
  content: "\e154";
}
.glyphicon-sort-by-attributes:before {
  content: "\e155";
}
.glyphicon-sort-by-attributes-alt:before {
  content: "\e156";
}
.glyphicon-unchecked:before {
  content: "\e157";
}
.glyphicon-expand:before {
  content: "\e158";
}
.glyphicon-collapse-down:before {
  content: "\e159";
}
.glyphicon-collapse-up:before {
  content: "\e160";
}
.glyphicon-log-in:before {
  content: "\e161";
}
.glyphicon-flash:before {
  content: "\e162";
}
.glyphicon-log-out:before {
  content: "\e163";
}
.glyphicon-new-window:before {
  content: "\e164";
}
.glyphicon-record:before {
  content: "\e165";
}
.glyphicon-save:before {
  content: "\e166";
}
.glyphicon-open:before {
  content: "\e167";
}
.glyphicon-saved:before {
  content: "\e168";
}
.glyphicon-import:before {
  content: "\e169";
}
.glyphicon-export:before {
  content: "\e170";
}
.glyphicon-send:before {
  content: "\e171";
}
.glyphicon-floppy-disk:before {
  content: "\e172";
}
.glyphicon-floppy-saved:before {
  content: "\e173";
}
.glyphicon-floppy-remove:before {
  content: "\e174";
}
.glyphicon-floppy-save:before {
  content: "\e175";
}
.glyphicon-floppy-open:before {
  content: "\e176";
}
.glyphicon-credit-card:before {
  content: "\e177";
}
.glyphicon-transfer:before {
  content: "\e178";
}
.glyphicon-cutlery:before {
  content: "\e179";
}
.glyphicon-header:before {
  content: "\e180";
}
.glyphicon-compressed:before {
  content: "\e181";
}
.glyphicon-earphone:before {
  content: "\e182";
}
.glyphicon-phone-alt:before {
  content: "\e183";
}
.glyphicon-tower:before {
  content: "\e184";
}
.glyphicon-stats:before {
  content: "\e185";
}
.glyphicon-sd-video:before {
  content: "\e186";
}
.glyphicon-hd-video:before {
  content: "\e187";
}
.glyphicon-subtitles:before {
  content: "\e188";
}
.glyphicon-sound-stereo:before {
  content: "\e189";
}
.glyphicon-sound-dolby:before {
  content: "\e190";
}
.glyphicon-sound-5-1:before {
  content: "\e191";
}
.glyphicon-sound-6-1:before {
  content: "\e192";
}
.glyphicon-sound-7-1:before {
  content: "\e193";
}
.glyphicon-copyright-mark:before {
  content: "\e194";
}
.glyphicon-registration-mark:before {
  content: "\e195";
}
.glyphicon-cloud-download:before {
  content: "\e197";
}
.glyphicon-cloud-upload:before {
  content: "\e198";
}
.glyphicon-tree-conifer:before {
  content: "\e199";
}
.glyphicon-tree-deciduous:before {
  content: "\e200";
}
.glyphicon-cd:before {
  content: "\e201";
}
.glyphicon-save-file:before {
  content: "\e202";
}
.glyphicon-open-file:before {
  content: "\e203";
}
.glyphicon-level-up:before {
  content: "\e204";
}
.glyphicon-copy:before {
  content: "\e205";
}
.glyphicon-paste:before {
  content: "\e206";
}
.glyphicon-alert:before {
  content: "\e209";
}
.glyphicon-equalizer:before {
  content: "\e210";
}
.glyphicon-king:before {
  content: "\e211";
}
.glyphicon-queen:before {
  content: "\e212";
}
.glyphicon-pawn:before {
  content: "\e213";
}
.glyphicon-bishop:before {
  content: "\e214";
}
.glyphicon-knight:before {
  content: "\e215";
}
.glyphicon-baby-formula:before {
  content: "\e216";
}
.glyphicon-tent:before {
  content: "\26fa";
}
.glyphicon-blackboard:before {
  content: "\e218";
}
.glyphicon-bed:before {
  content: "\e219";
}
.glyphicon-apple:before {
  content: "\f8ff";
}
.glyphicon-erase:before {
  content: "\e221";
}
.glyphicon-hourglass:before {
  content: "\231b";
}
.glyphicon-lamp:before {
  content: "\e223";
}
.glyphicon-duplicate:before {
  content: "\e224";
}
.glyphicon-piggy-bank:before {
  content: "\e225";
}
.glyphicon-scissors:before {
  content: "\e226";
}
.glyphicon-bitcoin:before {
  content: "\e227";
}
.glyphicon-btc:before {
  content: "\e227";
}
.glyphicon-xbt:before {
  content: "\e227";
}
.glyphicon-yen:before {
  content: "\00a5";
}
.glyphicon-jpy:before {
  content: "\00a5";
}
.glyphicon-ruble:before {
  content: "\20bd";
}
.glyphicon-rub:before {
  content: "\20bd";
}
.glyphicon-scale:before {
  content: "\e230";
}
.glyphicon-ice-lolly:before {
  content: "\e231";
}
.glyphicon-ice-lolly-tasted:before {
  content: "\e232";
}
.glyphicon-education:before {
  content: "\e233";
}
.glyphicon-option-horizontal:before {
  content: "\e234";
}
.glyphicon-option-vertical:before {
  content: "\e235";
}
.glyphicon-menu-hamburger:before {
  content: "\e236";
}
.glyphicon-modal-window:before {
  content: "\e237";
}
.glyphicon-oil:before {
  content: "\e238";
}
.glyphicon-grain:before {
  content: "\e239";
}
.glyphicon-sunglasses:before {
  content: "\e240";
}
.glyphicon-text-size:before {
  content: "\e241";
}
.glyphicon-text-color:before {
  content: "\e242";
}
.glyphicon-text-background:before {
  content: "\e243";
}
.glyphicon-object-align-top:before {
  content: "\e244";
}
.glyphicon-object-align-bottom:before {
  content: "\e245";
}
.glyphicon-object-align-horizontal:before {
  content: "\e246";
}
.glyphicon-object-align-left:before {
  content: "\e247";
}
.glyphicon-object-align-vertical:before {
  content: "\e248";
}
.glyphicon-object-align-right:before {
  content: "\e249";
}
.glyphicon-triangle-right:before {
  content: "\e250";
}
.glyphicon-triangle-left:before {
  content: "\e251";
}
.glyphicon-triangle-bottom:before {
  content: "\e252";
}
.glyphicon-triangle-top:before {
  content: "\e253";
}
.glyphicon-console:before {
  content: "\e254";
}
.glyphicon-superscript:before {
  content: "\e255";
}
.glyphicon-subscript:before {
  content: "\e256";
}
.glyphicon-menu-left:before {
  content: "\e257";
}
.glyphicon-menu-right:before {
  content: "\e258";
}
.glyphicon-menu-down:before {
  content: "\e259";
}
.glyphicon-menu-up:before {
  content: "\e260";
}
* {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
*:before,
*:after {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
html {
  font-size: 10px;
  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}
body {
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  line-height: 1.42857143;
  color: #000;
  background-color: #fff;
}
input,
button,
select,
textarea {
  font-family: inherit;
  font-size: inherit;
  line-height: inherit;
}
a {
  color: #337ab7;
  text-decoration: none;
}
a:hover,
a:focus {
  color: #23527c;
  text-decoration: underline;
}
a:focus {
  outline: thin dotted;
  outline: 5px auto -webkit-focus-ring-color;
  outline-offset: -2px;
}
figure {
  margin: 0;
}
img {
  vertical-align: middle;
}
.img-responsive,
.thumbnail > img,
.thumbnail a > img,
.carousel-inner > .item > img,
.carousel-inner > .item > a > img {
  display: block;
  max-width: 100%;
  height: auto;
}
.img-rounded {
  border-radius: 3px;
}
.img-thumbnail {
  padding: 4px;
  line-height: 1.42857143;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 2px;
  -webkit-transition: all 0.2s ease-in-out;
  -o-transition: all 0.2s ease-in-out;
  transition: all 0.2s ease-in-out;
  display: inline-block;
  max-width: 100%;
  height: auto;
}
.img-circle {
  border-radius: 50%;
}
hr {
  margin-top: 18px;
  margin-bottom: 18px;
  border: 0;
  border-top: 1px solid #eeeeee;
}
.sr-only {
  position: absolute;
  width: 1px;
  height: 1px;
  margin: -1px;
  padding: 0;
  overflow: hidden;
  clip: rect(0, 0, 0, 0);
  border: 0;
}
.sr-only-focusable:active,
.sr-only-focusable:focus {
  position: static;
  width: auto;
  height: auto;
  margin: 0;
  overflow: visible;
  clip: auto;
}
[role="button"] {
  cursor: pointer;
}
h1,
h2,
h3,
h4,
h5,
h6,
.h1,
.h2,
.h3,
.h4,
.h5,
.h6 {
  font-family: inherit;
  font-weight: 500;
  line-height: 1.1;
  color: inherit;
}
h1 small,
h2 small,
h3 small,
h4 small,
h5 small,
h6 small,
.h1 small,
.h2 small,
.h3 small,
.h4 small,
.h5 small,
.h6 small,
h1 .small,
h2 .small,
h3 .small,
h4 .small,
h5 .small,
h6 .small,
.h1 .small,
.h2 .small,
.h3 .small,
.h4 .small,
.h5 .small,
.h6 .small {
  font-weight: normal;
  line-height: 1;
  color: #777777;
}
h1,
.h1,
h2,
.h2,
h3,
.h3 {
  margin-top: 18px;
  margin-bottom: 9px;
}
h1 small,
.h1 small,
h2 small,
.h2 small,
h3 small,
.h3 small,
h1 .small,
.h1 .small,
h2 .small,
.h2 .small,
h3 .small,
.h3 .small {
  font-size: 65%;
}
h4,
.h4,
h5,
.h5,
h6,
.h6 {
  margin-top: 9px;
  margin-bottom: 9px;
}
h4 small,
.h4 small,
h5 small,
.h5 small,
h6 small,
.h6 small,
h4 .small,
.h4 .small,
h5 .small,
.h5 .small,
h6 .small,
.h6 .small {
  font-size: 75%;
}
h1,
.h1 {
  font-size: 33px;
}
h2,
.h2 {
  font-size: 27px;
}
h3,
.h3 {
  font-size: 23px;
}
h4,
.h4 {
  font-size: 17px;
}
h5,
.h5 {
  font-size: 13px;
}
h6,
.h6 {
  font-size: 12px;
}
p {
  margin: 0 0 9px;
}
.lead {
  margin-bottom: 18px;
  font-size: 14px;
  font-weight: 300;
  line-height: 1.4;
}
@media (min-width: 768px) {
  .lead {
    font-size: 19.5px;
  }
}
small,
.small {
  font-size: 92%;
}
mark,
.mark {
  background-color: #fcf8e3;
  padding: .2em;
}
.text-left {
  text-align: left;
}
.text-right {
  text-align: right;
}
.text-center {
  text-align: center;
}
.text-justify {
  text-align: justify;
}
.text-nowrap {
  white-space: nowrap;
}
.text-lowercase {
  text-transform: lowercase;
}
.text-uppercase {
  text-transform: uppercase;
}
.text-capitalize {
  text-transform: capitalize;
}
.text-muted {
  color: #777777;
}
.text-primary {
  color: #337ab7;
}
a.text-primary:hover,
a.text-primary:focus {
  color: #286090;
}
.text-success {
  color: #3c763d;
}
a.text-success:hover,
a.text-success:focus {
  color: #2b542c;
}
.text-info {
  color: #31708f;
}
a.text-info:hover,
a.text-info:focus {
  color: #245269;
}
.text-warning {
  color: #8a6d3b;
}
a.text-warning:hover,
a.text-warning:focus {
  color: #66512c;
}
.text-danger {
  color: #a94442;
}
a.text-danger:hover,
a.text-danger:focus {
  color: #843534;
}
.bg-primary {
  color: #fff;
  background-color: #337ab7;
}
a.bg-primary:hover,
a.bg-primary:focus {
  background-color: #286090;
}
.bg-success {
  background-color: #dff0d8;
}
a.bg-success:hover,
a.bg-success:focus {
  background-color: #c1e2b3;
}
.bg-info {
  background-color: #d9edf7;
}
a.bg-info:hover,
a.bg-info:focus {
  background-color: #afd9ee;
}
.bg-warning {
  background-color: #fcf8e3;
}
a.bg-warning:hover,
a.bg-warning:focus {
  background-color: #f7ecb5;
}
.bg-danger {
  background-color: #f2dede;
}
a.bg-danger:hover,
a.bg-danger:focus {
  background-color: #e4b9b9;
}
.page-header {
  padding-bottom: 8px;
  margin: 36px 0 18px;
  border-bottom: 1px solid #eeeeee;
}
ul,
ol {
  margin-top: 0;
  margin-bottom: 9px;
}
ul ul,
ol ul,
ul ol,
ol ol {
  margin-bottom: 0;
}
.list-unstyled {
  padding-left: 0;
  list-style: none;
}
.list-inline {
  padding-left: 0;
  list-style: none;
  margin-left: -5px;
}
.list-inline > li {
  display: inline-block;
  padding-left: 5px;
  padding-right: 5px;
}
dl {
  margin-top: 0;
  margin-bottom: 18px;
}
dt,
dd {
  line-height: 1.42857143;
}
dt {
  font-weight: bold;
}
dd {
  margin-left: 0;
}
@media (min-width: 541px) {
  .dl-horizontal dt {
    float: left;
    width: 160px;
    clear: left;
    text-align: right;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
  }
  .dl-horizontal dd {
    margin-left: 180px;
  }
}
abbr[title],
abbr[data-original-title] {
  cursor: help;
  border-bottom: 1px dotted #777777;
}
.initialism {
  font-size: 90%;
  text-transform: uppercase;
}
blockquote {
  padding: 9px 18px;
  margin: 0 0 18px;
  font-size: inherit;
  border-left: 5px solid #eeeeee;
}
blockquote p:last-child,
blockquote ul:last-child,
blockquote ol:last-child {
  margin-bottom: 0;
}
blockquote footer,
blockquote small,
blockquote .small {
  display: block;
  font-size: 80%;
  line-height: 1.42857143;
  color: #777777;
}
blockquote footer:before,
blockquote small:before,
blockquote .small:before {
  content: '\2014 \00A0';
}
.blockquote-reverse,
blockquote.pull-right {
  padding-right: 15px;
  padding-left: 0;
  border-right: 5px solid #eeeeee;
  border-left: 0;
  text-align: right;
}
.blockquote-reverse footer:before,
blockquote.pull-right footer:before,
.blockquote-reverse small:before,
blockquote.pull-right small:before,
.blockquote-reverse .small:before,
blockquote.pull-right .small:before {
  content: '';
}
.blockquote-reverse footer:after,
blockquote.pull-right footer:after,
.blockquote-reverse small:after,
blockquote.pull-right small:after,
.blockquote-reverse .small:after,
blockquote.pull-right .small:after {
  content: '\00A0 \2014';
}
address {
  margin-bottom: 18px;
  font-style: normal;
  line-height: 1.42857143;
}
code,
kbd,
pre,
samp {
  font-family: monospace;
}
code {
  padding: 2px 4px;
  font-size: 90%;
  color: #c7254e;
  background-color: #f9f2f4;
  border-radius: 2px;
}
kbd {
  padding: 2px 4px;
  font-size: 90%;
  color: #888;
  background-color: transparent;
  border-radius: 1px;
  box-shadow: inset 0 -1px 0 rgba(0, 0, 0, 0.25);
}
kbd kbd {
  padding: 0;
  font-size: 100%;
  font-weight: bold;
  box-shadow: none;
}
pre {
  display: block;
  padding: 8.5px;
  margin: 0 0 9px;
  font-size: 12px;
  line-height: 1.42857143;
  word-break: break-all;
  word-wrap: break-word;
  color: #333333;
  background-color: #f5f5f5;
  border: 1px solid #ccc;
  border-radius: 2px;
}
pre code {
  padding: 0;
  font-size: inherit;
  color: inherit;
  white-space: pre-wrap;
  background-color: transparent;
  border-radius: 0;
}
.pre-scrollable {
  max-height: 340px;
  overflow-y: scroll;
}
.container {
  margin-right: auto;
  margin-left: auto;
  padding-left: 0px;
  padding-right: 0px;
}
@media (min-width: 768px) {
  .container {
    width: 768px;
  }
}
@media (min-width: 992px) {
  .container {
    width: 940px;
  }
}
@media (min-width: 1200px) {
  .container {
    width: 1140px;
  }
}
.container-fluid {
  margin-right: auto;
  margin-left: auto;
  padding-left: 0px;
  padding-right: 0px;
}
.row {
  margin-left: 0px;
  margin-right: 0px;
}
.col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {
  position: relative;
  min-height: 1px;
  padding-left: 0px;
  padding-right: 0px;
}
.col-xs-1, .col-xs-2, .col-xs-3, .col-xs-4, .col-xs-5, .col-xs-6, .col-xs-7, .col-xs-8, .col-xs-9, .col-xs-10, .col-xs-11, .col-xs-12 {
  float: left;
}
.col-xs-12 {
  width: 100%;
}
.col-xs-11 {
  width: 91.66666667%;
}
.col-xs-10 {
  width: 83.33333333%;
}
.col-xs-9 {
  width: 75%;
}
.col-xs-8 {
  width: 66.66666667%;
}
.col-xs-7 {
  width: 58.33333333%;
}
.col-xs-6 {
  width: 50%;
}
.col-xs-5 {
  width: 41.66666667%;
}
.col-xs-4 {
  width: 33.33333333%;
}
.col-xs-3 {
  width: 25%;
}
.col-xs-2 {
  width: 16.66666667%;
}
.col-xs-1 {
  width: 8.33333333%;
}
.col-xs-pull-12 {
  right: 100%;
}
.col-xs-pull-11 {
  right: 91.66666667%;
}
.col-xs-pull-10 {
  right: 83.33333333%;
}
.col-xs-pull-9 {
  right: 75%;
}
.col-xs-pull-8 {
  right: 66.66666667%;
}
.col-xs-pull-7 {
  right: 58.33333333%;
}
.col-xs-pull-6 {
  right: 50%;
}
.col-xs-pull-5 {
  right: 41.66666667%;
}
.col-xs-pull-4 {
  right: 33.33333333%;
}
.col-xs-pull-3 {
  right: 25%;
}
.col-xs-pull-2 {
  right: 16.66666667%;
}
.col-xs-pull-1 {
  right: 8.33333333%;
}
.col-xs-pull-0 {
  right: auto;
}
.col-xs-push-12 {
  left: 100%;
}
.col-xs-push-11 {
  left: 91.66666667%;
}
.col-xs-push-10 {
  left: 83.33333333%;
}
.col-xs-push-9 {
  left: 75%;
}
.col-xs-push-8 {
  left: 66.66666667%;
}
.col-xs-push-7 {
  left: 58.33333333%;
}
.col-xs-push-6 {
  left: 50%;
}
.col-xs-push-5 {
  left: 41.66666667%;
}
.col-xs-push-4 {
  left: 33.33333333%;
}
.col-xs-push-3 {
  left: 25%;
}
.col-xs-push-2 {
  left: 16.66666667%;
}
.col-xs-push-1 {
  left: 8.33333333%;
}
.col-xs-push-0 {
  left: auto;
}
.col-xs-offset-12 {
  margin-left: 100%;
}
.col-xs-offset-11 {
  margin-left: 91.66666667%;
}
.col-xs-offset-10 {
  margin-left: 83.33333333%;
}
.col-xs-offset-9 {
  margin-left: 75%;
}
.col-xs-offset-8 {
  margin-left: 66.66666667%;
}
.col-xs-offset-7 {
  margin-left: 58.33333333%;
}
.col-xs-offset-6 {
  margin-left: 50%;
}
.col-xs-offset-5 {
  margin-left: 41.66666667%;
}
.col-xs-offset-4 {
  margin-left: 33.33333333%;
}
.col-xs-offset-3 {
  margin-left: 25%;
}
.col-xs-offset-2 {
  margin-left: 16.66666667%;
}
.col-xs-offset-1 {
  margin-left: 8.33333333%;
}
.col-xs-offset-0 {
  margin-left: 0%;
}
@media (min-width: 768px) {
  .col-sm-1, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6, .col-sm-7, .col-sm-8, .col-sm-9, .col-sm-10, .col-sm-11, .col-sm-12 {
    float: left;
  }
  .col-sm-12 {
    width: 100%;
  }
  .col-sm-11 {
    width: 91.66666667%;
  }
  .col-sm-10 {
    width: 83.33333333%;
  }
  .col-sm-9 {
    width: 75%;
  }
  .col-sm-8 {
    width: 66.66666667%;
  }
  .col-sm-7 {
    width: 58.33333333%;
  }
  .col-sm-6 {
    width: 50%;
  }
  .col-sm-5 {
    width: 41.66666667%;
  }
  .col-sm-4 {
    width: 33.33333333%;
  }
  .col-sm-3 {
    width: 25%;
  }
  .col-sm-2 {
    width: 16.66666667%;
  }
  .col-sm-1 {
    width: 8.33333333%;
  }
  .col-sm-pull-12 {
    right: 100%;
  }
  .col-sm-pull-11 {
    right: 91.66666667%;
  }
  .col-sm-pull-10 {
    right: 83.33333333%;
  }
  .col-sm-pull-9 {
    right: 75%;
  }
  .col-sm-pull-8 {
    right: 66.66666667%;
  }
  .col-sm-pull-7 {
    right: 58.33333333%;
  }
  .col-sm-pull-6 {
    right: 50%;
  }
  .col-sm-pull-5 {
    right: 41.66666667%;
  }
  .col-sm-pull-4 {
    right: 33.33333333%;
  }
  .col-sm-pull-3 {
    right: 25%;
  }
  .col-sm-pull-2 {
    right: 16.66666667%;
  }
  .col-sm-pull-1 {
    right: 8.33333333%;
  }
  .col-sm-pull-0 {
    right: auto;
  }
  .col-sm-push-12 {
    left: 100%;
  }
  .col-sm-push-11 {
    left: 91.66666667%;
  }
  .col-sm-push-10 {
    left: 83.33333333%;
  }
  .col-sm-push-9 {
    left: 75%;
  }
  .col-sm-push-8 {
    left: 66.66666667%;
  }
  .col-sm-push-7 {
    left: 58.33333333%;
  }
  .col-sm-push-6 {
    left: 50%;
  }
  .col-sm-push-5 {
    left: 41.66666667%;
  }
  .col-sm-push-4 {
    left: 33.33333333%;
  }
  .col-sm-push-3 {
    left: 25%;
  }
  .col-sm-push-2 {
    left: 16.66666667%;
  }
  .col-sm-push-1 {
    left: 8.33333333%;
  }
  .col-sm-push-0 {
    left: auto;
  }
  .col-sm-offset-12 {
    margin-left: 100%;
  }
  .col-sm-offset-11 {
    margin-left: 91.66666667%;
  }
  .col-sm-offset-10 {
    margin-left: 83.33333333%;
  }
  .col-sm-offset-9 {
    margin-left: 75%;
  }
  .col-sm-offset-8 {
    margin-left: 66.66666667%;
  }
  .col-sm-offset-7 {
    margin-left: 58.33333333%;
  }
  .col-sm-offset-6 {
    margin-left: 50%;
  }
  .col-sm-offset-5 {
    margin-left: 41.66666667%;
  }
  .col-sm-offset-4 {
    margin-left: 33.33333333%;
  }
  .col-sm-offset-3 {
    margin-left: 25%;
  }
  .col-sm-offset-2 {
    margin-left: 16.66666667%;
  }
  .col-sm-offset-1 {
    margin-left: 8.33333333%;
  }
  .col-sm-offset-0 {
    margin-left: 0%;
  }
}
@media (min-width: 992px) {
  .col-md-1, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-10, .col-md-11, .col-md-12 {
    float: left;
  }
  .col-md-12 {
    width: 100%;
  }
  .col-md-11 {
    width: 91.66666667%;
  }
  .col-md-10 {
    width: 83.33333333%;
  }
  .col-md-9 {
    width: 75%;
  }
  .col-md-8 {
    width: 66.66666667%;
  }
  .col-md-7 {
    width: 58.33333333%;
  }
  .col-md-6 {
    width: 50%;
  }
  .col-md-5 {
    width: 41.66666667%;
  }
  .col-md-4 {
    width: 33.33333333%;
  }
  .col-md-3 {
    width: 25%;
  }
  .col-md-2 {
    width: 16.66666667%;
  }
  .col-md-1 {
    width: 8.33333333%;
  }
  .col-md-pull-12 {
    right: 100%;
  }
  .col-md-pull-11 {
    right: 91.66666667%;
  }
  .col-md-pull-10 {
    right: 83.33333333%;
  }
  .col-md-pull-9 {
    right: 75%;
  }
  .col-md-pull-8 {
    right: 66.66666667%;
  }
  .col-md-pull-7 {
    right: 58.33333333%;
  }
  .col-md-pull-6 {
    right: 50%;
  }
  .col-md-pull-5 {
    right: 41.66666667%;
  }
  .col-md-pull-4 {
    right: 33.33333333%;
  }
  .col-md-pull-3 {
    right: 25%;
  }
  .col-md-pull-2 {
    right: 16.66666667%;
  }
  .col-md-pull-1 {
    right: 8.33333333%;
  }
  .col-md-pull-0 {
    right: auto;
  }
  .col-md-push-12 {
    left: 100%;
  }
  .col-md-push-11 {
    left: 91.66666667%;
  }
  .col-md-push-10 {
    left: 83.33333333%;
  }
  .col-md-push-9 {
    left: 75%;
  }
  .col-md-push-8 {
    left: 66.66666667%;
  }
  .col-md-push-7 {
    left: 58.33333333%;
  }
  .col-md-push-6 {
    left: 50%;
  }
  .col-md-push-5 {
    left: 41.66666667%;
  }
  .col-md-push-4 {
    left: 33.33333333%;
  }
  .col-md-push-3 {
    left: 25%;
  }
  .col-md-push-2 {
    left: 16.66666667%;
  }
  .col-md-push-1 {
    left: 8.33333333%;
  }
  .col-md-push-0 {
    left: auto;
  }
  .col-md-offset-12 {
    margin-left: 100%;
  }
  .col-md-offset-11 {
    margin-left: 91.66666667%;
  }
  .col-md-offset-10 {
    margin-left: 83.33333333%;
  }
  .col-md-offset-9 {
    margin-left: 75%;
  }
  .col-md-offset-8 {
    margin-left: 66.66666667%;
  }
  .col-md-offset-7 {
    margin-left: 58.33333333%;
  }
  .col-md-offset-6 {
    margin-left: 50%;
  }
  .col-md-offset-5 {
    margin-left: 41.66666667%;
  }
  .col-md-offset-4 {
    margin-left: 33.33333333%;
  }
  .col-md-offset-3 {
    margin-left: 25%;
  }
  .col-md-offset-2 {
    margin-left: 16.66666667%;
  }
  .col-md-offset-1 {
    margin-left: 8.33333333%;
  }
  .col-md-offset-0 {
    margin-left: 0%;
  }
}
@media (min-width: 1200px) {
  .col-lg-1, .col-lg-2, .col-lg-3, .col-lg-4, .col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-10, .col-lg-11, .col-lg-12 {
    float: left;
  }
  .col-lg-12 {
    width: 100%;
  }
  .col-lg-11 {
    width: 91.66666667%;
  }
  .col-lg-10 {
    width: 83.33333333%;
  }
  .col-lg-9 {
    width: 75%;
  }
  .col-lg-8 {
    width: 66.66666667%;
  }
  .col-lg-7 {
    width: 58.33333333%;
  }
  .col-lg-6 {
    width: 50%;
  }
  .col-lg-5 {
    width: 41.66666667%;
  }
  .col-lg-4 {
    width: 33.33333333%;
  }
  .col-lg-3 {
    width: 25%;
  }
  .col-lg-2 {
    width: 16.66666667%;
  }
  .col-lg-1 {
    width: 8.33333333%;
  }
  .col-lg-pull-12 {
    right: 100%;
  }
  .col-lg-pull-11 {
    right: 91.66666667%;
  }
  .col-lg-pull-10 {
    right: 83.33333333%;
  }
  .col-lg-pull-9 {
    right: 75%;
  }
  .col-lg-pull-8 {
    right: 66.66666667%;
  }
  .col-lg-pull-7 {
    right: 58.33333333%;
  }
  .col-lg-pull-6 {
    right: 50%;
  }
  .col-lg-pull-5 {
    right: 41.66666667%;
  }
  .col-lg-pull-4 {
    right: 33.33333333%;
  }
  .col-lg-pull-3 {
    right: 25%;
  }
  .col-lg-pull-2 {
    right: 16.66666667%;
  }
  .col-lg-pull-1 {
    right: 8.33333333%;
  }
  .col-lg-pull-0 {
    right: auto;
  }
  .col-lg-push-12 {
    left: 100%;
  }
  .col-lg-push-11 {
    left: 91.66666667%;
  }
  .col-lg-push-10 {
    left: 83.33333333%;
  }
  .col-lg-push-9 {
    left: 75%;
  }
  .col-lg-push-8 {
    left: 66.66666667%;
  }
  .col-lg-push-7 {
    left: 58.33333333%;
  }
  .col-lg-push-6 {
    left: 50%;
  }
  .col-lg-push-5 {
    left: 41.66666667%;
  }
  .col-lg-push-4 {
    left: 33.33333333%;
  }
  .col-lg-push-3 {
    left: 25%;
  }
  .col-lg-push-2 {
    left: 16.66666667%;
  }
  .col-lg-push-1 {
    left: 8.33333333%;
  }
  .col-lg-push-0 {
    left: auto;
  }
  .col-lg-offset-12 {
    margin-left: 100%;
  }
  .col-lg-offset-11 {
    margin-left: 91.66666667%;
  }
  .col-lg-offset-10 {
    margin-left: 83.33333333%;
  }
  .col-lg-offset-9 {
    margin-left: 75%;
  }
  .col-lg-offset-8 {
    margin-left: 66.66666667%;
  }
  .col-lg-offset-7 {
    margin-left: 58.33333333%;
  }
  .col-lg-offset-6 {
    margin-left: 50%;
  }
  .col-lg-offset-5 {
    margin-left: 41.66666667%;
  }
  .col-lg-offset-4 {
    margin-left: 33.33333333%;
  }
  .col-lg-offset-3 {
    margin-left: 25%;
  }
  .col-lg-offset-2 {
    margin-left: 16.66666667%;
  }
  .col-lg-offset-1 {
    margin-left: 8.33333333%;
  }
  .col-lg-offset-0 {
    margin-left: 0%;
  }
}
table {
  background-color: transparent;
}
caption {
  padding-top: 8px;
  padding-bottom: 8px;
  color: #777777;
  text-align: left;
}
th {
  text-align: left;
}
.table {
  width: 100%;
  max-width: 100%;
  margin-bottom: 18px;
}
.table > thead > tr > th,
.table > tbody > tr > th,
.table > tfoot > tr > th,
.table > thead > tr > td,
.table > tbody > tr > td,
.table > tfoot > tr > td {
  padding: 8px;
  line-height: 1.42857143;
  vertical-align: top;
  border-top: 1px solid #ddd;
}
.table > thead > tr > th {
  vertical-align: bottom;
  border-bottom: 2px solid #ddd;
}
.table > caption + thead > tr:first-child > th,
.table > colgroup + thead > tr:first-child > th,
.table > thead:first-child > tr:first-child > th,
.table > caption + thead > tr:first-child > td,
.table > colgroup + thead > tr:first-child > td,
.table > thead:first-child > tr:first-child > td {
  border-top: 0;
}
.table > tbody + tbody {
  border-top: 2px solid #ddd;
}
.table .table {
  background-color: #fff;
}
.table-condensed > thead > tr > th,
.table-condensed > tbody > tr > th,
.table-condensed > tfoot > tr > th,
.table-condensed > thead > tr > td,
.table-condensed > tbody > tr > td,
.table-condensed > tfoot > tr > td {
  padding: 5px;
}
.table-bordered {
  border: 1px solid #ddd;
}
.table-bordered > thead > tr > th,
.table-bordered > tbody > tr > th,
.table-bordered > tfoot > tr > th,
.table-bordered > thead > tr > td,
.table-bordered > tbody > tr > td,
.table-bordered > tfoot > tr > td {
  border: 1px solid #ddd;
}
.table-bordered > thead > tr > th,
.table-bordered > thead > tr > td {
  border-bottom-width: 2px;
}
.table-striped > tbody > tr:nth-of-type(odd) {
  background-color: #f9f9f9;
}
.table-hover > tbody > tr:hover {
  background-color: #f5f5f5;
}
table col[class*="col-"] {
  position: static;
  float: none;
  display: table-column;
}
table td[class*="col-"],
table th[class*="col-"] {
  position: static;
  float: none;
  display: table-cell;
}
.table > thead > tr > td.active,
.table > tbody > tr > td.active,
.table > tfoot > tr > td.active,
.table > thead > tr > th.active,
.table > tbody > tr > th.active,
.table > tfoot > tr > th.active,
.table > thead > tr.active > td,
.table > tbody > tr.active > td,
.table > tfoot > tr.active > td,
.table > thead > tr.active > th,
.table > tbody > tr.active > th,
.table > tfoot > tr.active > th {
  background-color: #f5f5f5;
}
.table-hover > tbody > tr > td.active:hover,
.table-hover > tbody > tr > th.active:hover,
.table-hover > tbody > tr.active:hover > td,
.table-hover > tbody > tr:hover > .active,
.table-hover > tbody > tr.active:hover > th {
  background-color: #e8e8e8;
}
.table > thead > tr > td.success,
.table > tbody > tr > td.success,
.table > tfoot > tr > td.success,
.table > thead > tr > th.success,
.table > tbody > tr > th.success,
.table > tfoot > tr > th.success,
.table > thead > tr.success > td,
.table > tbody > tr.success > td,
.table > tfoot > tr.success > td,
.table > thead > tr.success > th,
.table > tbody > tr.success > th,
.table > tfoot > tr.success > th {
  background-color: #dff0d8;
}
.table-hover > tbody > tr > td.success:hover,
.table-hover > tbody > tr > th.success:hover,
.table-hover > tbody > tr.success:hover > td,
.table-hover > tbody > tr:hover > .success,
.table-hover > tbody > tr.success:hover > th {
  background-color: #d0e9c6;
}
.table > thead > tr > td.info,
.table > tbody > tr > td.info,
.table > tfoot > tr > td.info,
.table > thead > tr > th.info,
.table > tbody > tr > th.info,
.table > tfoot > tr > th.info,
.table > thead > tr.info > td,
.table > tbody > tr.info > td,
.table > tfoot > tr.info > td,
.table > thead > tr.info > th,
.table > tbody > tr.info > th,
.table > tfoot > tr.info > th {
  background-color: #d9edf7;
}
.table-hover > tbody > tr > td.info:hover,
.table-hover > tbody > tr > th.info:hover,
.table-hover > tbody > tr.info:hover > td,
.table-hover > tbody > tr:hover > .info,
.table-hover > tbody > tr.info:hover > th {
  background-color: #c4e3f3;
}
.table > thead > tr > td.warning,
.table > tbody > tr > td.warning,
.table > tfoot > tr > td.warning,
.table > thead > tr > th.warning,
.table > tbody > tr > th.warning,
.table > tfoot > tr > th.warning,
.table > thead > tr.warning > td,
.table > tbody > tr.warning > td,
.table > tfoot > tr.warning > td,
.table > thead > tr.warning > th,
.table > tbody > tr.warning > th,
.table > tfoot > tr.warning > th {
  background-color: #fcf8e3;
}
.table-hover > tbody > tr > td.warning:hover,
.table-hover > tbody > tr > th.warning:hover,
.table-hover > tbody > tr.warning:hover > td,
.table-hover > tbody > tr:hover > .warning,
.table-hover > tbody > tr.warning:hover > th {
  background-color: #faf2cc;
}
.table > thead > tr > td.danger,
.table > tbody > tr > td.danger,
.table > tfoot > tr > td.danger,
.table > thead > tr > th.danger,
.table > tbody > tr > th.danger,
.table > tfoot > tr > th.danger,
.table > thead > tr.danger > td,
.table > tbody > tr.danger > td,
.table > tfoot > tr.danger > td,
.table > thead > tr.danger > th,
.table > tbody > tr.danger > th,
.table > tfoot > tr.danger > th {
  background-color: #f2dede;
}
.table-hover > tbody > tr > td.danger:hover,
.table-hover > tbody > tr > th.danger:hover,
.table-hover > tbody > tr.danger:hover > td,
.table-hover > tbody > tr:hover > .danger,
.table-hover > tbody > tr.danger:hover > th {
  background-color: #ebcccc;
}
.table-responsive {
  overflow-x: auto;
  min-height: 0.01%;
}
@media screen and (max-width: 767px) {
  .table-responsive {
    width: 100%;
    margin-bottom: 13.5px;
    overflow-y: hidden;
    -ms-overflow-style: -ms-autohiding-scrollbar;
    border: 1px solid #ddd;
  }
  .table-responsive > .table {
    margin-bottom: 0;
  }
  .table-responsive > .table > thead > tr > th,
  .table-responsive > .table > tbody > tr > th,
  .table-responsive > .table > tfoot > tr > th,
  .table-responsive > .table > thead > tr > td,
  .table-responsive > .table > tbody > tr > td,
  .table-responsive > .table > tfoot > tr > td {
    white-space: nowrap;
  }
  .table-responsive > .table-bordered {
    border: 0;
  }
  .table-responsive > .table-bordered > thead > tr > th:first-child,
  .table-responsive > .table-bordered > tbody > tr > th:first-child,
  .table-responsive > .table-bordered > tfoot > tr > th:first-child,
  .table-responsive > .table-bordered > thead > tr > td:first-child,
  .table-responsive > .table-bordered > tbody > tr > td:first-child,
  .table-responsive > .table-bordered > tfoot > tr > td:first-child {
    border-left: 0;
  }
  .table-responsive > .table-bordered > thead > tr > th:last-child,
  .table-responsive > .table-bordered > tbody > tr > th:last-child,
  .table-responsive > .table-bordered > tfoot > tr > th:last-child,
  .table-responsive > .table-bordered > thead > tr > td:last-child,
  .table-responsive > .table-bordered > tbody > tr > td:last-child,
  .table-responsive > .table-bordered > tfoot > tr > td:last-child {
    border-right: 0;
  }
  .table-responsive > .table-bordered > tbody > tr:last-child > th,
  .table-responsive > .table-bordered > tfoot > tr:last-child > th,
  .table-responsive > .table-bordered > tbody > tr:last-child > td,
  .table-responsive > .table-bordered > tfoot > tr:last-child > td {
    border-bottom: 0;
  }
}
fieldset {
  padding: 0;
  margin: 0;
  border: 0;
  min-width: 0;
}
legend {
  display: block;
  width: 100%;
  padding: 0;
  margin-bottom: 18px;
  font-size: 19.5px;
  line-height: inherit;
  color: #333333;
  border: 0;
  border-bottom: 1px solid #e5e5e5;
}
label {
  display: inline-block;
  max-width: 100%;
  margin-bottom: 5px;
  font-weight: bold;
}
input[type="search"] {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
input[type="radio"],
input[type="checkbox"] {
  margin: 4px 0 0;
  margin-top: 1px \9;
  line-height: normal;
}
input[type="file"] {
  display: block;
}
input[type="range"] {
  display: block;
  width: 100%;
}
select[multiple],
select[size] {
  height: auto;
}
input[type="file"]:focus,
input[type="radio"]:focus,
input[type="checkbox"]:focus {
  outline: thin dotted;
  outline: 5px auto -webkit-focus-ring-color;
  outline-offset: -2px;
}
output {
  display: block;
  padding-top: 7px;
  font-size: 13px;
  line-height: 1.42857143;
  color: #555555;
}
.form-control {
  display: block;
  width: 100%;
  height: 32px;
  padding: 6px 12px;
  font-size: 13px;
  line-height: 1.42857143;
  color: #555555;
  background-color: #fff;
  background-image: none;
  border: 1px solid #ccc;
  border-radius: 2px;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  -webkit-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
  -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
  transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
}
.form-control:focus {
  border-color: #66afe9;
  outline: 0;
  -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102, 175, 233, 0.6);
  box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102, 175, 233, 0.6);
}
.form-control::-moz-placeholder {
  color: #999;
  opacity: 1;
}
.form-control:-ms-input-placeholder {
  color: #999;
}
.form-control::-webkit-input-placeholder {
  color: #999;
}
.form-control::-ms-expand {
  border: 0;
  background-color: transparent;
}
.form-control[disabled],
.form-control[readonly],
fieldset[disabled] .form-control {
  background-color: #eeeeee;
  opacity: 1;
}
.form-control[disabled],
fieldset[disabled] .form-control {
  cursor: not-allowed;
}
textarea.form-control {
  height: auto;
}
input[type="search"] {
  -webkit-appearance: none;
}
@media screen and (-webkit-min-device-pixel-ratio: 0) {
  input[type="date"].form-control,
  input[type="time"].form-control,
  input[type="datetime-local"].form-control,
  input[type="month"].form-control {
    line-height: 32px;
  }
  input[type="date"].input-sm,
  input[type="time"].input-sm,
  input[type="datetime-local"].input-sm,
  input[type="month"].input-sm,
  .input-group-sm input[type="date"],
  .input-group-sm input[type="time"],
  .input-group-sm input[type="datetime-local"],
  .input-group-sm input[type="month"] {
    line-height: 30px;
  }
  input[type="date"].input-lg,
  input[type="time"].input-lg,
  input[type="datetime-local"].input-lg,
  input[type="month"].input-lg,
  .input-group-lg input[type="date"],
  .input-group-lg input[type="time"],
  .input-group-lg input[type="datetime-local"],
  .input-group-lg input[type="month"] {
    line-height: 45px;
  }
}
.form-group {
  margin-bottom: 15px;
}
.radio,
.checkbox {
  position: relative;
  display: block;
  margin-top: 10px;
  margin-bottom: 10px;
}
.radio label,
.checkbox label {
  min-height: 18px;
  padding-left: 20px;
  margin-bottom: 0;
  font-weight: normal;
  cursor: pointer;
}
.radio input[type="radio"],
.radio-inline input[type="radio"],
.checkbox input[type="checkbox"],
.checkbox-inline input[type="checkbox"] {
  position: absolute;
  margin-left: -20px;
  margin-top: 4px \9;
}
.radio + .radio,
.checkbox + .checkbox {
  margin-top: -5px;
}
.radio-inline,
.checkbox-inline {
  position: relative;
  display: inline-block;
  padding-left: 20px;
  margin-bottom: 0;
  vertical-align: middle;
  font-weight: normal;
  cursor: pointer;
}
.radio-inline + .radio-inline,
.checkbox-inline + .checkbox-inline {
  margin-top: 0;
  margin-left: 10px;
}
input[type="radio"][disabled],
input[type="checkbox"][disabled],
input[type="radio"].disabled,
input[type="checkbox"].disabled,
fieldset[disabled] input[type="radio"],
fieldset[disabled] input[type="checkbox"] {
  cursor: not-allowed;
}
.radio-inline.disabled,
.checkbox-inline.disabled,
fieldset[disabled] .radio-inline,
fieldset[disabled] .checkbox-inline {
  cursor: not-allowed;
}
.radio.disabled label,
.checkbox.disabled label,
fieldset[disabled] .radio label,
fieldset[disabled] .checkbox label {
  cursor: not-allowed;
}
.form-control-static {
  padding-top: 7px;
  padding-bottom: 7px;
  margin-bottom: 0;
  min-height: 31px;
}
.form-control-static.input-lg,
.form-control-static.input-sm {
  padding-left: 0;
  padding-right: 0;
}
.input-sm {
  height: 30px;
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
}
select.input-sm {
  height: 30px;
  line-height: 30px;
}
textarea.input-sm,
select[multiple].input-sm {
  height: auto;
}
.form-group-sm .form-control {
  height: 30px;
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
}
.form-group-sm select.form-control {
  height: 30px;
  line-height: 30px;
}
.form-group-sm textarea.form-control,
.form-group-sm select[multiple].form-control {
  height: auto;
}
.form-group-sm .form-control-static {
  height: 30px;
  min-height: 30px;
  padding: 6px 10px;
  font-size: 12px;
  line-height: 1.5;
}
.input-lg {
  height: 45px;
  padding: 10px 16px;
  font-size: 17px;
  line-height: 1.3333333;
  border-radius: 3px;
}
select.input-lg {
  height: 45px;
  line-height: 45px;
}
textarea.input-lg,
select[multiple].input-lg {
  height: auto;
}
.form-group-lg .form-control {
  height: 45px;
  padding: 10px 16px;
  font-size: 17px;
  line-height: 1.3333333;
  border-radius: 3px;
}
.form-group-lg select.form-control {
  height: 45px;
  line-height: 45px;
}
.form-group-lg textarea.form-control,
.form-group-lg select[multiple].form-control {
  height: auto;
}
.form-group-lg .form-control-static {
  height: 45px;
  min-height: 35px;
  padding: 11px 16px;
  font-size: 17px;
  line-height: 1.3333333;
}
.has-feedback {
  position: relative;
}
.has-feedback .form-control {
  padding-right: 40px;
}
.form-control-feedback {
  position: absolute;
  top: 0;
  right: 0;
  z-index: 2;
  display: block;
  width: 32px;
  height: 32px;
  line-height: 32px;
  text-align: center;
  pointer-events: none;
}
.input-lg + .form-control-feedback,
.input-group-lg + .form-control-feedback,
.form-group-lg .form-control + .form-control-feedback {
  width: 45px;
  height: 45px;
  line-height: 45px;
}
.input-sm + .form-control-feedback,
.input-group-sm + .form-control-feedback,
.form-group-sm .form-control + .form-control-feedback {
  width: 30px;
  height: 30px;
  line-height: 30px;
}
.has-success .help-block,
.has-success .control-label,
.has-success .radio,
.has-success .checkbox,
.has-success .radio-inline,
.has-success .checkbox-inline,
.has-success.radio label,
.has-success.checkbox label,
.has-success.radio-inline label,
.has-success.checkbox-inline label {
  color: #3c763d;
}
.has-success .form-control {
  border-color: #3c763d;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
}
.has-success .form-control:focus {
  border-color: #2b542c;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #67b168;
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #67b168;
}
.has-success .input-group-addon {
  color: #3c763d;
  border-color: #3c763d;
  background-color: #dff0d8;
}
.has-success .form-control-feedback {
  color: #3c763d;
}
.has-warning .help-block,
.has-warning .control-label,
.has-warning .radio,
.has-warning .checkbox,
.has-warning .radio-inline,
.has-warning .checkbox-inline,
.has-warning.radio label,
.has-warning.checkbox label,
.has-warning.radio-inline label,
.has-warning.checkbox-inline label {
  color: #8a6d3b;
}
.has-warning .form-control {
  border-color: #8a6d3b;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
}
.has-warning .form-control:focus {
  border-color: #66512c;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #c0a16b;
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #c0a16b;
}
.has-warning .input-group-addon {
  color: #8a6d3b;
  border-color: #8a6d3b;
  background-color: #fcf8e3;
}
.has-warning .form-control-feedback {
  color: #8a6d3b;
}
.has-error .help-block,
.has-error .control-label,
.has-error .radio,
.has-error .checkbox,
.has-error .radio-inline,
.has-error .checkbox-inline,
.has-error.radio label,
.has-error.checkbox label,
.has-error.radio-inline label,
.has-error.checkbox-inline label {
  color: #a94442;
}
.has-error .form-control {
  border-color: #a94442;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
}
.has-error .form-control:focus {
  border-color: #843534;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #ce8483;
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #ce8483;
}
.has-error .input-group-addon {
  color: #a94442;
  border-color: #a94442;
  background-color: #f2dede;
}
.has-error .form-control-feedback {
  color: #a94442;
}
.has-feedback label ~ .form-control-feedback {
  top: 23px;
}
.has-feedback label.sr-only ~ .form-control-feedback {
  top: 0;
}
.help-block {
  display: block;
  margin-top: 5px;
  margin-bottom: 10px;
  color: #404040;
}
@media (min-width: 768px) {
  .form-inline .form-group {
    display: inline-block;
    margin-bottom: 0;
    vertical-align: middle;
  }
  .form-inline .form-control {
    display: inline-block;
    width: auto;
    vertical-align: middle;
  }
  .form-inline .form-control-static {
    display: inline-block;
  }
  .form-inline .input-group {
    display: inline-table;
    vertical-align: middle;
  }
  .form-inline .input-group .input-group-addon,
  .form-inline .input-group .input-group-btn,
  .form-inline .input-group .form-control {
    width: auto;
  }
  .form-inline .input-group > .form-control {
    width: 100%;
  }
  .form-inline .control-label {
    margin-bottom: 0;
    vertical-align: middle;
  }
  .form-inline .radio,
  .form-inline .checkbox {
    display: inline-block;
    margin-top: 0;
    margin-bottom: 0;
    vertical-align: middle;
  }
  .form-inline .radio label,
  .form-inline .checkbox label {
    padding-left: 0;
  }
  .form-inline .radio input[type="radio"],
  .form-inline .checkbox input[type="checkbox"] {
    position: relative;
    margin-left: 0;
  }
  .form-inline .has-feedback .form-control-feedback {
    top: 0;
  }
}
.form-horizontal .radio,
.form-horizontal .checkbox,
.form-horizontal .radio-inline,
.form-horizontal .checkbox-inline {
  margin-top: 0;
  margin-bottom: 0;
  padding-top: 7px;
}
.form-horizontal .radio,
.form-horizontal .checkbox {
  min-height: 25px;
}
.form-horizontal .form-group {
  margin-left: 0px;
  margin-right: 0px;
}
@media (min-width: 768px) {
  .form-horizontal .control-label {
    text-align: right;
    margin-bottom: 0;
    padding-top: 7px;
  }
}
.form-horizontal .has-feedback .form-control-feedback {
  right: 0px;
}
@media (min-width: 768px) {
  .form-horizontal .form-group-lg .control-label {
    padding-top: 11px;
    font-size: 17px;
  }
}
@media (min-width: 768px) {
  .form-horizontal .form-group-sm .control-label {
    padding-top: 6px;
    font-size: 12px;
  }
}
.btn {
  display: inline-block;
  margin-bottom: 0;
  font-weight: normal;
  text-align: center;
  vertical-align: middle;
  touch-action: manipulation;
  cursor: pointer;
  background-image: none;
  border: 1px solid transparent;
  white-space: nowrap;
  padding: 6px 12px;
  font-size: 13px;
  line-height: 1.42857143;
  border-radius: 2px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
.btn:focus,
.btn:active:focus,
.btn.active:focus,
.btn.focus,
.btn:active.focus,
.btn.active.focus {
  outline: thin dotted;
  outline: 5px auto -webkit-focus-ring-color;
  outline-offset: -2px;
}
.btn:hover,
.btn:focus,
.btn.focus {
  color: #333;
  text-decoration: none;
}
.btn:active,
.btn.active {
  outline: 0;
  background-image: none;
  -webkit-box-shadow: inset 0 3px 5px rgba(0, 0, 0, 0.125);
  box-shadow: inset 0 3px 5px rgba(0, 0, 0, 0.125);
}
.btn.disabled,
.btn[disabled],
fieldset[disabled] .btn {
  cursor: not-allowed;
  opacity: 0.65;
  filter: alpha(opacity=65);
  -webkit-box-shadow: none;
  box-shadow: none;
}
a.btn.disabled,
fieldset[disabled] a.btn {
  pointer-events: none;
}
.btn-default {
  color: #333;
  background-color: #fff;
  border-color: #ccc;
}
.btn-default:focus,
.btn-default.focus {
  color: #333;
  background-color: #e6e6e6;
  border-color: #8c8c8c;
}
.btn-default:hover {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
.btn-default:active,
.btn-default.active,
.open > .dropdown-toggle.btn-default {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
.btn-default:active:hover,
.btn-default.active:hover,
.open > .dropdown-toggle.btn-default:hover,
.btn-default:active:focus,
.btn-default.active:focus,
.open > .dropdown-toggle.btn-default:focus,
.btn-default:active.focus,
.btn-default.active.focus,
.open > .dropdown-toggle.btn-default.focus {
  color: #333;
  background-color: #d4d4d4;
  border-color: #8c8c8c;
}
.btn-default:active,
.btn-default.active,
.open > .dropdown-toggle.btn-default {
  background-image: none;
}
.btn-default.disabled:hover,
.btn-default[disabled]:hover,
fieldset[disabled] .btn-default:hover,
.btn-default.disabled:focus,
.btn-default[disabled]:focus,
fieldset[disabled] .btn-default:focus,
.btn-default.disabled.focus,
.btn-default[disabled].focus,
fieldset[disabled] .btn-default.focus {
  background-color: #fff;
  border-color: #ccc;
}
.btn-default .badge {
  color: #fff;
  background-color: #333;
}
.btn-primary {
  color: #fff;
  background-color: #337ab7;
  border-color: #2e6da4;
}
.btn-primary:focus,
.btn-primary.focus {
  color: #fff;
  background-color: #286090;
  border-color: #122b40;
}
.btn-primary:hover {
  color: #fff;
  background-color: #286090;
  border-color: #204d74;
}
.btn-primary:active,
.btn-primary.active,
.open > .dropdown-toggle.btn-primary {
  color: #fff;
  background-color: #286090;
  border-color: #204d74;
}
.btn-primary:active:hover,
.btn-primary.active:hover,
.open > .dropdown-toggle.btn-primary:hover,
.btn-primary:active:focus,
.btn-primary.active:focus,
.open > .dropdown-toggle.btn-primary:focus,
.btn-primary:active.focus,
.btn-primary.active.focus,
.open > .dropdown-toggle.btn-primary.focus {
  color: #fff;
  background-color: #204d74;
  border-color: #122b40;
}
.btn-primary:active,
.btn-primary.active,
.open > .dropdown-toggle.btn-primary {
  background-image: none;
}
.btn-primary.disabled:hover,
.btn-primary[disabled]:hover,
fieldset[disabled] .btn-primary:hover,
.btn-primary.disabled:focus,
.btn-primary[disabled]:focus,
fieldset[disabled] .btn-primary:focus,
.btn-primary.disabled.focus,
.btn-primary[disabled].focus,
fieldset[disabled] .btn-primary.focus {
  background-color: #337ab7;
  border-color: #2e6da4;
}
.btn-primary .badge {
  color: #337ab7;
  background-color: #fff;
}
.btn-success {
  color: #fff;
  background-color: #5cb85c;
  border-color: #4cae4c;
}
.btn-success:focus,
.btn-success.focus {
  color: #fff;
  background-color: #449d44;
  border-color: #255625;
}
.btn-success:hover {
  color: #fff;
  background-color: #449d44;
  border-color: #398439;
}
.btn-success:active,
.btn-success.active,
.open > .dropdown-toggle.btn-success {
  color: #fff;
  background-color: #449d44;
  border-color: #398439;
}
.btn-success:active:hover,
.btn-success.active:hover,
.open > .dropdown-toggle.btn-success:hover,
.btn-success:active:focus,
.btn-success.active:focus,
.open > .dropdown-toggle.btn-success:focus,
.btn-success:active.focus,
.btn-success.active.focus,
.open > .dropdown-toggle.btn-success.focus {
  color: #fff;
  background-color: #398439;
  border-color: #255625;
}
.btn-success:active,
.btn-success.active,
.open > .dropdown-toggle.btn-success {
  background-image: none;
}
.btn-success.disabled:hover,
.btn-success[disabled]:hover,
fieldset[disabled] .btn-success:hover,
.btn-success.disabled:focus,
.btn-success[disabled]:focus,
fieldset[disabled] .btn-success:focus,
.btn-success.disabled.focus,
.btn-success[disabled].focus,
fieldset[disabled] .btn-success.focus {
  background-color: #5cb85c;
  border-color: #4cae4c;
}
.btn-success .badge {
  color: #5cb85c;
  background-color: #fff;
}
.btn-info {
  color: #fff;
  background-color: #5bc0de;
  border-color: #46b8da;
}
.btn-info:focus,
.btn-info.focus {
  color: #fff;
  background-color: #31b0d5;
  border-color: #1b6d85;
}
.btn-info:hover {
  color: #fff;
  background-color: #31b0d5;
  border-color: #269abc;
}
.btn-info:active,
.btn-info.active,
.open > .dropdown-toggle.btn-info {
  color: #fff;
  background-color: #31b0d5;
  border-color: #269abc;
}
.btn-info:active:hover,
.btn-info.active:hover,
.open > .dropdown-toggle.btn-info:hover,
.btn-info:active:focus,
.btn-info.active:focus,
.open > .dropdown-toggle.btn-info:focus,
.btn-info:active.focus,
.btn-info.active.focus,
.open > .dropdown-toggle.btn-info.focus {
  color: #fff;
  background-color: #269abc;
  border-color: #1b6d85;
}
.btn-info:active,
.btn-info.active,
.open > .dropdown-toggle.btn-info {
  background-image: none;
}
.btn-info.disabled:hover,
.btn-info[disabled]:hover,
fieldset[disabled] .btn-info:hover,
.btn-info.disabled:focus,
.btn-info[disabled]:focus,
fieldset[disabled] .btn-info:focus,
.btn-info.disabled.focus,
.btn-info[disabled].focus,
fieldset[disabled] .btn-info.focus {
  background-color: #5bc0de;
  border-color: #46b8da;
}
.btn-info .badge {
  color: #5bc0de;
  background-color: #fff;
}
.btn-warning {
  color: #fff;
  background-color: #f0ad4e;
  border-color: #eea236;
}
.btn-warning:focus,
.btn-warning.focus {
  color: #fff;
  background-color: #ec971f;
  border-color: #985f0d;
}
.btn-warning:hover {
  color: #fff;
  background-color: #ec971f;
  border-color: #d58512;
}
.btn-warning:active,
.btn-warning.active,
.open > .dropdown-toggle.btn-warning {
  color: #fff;
  background-color: #ec971f;
  border-color: #d58512;
}
.btn-warning:active:hover,
.btn-warning.active:hover,
.open > .dropdown-toggle.btn-warning:hover,
.btn-warning:active:focus,
.btn-warning.active:focus,
.open > .dropdown-toggle.btn-warning:focus,
.btn-warning:active.focus,
.btn-warning.active.focus,
.open > .dropdown-toggle.btn-warning.focus {
  color: #fff;
  background-color: #d58512;
  border-color: #985f0d;
}
.btn-warning:active,
.btn-warning.active,
.open > .dropdown-toggle.btn-warning {
  background-image: none;
}
.btn-warning.disabled:hover,
.btn-warning[disabled]:hover,
fieldset[disabled] .btn-warning:hover,
.btn-warning.disabled:focus,
.btn-warning[disabled]:focus,
fieldset[disabled] .btn-warning:focus,
.btn-warning.disabled.focus,
.btn-warning[disabled].focus,
fieldset[disabled] .btn-warning.focus {
  background-color: #f0ad4e;
  border-color: #eea236;
}
.btn-warning .badge {
  color: #f0ad4e;
  background-color: #fff;
}
.btn-danger {
  color: #fff;
  background-color: #d9534f;
  border-color: #d43f3a;
}
.btn-danger:focus,
.btn-danger.focus {
  color: #fff;
  background-color: #c9302c;
  border-color: #761c19;
}
.btn-danger:hover {
  color: #fff;
  background-color: #c9302c;
  border-color: #ac2925;
}
.btn-danger:active,
.btn-danger.active,
.open > .dropdown-toggle.btn-danger {
  color: #fff;
  background-color: #c9302c;
  border-color: #ac2925;
}
.btn-danger:active:hover,
.btn-danger.active:hover,
.open > .dropdown-toggle.btn-danger:hover,
.btn-danger:active:focus,
.btn-danger.active:focus,
.open > .dropdown-toggle.btn-danger:focus,
.btn-danger:active.focus,
.btn-danger.active.focus,
.open > .dropdown-toggle.btn-danger.focus {
  color: #fff;
  background-color: #ac2925;
  border-color: #761c19;
}
.btn-danger:active,
.btn-danger.active,
.open > .dropdown-toggle.btn-danger {
  background-image: none;
}
.btn-danger.disabled:hover,
.btn-danger[disabled]:hover,
fieldset[disabled] .btn-danger:hover,
.btn-danger.disabled:focus,
.btn-danger[disabled]:focus,
fieldset[disabled] .btn-danger:focus,
.btn-danger.disabled.focus,
.btn-danger[disabled].focus,
fieldset[disabled] .btn-danger.focus {
  background-color: #d9534f;
  border-color: #d43f3a;
}
.btn-danger .badge {
  color: #d9534f;
  background-color: #fff;
}
.btn-link {
  color: #337ab7;
  font-weight: normal;
  border-radius: 0;
}
.btn-link,
.btn-link:active,
.btn-link.active,
.btn-link[disabled],
fieldset[disabled] .btn-link {
  background-color: transparent;
  -webkit-box-shadow: none;
  box-shadow: none;
}
.btn-link,
.btn-link:hover,
.btn-link:focus,
.btn-link:active {
  border-color: transparent;
}
.btn-link:hover,
.btn-link:focus {
  color: #23527c;
  text-decoration: underline;
  background-color: transparent;
}
.btn-link[disabled]:hover,
fieldset[disabled] .btn-link:hover,
.btn-link[disabled]:focus,
fieldset[disabled] .btn-link:focus {
  color: #777777;
  text-decoration: none;
}
.btn-lg,
.btn-group-lg > .btn {
  padding: 10px 16px;
  font-size: 17px;
  line-height: 1.3333333;
  border-radius: 3px;
}
.btn-sm,
.btn-group-sm > .btn {
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
}
.btn-xs,
.btn-group-xs > .btn {
  padding: 1px 5px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
}
.btn-block {
  display: block;
  width: 100%;
}
.btn-block + .btn-block {
  margin-top: 5px;
}
input[type="submit"].btn-block,
input[type="reset"].btn-block,
input[type="button"].btn-block {
  width: 100%;
}
.fade {
  opacity: 0;
  -webkit-transition: opacity 0.15s linear;
  -o-transition: opacity 0.15s linear;
  transition: opacity 0.15s linear;
}
.fade.in {
  opacity: 1;
}
.collapse {
  display: none;
}
.collapse.in {
  display: block;
}
tr.collapse.in {
  display: table-row;
}
tbody.collapse.in {
  display: table-row-group;
}
.collapsing {
  position: relative;
  height: 0;
  overflow: hidden;
  -webkit-transition-property: height, visibility;
  transition-property: height, visibility;
  -webkit-transition-duration: 0.35s;
  transition-duration: 0.35s;
  -webkit-transition-timing-function: ease;
  transition-timing-function: ease;
}
.caret {
  display: inline-block;
  width: 0;
  height: 0;
  margin-left: 2px;
  vertical-align: middle;
  border-top: 4px dashed;
  border-top: 4px solid \9;
  border-right: 4px solid transparent;
  border-left: 4px solid transparent;
}
.dropup,
.dropdown {
  position: relative;
}
.dropdown-toggle:focus {
  outline: 0;
}
.dropdown-menu {
  position: absolute;
  top: 100%;
  left: 0;
  z-index: 1000;
  display: none;
  float: left;
  min-width: 160px;
  padding: 5px 0;
  margin: 2px 0 0;
  list-style: none;
  font-size: 13px;
  text-align: left;
  background-color: #fff;
  border: 1px solid #ccc;
  border: 1px solid rgba(0, 0, 0, 0.15);
  border-radius: 2px;
  -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
  box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
  background-clip: padding-box;
}
.dropdown-menu.pull-right {
  right: 0;
  left: auto;
}
.dropdown-menu .divider {
  height: 1px;
  margin: 8px 0;
  overflow: hidden;
  background-color: #e5e5e5;
}
.dropdown-menu > li > a {
  display: block;
  padding: 3px 20px;
  clear: both;
  font-weight: normal;
  line-height: 1.42857143;
  color: #333333;
  white-space: nowrap;
}
.dropdown-menu > li > a:hover,
.dropdown-menu > li > a:focus {
  text-decoration: none;
  color: #262626;
  background-color: #f5f5f5;
}
.dropdown-menu > .active > a,
.dropdown-menu > .active > a:hover,
.dropdown-menu > .active > a:focus {
  color: #fff;
  text-decoration: none;
  outline: 0;
  background-color: #337ab7;
}
.dropdown-menu > .disabled > a,
.dropdown-menu > .disabled > a:hover,
.dropdown-menu > .disabled > a:focus {
  color: #777777;
}
.dropdown-menu > .disabled > a:hover,
.dropdown-menu > .disabled > a:focus {
  text-decoration: none;
  background-color: transparent;
  background-image: none;
  filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
  cursor: not-allowed;
}
.open > .dropdown-menu {
  display: block;
}
.open > a {
  outline: 0;
}
.dropdown-menu-right {
  left: auto;
  right: 0;
}
.dropdown-menu-left {
  left: 0;
  right: auto;
}
.dropdown-header {
  display: block;
  padding: 3px 20px;
  font-size: 12px;
  line-height: 1.42857143;
  color: #777777;
  white-space: nowrap;
}
.dropdown-backdrop {
  position: fixed;
  left: 0;
  right: 0;
  bottom: 0;
  top: 0;
  z-index: 990;
}
.pull-right > .dropdown-menu {
  right: 0;
  left: auto;
}
.dropup .caret,
.navbar-fixed-bottom .dropdown .caret {
  border-top: 0;
  border-bottom: 4px dashed;
  border-bottom: 4px solid \9;
  content: "";
}
.dropup .dropdown-menu,
.navbar-fixed-bottom .dropdown .dropdown-menu {
  top: auto;
  bottom: 100%;
  margin-bottom: 2px;
}
@media (min-width: 541px) {
  .navbar-right .dropdown-menu {
    left: auto;
    right: 0;
  }
  .navbar-right .dropdown-menu-left {
    left: 0;
    right: auto;
  }
}
.btn-group,
.btn-group-vertical {
  position: relative;
  display: inline-block;
  vertical-align: middle;
}
.btn-group > .btn,
.btn-group-vertical > .btn {
  position: relative;
  float: left;
}
.btn-group > .btn:hover,
.btn-group-vertical > .btn:hover,
.btn-group > .btn:focus,
.btn-group-vertical > .btn:focus,
.btn-group > .btn:active,
.btn-group-vertical > .btn:active,
.btn-group > .btn.active,
.btn-group-vertical > .btn.active {
  z-index: 2;
}
.btn-group .btn + .btn,
.btn-group .btn + .btn-group,
.btn-group .btn-group + .btn,
.btn-group .btn-group + .btn-group {
  margin-left: -1px;
}
.btn-toolbar {
  margin-left: -5px;
}
.btn-toolbar .btn,
.btn-toolbar .btn-group,
.btn-toolbar .input-group {
  float: left;
}
.btn-toolbar > .btn,
.btn-toolbar > .btn-group,
.btn-toolbar > .input-group {
  margin-left: 5px;
}
.btn-group > .btn:not(:first-child):not(:last-child):not(.dropdown-toggle) {
  border-radius: 0;
}
.btn-group > .btn:first-child {
  margin-left: 0;
}
.btn-group > .btn:first-child:not(:last-child):not(.dropdown-toggle) {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.btn-group > .btn:last-child:not(:first-child),
.btn-group > .dropdown-toggle:not(:first-child) {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.btn-group > .btn-group {
  float: left;
}
.btn-group > .btn-group:not(:first-child):not(:last-child) > .btn {
  border-radius: 0;
}
.btn-group > .btn-group:first-child:not(:last-child) > .btn:last-child,
.btn-group > .btn-group:first-child:not(:last-child) > .dropdown-toggle {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.btn-group > .btn-group:last-child:not(:first-child) > .btn:first-child {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.btn-group .dropdown-toggle:active,
.btn-group.open .dropdown-toggle {
  outline: 0;
}
.btn-group > .btn + .dropdown-toggle {
  padding-left: 8px;
  padding-right: 8px;
}
.btn-group > .btn-lg + .dropdown-toggle {
  padding-left: 12px;
  padding-right: 12px;
}
.btn-group.open .dropdown-toggle {
  -webkit-box-shadow: inset 0 3px 5px rgba(0, 0, 0, 0.125);
  box-shadow: inset 0 3px 5px rgba(0, 0, 0, 0.125);
}
.btn-group.open .dropdown-toggle.btn-link {
  -webkit-box-shadow: none;
  box-shadow: none;
}
.btn .caret {
  margin-left: 0;
}
.btn-lg .caret {
  border-width: 5px 5px 0;
  border-bottom-width: 0;
}
.dropup .btn-lg .caret {
  border-width: 0 5px 5px;
}
.btn-group-vertical > .btn,
.btn-group-vertical > .btn-group,
.btn-group-vertical > .btn-group > .btn {
  display: block;
  float: none;
  width: 100%;
  max-width: 100%;
}
.btn-group-vertical > .btn-group > .btn {
  float: none;
}
.btn-group-vertical > .btn + .btn,
.btn-group-vertical > .btn + .btn-group,
.btn-group-vertical > .btn-group + .btn,
.btn-group-vertical > .btn-group + .btn-group {
  margin-top: -1px;
  margin-left: 0;
}
.btn-group-vertical > .btn:not(:first-child):not(:last-child) {
  border-radius: 0;
}
.btn-group-vertical > .btn:first-child:not(:last-child) {
  border-top-right-radius: 2px;
  border-top-left-radius: 2px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.btn-group-vertical > .btn:last-child:not(:first-child) {
  border-top-right-radius: 0;
  border-top-left-radius: 0;
  border-bottom-right-radius: 2px;
  border-bottom-left-radius: 2px;
}
.btn-group-vertical > .btn-group:not(:first-child):not(:last-child) > .btn {
  border-radius: 0;
}
.btn-group-vertical > .btn-group:first-child:not(:last-child) > .btn:last-child,
.btn-group-vertical > .btn-group:first-child:not(:last-child) > .dropdown-toggle {
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.btn-group-vertical > .btn-group:last-child:not(:first-child) > .btn:first-child {
  border-top-right-radius: 0;
  border-top-left-radius: 0;
}
.btn-group-justified {
  display: table;
  width: 100%;
  table-layout: fixed;
  border-collapse: separate;
}
.btn-group-justified > .btn,
.btn-group-justified > .btn-group {
  float: none;
  display: table-cell;
  width: 1%;
}
.btn-group-justified > .btn-group .btn {
  width: 100%;
}
.btn-group-justified > .btn-group .dropdown-menu {
  left: auto;
}
[data-toggle="buttons"] > .btn input[type="radio"],
[data-toggle="buttons"] > .btn-group > .btn input[type="radio"],
[data-toggle="buttons"] > .btn input[type="checkbox"],
[data-toggle="buttons"] > .btn-group > .btn input[type="checkbox"] {
  position: absolute;
  clip: rect(0, 0, 0, 0);
  pointer-events: none;
}
.input-group {
  position: relative;
  display: table;
  border-collapse: separate;
}
.input-group[class*="col-"] {
  float: none;
  padding-left: 0;
  padding-right: 0;
}
.input-group .form-control {
  position: relative;
  z-index: 2;
  float: left;
  width: 100%;
  margin-bottom: 0;
}
.input-group .form-control:focus {
  z-index: 3;
}
.input-group-lg > .form-control,
.input-group-lg > .input-group-addon,
.input-group-lg > .input-group-btn > .btn {
  height: 45px;
  padding: 10px 16px;
  font-size: 17px;
  line-height: 1.3333333;
  border-radius: 3px;
}
select.input-group-lg > .form-control,
select.input-group-lg > .input-group-addon,
select.input-group-lg > .input-group-btn > .btn {
  height: 45px;
  line-height: 45px;
}
textarea.input-group-lg > .form-control,
textarea.input-group-lg > .input-group-addon,
textarea.input-group-lg > .input-group-btn > .btn,
select[multiple].input-group-lg > .form-control,
select[multiple].input-group-lg > .input-group-addon,
select[multiple].input-group-lg > .input-group-btn > .btn {
  height: auto;
}
.input-group-sm > .form-control,
.input-group-sm > .input-group-addon,
.input-group-sm > .input-group-btn > .btn {
  height: 30px;
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
}
select.input-group-sm > .form-control,
select.input-group-sm > .input-group-addon,
select.input-group-sm > .input-group-btn > .btn {
  height: 30px;
  line-height: 30px;
}
textarea.input-group-sm > .form-control,
textarea.input-group-sm > .input-group-addon,
textarea.input-group-sm > .input-group-btn > .btn,
select[multiple].input-group-sm > .form-control,
select[multiple].input-group-sm > .input-group-addon,
select[multiple].input-group-sm > .input-group-btn > .btn {
  height: auto;
}
.input-group-addon,
.input-group-btn,
.input-group .form-control {
  display: table-cell;
}
.input-group-addon:not(:first-child):not(:last-child),
.input-group-btn:not(:first-child):not(:last-child),
.input-group .form-control:not(:first-child):not(:last-child) {
  border-radius: 0;
}
.input-group-addon,
.input-group-btn {
  width: 1%;
  white-space: nowrap;
  vertical-align: middle;
}
.input-group-addon {
  padding: 6px 12px;
  font-size: 13px;
  font-weight: normal;
  line-height: 1;
  color: #555555;
  text-align: center;
  background-color: #eeeeee;
  border: 1px solid #ccc;
  border-radius: 2px;
}
.input-group-addon.input-sm {
  padding: 5px 10px;
  font-size: 12px;
  border-radius: 1px;
}
.input-group-addon.input-lg {
  padding: 10px 16px;
  font-size: 17px;
  border-radius: 3px;
}
.input-group-addon input[type="radio"],
.input-group-addon input[type="checkbox"] {
  margin-top: 0;
}
.input-group .form-control:first-child,
.input-group-addon:first-child,
.input-group-btn:first-child > .btn,
.input-group-btn:first-child > .btn-group > .btn,
.input-group-btn:first-child > .dropdown-toggle,
.input-group-btn:last-child > .btn:not(:last-child):not(.dropdown-toggle),
.input-group-btn:last-child > .btn-group:not(:last-child) > .btn {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.input-group-addon:first-child {
  border-right: 0;
}
.input-group .form-control:last-child,
.input-group-addon:last-child,
.input-group-btn:last-child > .btn,
.input-group-btn:last-child > .btn-group > .btn,
.input-group-btn:last-child > .dropdown-toggle,
.input-group-btn:first-child > .btn:not(:first-child),
.input-group-btn:first-child > .btn-group:not(:first-child) > .btn {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.input-group-addon:last-child {
  border-left: 0;
}
.input-group-btn {
  position: relative;
  font-size: 0;
  white-space: nowrap;
}
.input-group-btn > .btn {
  position: relative;
}
.input-group-btn > .btn + .btn {
  margin-left: -1px;
}
.input-group-btn > .btn:hover,
.input-group-btn > .btn:focus,
.input-group-btn > .btn:active {
  z-index: 2;
}
.input-group-btn:first-child > .btn,
.input-group-btn:first-child > .btn-group {
  margin-right: -1px;
}
.input-group-btn:last-child > .btn,
.input-group-btn:last-child > .btn-group {
  z-index: 2;
  margin-left: -1px;
}
.nav {
  margin-bottom: 0;
  padding-left: 0;
  list-style: none;
}
.nav > li {
  position: relative;
  display: block;
}
.nav > li > a {
  position: relative;
  display: block;
  padding: 10px 15px;
}
.nav > li > a:hover,
.nav > li > a:focus {
  text-decoration: none;
  background-color: #eeeeee;
}
.nav > li.disabled > a {
  color: #777777;
}
.nav > li.disabled > a:hover,
.nav > li.disabled > a:focus {
  color: #777777;
  text-decoration: none;
  background-color: transparent;
  cursor: not-allowed;
}
.nav .open > a,
.nav .open > a:hover,
.nav .open > a:focus {
  background-color: #eeeeee;
  border-color: #337ab7;
}
.nav .nav-divider {
  height: 1px;
  margin: 8px 0;
  overflow: hidden;
  background-color: #e5e5e5;
}
.nav > li > a > img {
  max-width: none;
}
.nav-tabs {
  border-bottom: 1px solid #ddd;
}
.nav-tabs > li {
  float: left;
  margin-bottom: -1px;
}
.nav-tabs > li > a {
  margin-right: 2px;
  line-height: 1.42857143;
  border: 1px solid transparent;
  border-radius: 2px 2px 0 0;
}
.nav-tabs > li > a:hover {
  border-color: #eeeeee #eeeeee #ddd;
}
.nav-tabs > li.active > a,
.nav-tabs > li.active > a:hover,
.nav-tabs > li.active > a:focus {
  color: #555555;
  background-color: #fff;
  border: 1px solid #ddd;
  border-bottom-color: transparent;
  cursor: default;
}
.nav-tabs.nav-justified {
  width: 100%;
  border-bottom: 0;
}
.nav-tabs.nav-justified > li {
  float: none;
}
.nav-tabs.nav-justified > li > a {
  text-align: center;
  margin-bottom: 5px;
}
.nav-tabs.nav-justified > .dropdown .dropdown-menu {
  top: auto;
  left: auto;
}
@media (min-width: 768px) {
  .nav-tabs.nav-justified > li {
    display: table-cell;
    width: 1%;
  }
  .nav-tabs.nav-justified > li > a {
    margin-bottom: 0;
  }
}
.nav-tabs.nav-justified > li > a {
  margin-right: 0;
  border-radius: 2px;
}
.nav-tabs.nav-justified > .active > a,
.nav-tabs.nav-justified > .active > a:hover,
.nav-tabs.nav-justified > .active > a:focus {
  border: 1px solid #ddd;
}
@media (min-width: 768px) {
  .nav-tabs.nav-justified > li > a {
    border-bottom: 1px solid #ddd;
    border-radius: 2px 2px 0 0;
  }
  .nav-tabs.nav-justified > .active > a,
  .nav-tabs.nav-justified > .active > a:hover,
  .nav-tabs.nav-justified > .active > a:focus {
    border-bottom-color: #fff;
  }
}
.nav-pills > li {
  float: left;
}
.nav-pills > li > a {
  border-radius: 2px;
}
.nav-pills > li + li {
  margin-left: 2px;
}
.nav-pills > li.active > a,
.nav-pills > li.active > a:hover,
.nav-pills > li.active > a:focus {
  color: #fff;
  background-color: #337ab7;
}
.nav-stacked > li {
  float: none;
}
.nav-stacked > li + li {
  margin-top: 2px;
  margin-left: 0;
}
.nav-justified {
  width: 100%;
}
.nav-justified > li {
  float: none;
}
.nav-justified > li > a {
  text-align: center;
  margin-bottom: 5px;
}
.nav-justified > .dropdown .dropdown-menu {
  top: auto;
  left: auto;
}
@media (min-width: 768px) {
  .nav-justified > li {
    display: table-cell;
    width: 1%;
  }
  .nav-justified > li > a {
    margin-bottom: 0;
  }
}
.nav-tabs-justified {
  border-bottom: 0;
}
.nav-tabs-justified > li > a {
  margin-right: 0;
  border-radius: 2px;
}
.nav-tabs-justified > .active > a,
.nav-tabs-justified > .active > a:hover,
.nav-tabs-justified > .active > a:focus {
  border: 1px solid #ddd;
}
@media (min-width: 768px) {
  .nav-tabs-justified > li > a {
    border-bottom: 1px solid #ddd;
    border-radius: 2px 2px 0 0;
  }
  .nav-tabs-justified > .active > a,
  .nav-tabs-justified > .active > a:hover,
  .nav-tabs-justified > .active > a:focus {
    border-bottom-color: #fff;
  }
}
.tab-content > .tab-pane {
  display: none;
}
.tab-content > .active {
  display: block;
}
.nav-tabs .dropdown-menu {
  margin-top: -1px;
  border-top-right-radius: 0;
  border-top-left-radius: 0;
}
.navbar {
  position: relative;
  min-height: 30px;
  margin-bottom: 18px;
  border: 1px solid transparent;
}
@media (min-width: 541px) {
  .navbar {
    border-radius: 2px;
  }
}
@media (min-width: 541px) {
  .navbar-header {
    float: left;
  }
}
.navbar-collapse {
  overflow-x: visible;
  padding-right: 0px;
  padding-left: 0px;
  border-top: 1px solid transparent;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.1);
  -webkit-overflow-scrolling: touch;
}
.navbar-collapse.in {
  overflow-y: auto;
}
@media (min-width: 541px) {
  .navbar-collapse {
    width: auto;
    border-top: 0;
    box-shadow: none;
  }
  .navbar-collapse.collapse {
    display: block !important;
    height: auto !important;
    padding-bottom: 0;
    overflow: visible !important;
  }
  .navbar-collapse.in {
    overflow-y: visible;
  }
  .navbar-fixed-top .navbar-collapse,
  .navbar-static-top .navbar-collapse,
  .navbar-fixed-bottom .navbar-collapse {
    padding-left: 0;
    padding-right: 0;
  }
}
.navbar-fixed-top .navbar-collapse,
.navbar-fixed-bottom .navbar-collapse {
  max-height: 340px;
}
@media (max-device-width: 540px) and (orientation: landscape) {
  .navbar-fixed-top .navbar-collapse,
  .navbar-fixed-bottom .navbar-collapse {
    max-height: 200px;
  }
}
.container > .navbar-header,
.container-fluid > .navbar-header,
.container > .navbar-collapse,
.container-fluid > .navbar-collapse {
  margin-right: 0px;
  margin-left: 0px;
}
@media (min-width: 541px) {
  .container > .navbar-header,
  .container-fluid > .navbar-header,
  .container > .navbar-collapse,
  .container-fluid > .navbar-collapse {
    margin-right: 0;
    margin-left: 0;
  }
}
.navbar-static-top {
  z-index: 1000;
  border-width: 0 0 1px;
}
@media (min-width: 541px) {
  .navbar-static-top {
    border-radius: 0;
  }
}
.navbar-fixed-top,
.navbar-fixed-bottom {
  position: fixed;
  right: 0;
  left: 0;
  z-index: 1030;
}
@media (min-width: 541px) {
  .navbar-fixed-top,
  .navbar-fixed-bottom {
    border-radius: 0;
  }
}
.navbar-fixed-top {
  top: 0;
  border-width: 0 0 1px;
}
.navbar-fixed-bottom {
  bottom: 0;
  margin-bottom: 0;
  border-width: 1px 0 0;
}
.navbar-brand {
  float: left;
  padding: 6px 0px;
  font-size: 17px;
  line-height: 18px;
  height: 30px;
}
.navbar-brand:hover,
.navbar-brand:focus {
  text-decoration: none;
}
.navbar-brand > img {
  display: block;
}
@media (min-width: 541px) {
  .navbar > .container .navbar-brand,
  .navbar > .container-fluid .navbar-brand {
    margin-left: 0px;
  }
}
.navbar-toggle {
  position: relative;
  float: right;
  margin-right: 0px;
  padding: 9px 10px;
  margin-top: -2px;
  margin-bottom: -2px;
  background-color: transparent;
  background-image: none;
  border: 1px solid transparent;
  border-radius: 2px;
}
.navbar-toggle:focus {
  outline: 0;
}
.navbar-toggle .icon-bar {
  display: block;
  width: 22px;
  height: 2px;
  border-radius: 1px;
}
.navbar-toggle .icon-bar + .icon-bar {
  margin-top: 4px;
}
@media (min-width: 541px) {
  .navbar-toggle {
    display: none;
  }
}
.navbar-nav {
  margin: 3px 0px;
}
.navbar-nav > li > a {
  padding-top: 10px;
  padding-bottom: 10px;
  line-height: 18px;
}
@media (max-width: 540px) {
  .navbar-nav .open .dropdown-menu {
    position: static;
    float: none;
    width: auto;
    margin-top: 0;
    background-color: transparent;
    border: 0;
    box-shadow: none;
  }
  .navbar-nav .open .dropdown-menu > li > a,
  .navbar-nav .open .dropdown-menu .dropdown-header {
    padding: 5px 15px 5px 25px;
  }
  .navbar-nav .open .dropdown-menu > li > a {
    line-height: 18px;
  }
  .navbar-nav .open .dropdown-menu > li > a:hover,
  .navbar-nav .open .dropdown-menu > li > a:focus {
    background-image: none;
  }
}
@media (min-width: 541px) {
  .navbar-nav {
    float: left;
    margin: 0;
  }
  .navbar-nav > li {
    float: left;
  }
  .navbar-nav > li > a {
    padding-top: 6px;
    padding-bottom: 6px;
  }
}
.navbar-form {
  margin-left: 0px;
  margin-right: 0px;
  padding: 10px 0px;
  border-top: 1px solid transparent;
  border-bottom: 1px solid transparent;
  -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.1), 0 1px 0 rgba(255, 255, 255, 0.1);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.1), 0 1px 0 rgba(255, 255, 255, 0.1);
  margin-top: -1px;
  margin-bottom: -1px;
}
@media (min-width: 768px) {
  .navbar-form .form-group {
    display: inline-block;
    margin-bottom: 0;
    vertical-align: middle;
  }
  .navbar-form .form-control {
    display: inline-block;
    width: auto;
    vertical-align: middle;
  }
  .navbar-form .form-control-static {
    display: inline-block;
  }
  .navbar-form .input-group {
    display: inline-table;
    vertical-align: middle;
  }
  .navbar-form .input-group .input-group-addon,
  .navbar-form .input-group .input-group-btn,
  .navbar-form .input-group .form-control {
    width: auto;
  }
  .navbar-form .input-group > .form-control {
    width: 100%;
  }
  .navbar-form .control-label {
    margin-bottom: 0;
    vertical-align: middle;
  }
  .navbar-form .radio,
  .navbar-form .checkbox {
    display: inline-block;
    margin-top: 0;
    margin-bottom: 0;
    vertical-align: middle;
  }
  .navbar-form .radio label,
  .navbar-form .checkbox label {
    padding-left: 0;
  }
  .navbar-form .radio input[type="radio"],
  .navbar-form .checkbox input[type="checkbox"] {
    position: relative;
    margin-left: 0;
  }
  .navbar-form .has-feedback .form-control-feedback {
    top: 0;
  }
}
@media (max-width: 540px) {
  .navbar-form .form-group {
    margin-bottom: 5px;
  }
  .navbar-form .form-group:last-child {
    margin-bottom: 0;
  }
}
@media (min-width: 541px) {
  .navbar-form {
    width: auto;
    border: 0;
    margin-left: 0;
    margin-right: 0;
    padding-top: 0;
    padding-bottom: 0;
    -webkit-box-shadow: none;
    box-shadow: none;
  }
}
.navbar-nav > li > .dropdown-menu {
  margin-top: 0;
  border-top-right-radius: 0;
  border-top-left-radius: 0;
}
.navbar-fixed-bottom .navbar-nav > li > .dropdown-menu {
  margin-bottom: 0;
  border-top-right-radius: 2px;
  border-top-left-radius: 2px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.navbar-btn {
  margin-top: -1px;
  margin-bottom: -1px;
}
.navbar-btn.btn-sm {
  margin-top: 0px;
  margin-bottom: 0px;
}
.navbar-btn.btn-xs {
  margin-top: 4px;
  margin-bottom: 4px;
}
.navbar-text {
  margin-top: 6px;
  margin-bottom: 6px;
}
@media (min-width: 541px) {
  .navbar-text {
    float: left;
    margin-left: 0px;
    margin-right: 0px;
  }
}
@media (min-width: 541px) {
  .navbar-left {
    float: left !important;
    float: left;
  }
  .navbar-right {
    float: right !important;
    float: right;
    margin-right: 0px;
  }
  .navbar-right ~ .navbar-right {
    margin-right: 0;
  }
}
.navbar-default {
  background-color: #f8f8f8;
  border-color: #e7e7e7;
}
.navbar-default .navbar-brand {
  color: #777;
}
.navbar-default .navbar-brand:hover,
.navbar-default .navbar-brand:focus {
  color: #5e5e5e;
  background-color: transparent;
}
.navbar-default .navbar-text {
  color: #777;
}
.navbar-default .navbar-nav > li > a {
  color: #777;
}
.navbar-default .navbar-nav > li > a:hover,
.navbar-default .navbar-nav > li > a:focus {
  color: #333;
  background-color: transparent;
}
.navbar-default .navbar-nav > .active > a,
.navbar-default .navbar-nav > .active > a:hover,
.navbar-default .navbar-nav > .active > a:focus {
  color: #555;
  background-color: #e7e7e7;
}
.navbar-default .navbar-nav > .disabled > a,
.navbar-default .navbar-nav > .disabled > a:hover,
.navbar-default .navbar-nav > .disabled > a:focus {
  color: #ccc;
  background-color: transparent;
}
.navbar-default .navbar-toggle {
  border-color: #ddd;
}
.navbar-default .navbar-toggle:hover,
.navbar-default .navbar-toggle:focus {
  background-color: #ddd;
}
.navbar-default .navbar-toggle .icon-bar {
  background-color: #888;
}
.navbar-default .navbar-collapse,
.navbar-default .navbar-form {
  border-color: #e7e7e7;
}
.navbar-default .navbar-nav > .open > a,
.navbar-default .navbar-nav > .open > a:hover,
.navbar-default .navbar-nav > .open > a:focus {
  background-color: #e7e7e7;
  color: #555;
}
@media (max-width: 540px) {
  .navbar-default .navbar-nav .open .dropdown-menu > li > a {
    color: #777;
  }
  .navbar-default .navbar-nav .open .dropdown-menu > li > a:hover,
  .navbar-default .navbar-nav .open .dropdown-menu > li > a:focus {
    color: #333;
    background-color: transparent;
  }
  .navbar-default .navbar-nav .open .dropdown-menu > .active > a,
  .navbar-default .navbar-nav .open .dropdown-menu > .active > a:hover,
  .navbar-default .navbar-nav .open .dropdown-menu > .active > a:focus {
    color: #555;
    background-color: #e7e7e7;
  }
  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a,
  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a:hover,
  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a:focus {
    color: #ccc;
    background-color: transparent;
  }
}
.navbar-default .navbar-link {
  color: #777;
}
.navbar-default .navbar-link:hover {
  color: #333;
}
.navbar-default .btn-link {
  color: #777;
}
.navbar-default .btn-link:hover,
.navbar-default .btn-link:focus {
  color: #333;
}
.navbar-default .btn-link[disabled]:hover,
fieldset[disabled] .navbar-default .btn-link:hover,
.navbar-default .btn-link[disabled]:focus,
fieldset[disabled] .navbar-default .btn-link:focus {
  color: #ccc;
}
.navbar-inverse {
  background-color: #222;
  border-color: #080808;
}
.navbar-inverse .navbar-brand {
  color: #9d9d9d;
}
.navbar-inverse .navbar-brand:hover,
.navbar-inverse .navbar-brand:focus {
  color: #fff;
  background-color: transparent;
}
.navbar-inverse .navbar-text {
  color: #9d9d9d;
}
.navbar-inverse .navbar-nav > li > a {
  color: #9d9d9d;
}
.navbar-inverse .navbar-nav > li > a:hover,
.navbar-inverse .navbar-nav > li > a:focus {
  color: #fff;
  background-color: transparent;
}
.navbar-inverse .navbar-nav > .active > a,
.navbar-inverse .navbar-nav > .active > a:hover,
.navbar-inverse .navbar-nav > .active > a:focus {
  color: #fff;
  background-color: #080808;
}
.navbar-inverse .navbar-nav > .disabled > a,
.navbar-inverse .navbar-nav > .disabled > a:hover,
.navbar-inverse .navbar-nav > .disabled > a:focus {
  color: #444;
  background-color: transparent;
}
.navbar-inverse .navbar-toggle {
  border-color: #333;
}
.navbar-inverse .navbar-toggle:hover,
.navbar-inverse .navbar-toggle:focus {
  background-color: #333;
}
.navbar-inverse .navbar-toggle .icon-bar {
  background-color: #fff;
}
.navbar-inverse .navbar-collapse,
.navbar-inverse .navbar-form {
  border-color: #101010;
}
.navbar-inverse .navbar-nav > .open > a,
.navbar-inverse .navbar-nav > .open > a:hover,
.navbar-inverse .navbar-nav > .open > a:focus {
  background-color: #080808;
  color: #fff;
}
@media (max-width: 540px) {
  .navbar-inverse .navbar-nav .open .dropdown-menu > .dropdown-header {
    border-color: #080808;
  }
  .navbar-inverse .navbar-nav .open .dropdown-menu .divider {
    background-color: #080808;
  }
  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a {
    color: #9d9d9d;
  }
  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a:hover,
  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a:focus {
    color: #fff;
    background-color: transparent;
  }
  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a,
  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a:hover,
  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a:focus {
    color: #fff;
    background-color: #080808;
  }
  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a,
  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a:hover,
  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a:focus {
    color: #444;
    background-color: transparent;
  }
}
.navbar-inverse .navbar-link {
  color: #9d9d9d;
}
.navbar-inverse .navbar-link:hover {
  color: #fff;
}
.navbar-inverse .btn-link {
  color: #9d9d9d;
}
.navbar-inverse .btn-link:hover,
.navbar-inverse .btn-link:focus {
  color: #fff;
}
.navbar-inverse .btn-link[disabled]:hover,
fieldset[disabled] .navbar-inverse .btn-link:hover,
.navbar-inverse .btn-link[disabled]:focus,
fieldset[disabled] .navbar-inverse .btn-link:focus {
  color: #444;
}
.breadcrumb {
  padding: 8px 15px;
  margin-bottom: 18px;
  list-style: none;
  background-color: #f5f5f5;
  border-radius: 2px;
}
.breadcrumb > li {
  display: inline-block;
}
.breadcrumb > li + li:before {
  content: "/\00a0";
  padding: 0 5px;
  color: #5e5e5e;
}
.breadcrumb > .active {
  color: #777777;
}
.pagination {
  display: inline-block;
  padding-left: 0;
  margin: 18px 0;
  border-radius: 2px;
}
.pagination > li {
  display: inline;
}
.pagination > li > a,
.pagination > li > span {
  position: relative;
  float: left;
  padding: 6px 12px;
  line-height: 1.42857143;
  text-decoration: none;
  color: #337ab7;
  background-color: #fff;
  border: 1px solid #ddd;
  margin-left: -1px;
}
.pagination > li:first-child > a,
.pagination > li:first-child > span {
  margin-left: 0;
  border-bottom-left-radius: 2px;
  border-top-left-radius: 2px;
}
.pagination > li:last-child > a,
.pagination > li:last-child > span {
  border-bottom-right-radius: 2px;
  border-top-right-radius: 2px;
}
.pagination > li > a:hover,
.pagination > li > span:hover,
.pagination > li > a:focus,
.pagination > li > span:focus {
  z-index: 2;
  color: #23527c;
  background-color: #eeeeee;
  border-color: #ddd;
}
.pagination > .active > a,
.pagination > .active > span,
.pagination > .active > a:hover,
.pagination > .active > span:hover,
.pagination > .active > a:focus,
.pagination > .active > span:focus {
  z-index: 3;
  color: #fff;
  background-color: #337ab7;
  border-color: #337ab7;
  cursor: default;
}
.pagination > .disabled > span,
.pagination > .disabled > span:hover,
.pagination > .disabled > span:focus,
.pagination > .disabled > a,
.pagination > .disabled > a:hover,
.pagination > .disabled > a:focus {
  color: #777777;
  background-color: #fff;
  border-color: #ddd;
  cursor: not-allowed;
}
.pagination-lg > li > a,
.pagination-lg > li > span {
  padding: 10px 16px;
  font-size: 17px;
  line-height: 1.3333333;
}
.pagination-lg > li:first-child > a,
.pagination-lg > li:first-child > span {
  border-bottom-left-radius: 3px;
  border-top-left-radius: 3px;
}
.pagination-lg > li:last-child > a,
.pagination-lg > li:last-child > span {
  border-bottom-right-radius: 3px;
  border-top-right-radius: 3px;
}
.pagination-sm > li > a,
.pagination-sm > li > span {
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
}
.pagination-sm > li:first-child > a,
.pagination-sm > li:first-child > span {
  border-bottom-left-radius: 1px;
  border-top-left-radius: 1px;
}
.pagination-sm > li:last-child > a,
.pagination-sm > li:last-child > span {
  border-bottom-right-radius: 1px;
  border-top-right-radius: 1px;
}
.pager {
  padding-left: 0;
  margin: 18px 0;
  list-style: none;
  text-align: center;
}
.pager li {
  display: inline;
}
.pager li > a,
.pager li > span {
  display: inline-block;
  padding: 5px 14px;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 15px;
}
.pager li > a:hover,
.pager li > a:focus {
  text-decoration: none;
  background-color: #eeeeee;
}
.pager .next > a,
.pager .next > span {
  float: right;
}
.pager .previous > a,
.pager .previous > span {
  float: left;
}
.pager .disabled > a,
.pager .disabled > a:hover,
.pager .disabled > a:focus,
.pager .disabled > span {
  color: #777777;
  background-color: #fff;
  cursor: not-allowed;
}
.label {
  display: inline;
  padding: .2em .6em .3em;
  font-size: 75%;
  font-weight: bold;
  line-height: 1;
  color: #fff;
  text-align: center;
  white-space: nowrap;
  vertical-align: baseline;
  border-radius: .25em;
}
a.label:hover,
a.label:focus {
  color: #fff;
  text-decoration: none;
  cursor: pointer;
}
.label:empty {
  display: none;
}
.btn .label {
  position: relative;
  top: -1px;
}
.label-default {
  background-color: #777777;
}
.label-default[href]:hover,
.label-default[href]:focus {
  background-color: #5e5e5e;
}
.label-primary {
  background-color: #337ab7;
}
.label-primary[href]:hover,
.label-primary[href]:focus {
  background-color: #286090;
}
.label-success {
  background-color: #5cb85c;
}
.label-success[href]:hover,
.label-success[href]:focus {
  background-color: #449d44;
}
.label-info {
  background-color: #5bc0de;
}
.label-info[href]:hover,
.label-info[href]:focus {
  background-color: #31b0d5;
}
.label-warning {
  background-color: #f0ad4e;
}
.label-warning[href]:hover,
.label-warning[href]:focus {
  background-color: #ec971f;
}
.label-danger {
  background-color: #d9534f;
}
.label-danger[href]:hover,
.label-danger[href]:focus {
  background-color: #c9302c;
}
.badge {
  display: inline-block;
  min-width: 10px;
  padding: 3px 7px;
  font-size: 12px;
  font-weight: bold;
  color: #fff;
  line-height: 1;
  vertical-align: middle;
  white-space: nowrap;
  text-align: center;
  background-color: #777777;
  border-radius: 10px;
}
.badge:empty {
  display: none;
}
.btn .badge {
  position: relative;
  top: -1px;
}
.btn-xs .badge,
.btn-group-xs > .btn .badge {
  top: 0;
  padding: 1px 5px;
}
a.badge:hover,
a.badge:focus {
  color: #fff;
  text-decoration: none;
  cursor: pointer;
}
.list-group-item.active > .badge,
.nav-pills > .active > a > .badge {
  color: #337ab7;
  background-color: #fff;
}
.list-group-item > .badge {
  float: right;
}
.list-group-item > .badge + .badge {
  margin-right: 5px;
}
.nav-pills > li > a > .badge {
  margin-left: 3px;
}
.jumbotron {
  padding-top: 30px;
  padding-bottom: 30px;
  margin-bottom: 30px;
  color: inherit;
  background-color: #eeeeee;
}
.jumbotron h1,
.jumbotron .h1 {
  color: inherit;
}
.jumbotron p {
  margin-bottom: 15px;
  font-size: 20px;
  font-weight: 200;
}
.jumbotron > hr {
  border-top-color: #d5d5d5;
}
.container .jumbotron,
.container-fluid .jumbotron {
  border-radius: 3px;
  padding-left: 0px;
  padding-right: 0px;
}
.jumbotron .container {
  max-width: 100%;
}
@media screen and (min-width: 768px) {
  .jumbotron {
    padding-top: 48px;
    padding-bottom: 48px;
  }
  .container .jumbotron,
  .container-fluid .jumbotron {
    padding-left: 60px;
    padding-right: 60px;
  }
  .jumbotron h1,
  .jumbotron .h1 {
    font-size: 59px;
  }
}
.thumbnail {
  display: block;
  padding: 4px;
  margin-bottom: 18px;
  line-height: 1.42857143;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 2px;
  -webkit-transition: border 0.2s ease-in-out;
  -o-transition: border 0.2s ease-in-out;
  transition: border 0.2s ease-in-out;
}
.thumbnail > img,
.thumbnail a > img {
  margin-left: auto;
  margin-right: auto;
}
a.thumbnail:hover,
a.thumbnail:focus,
a.thumbnail.active {
  border-color: #337ab7;
}
.thumbnail .caption {
  padding: 9px;
  color: #000;
}
.alert {
  padding: 15px;
  margin-bottom: 18px;
  border: 1px solid transparent;
  border-radius: 2px;
}
.alert h4 {
  margin-top: 0;
  color: inherit;
}
.alert .alert-link {
  font-weight: bold;
}
.alert > p,
.alert > ul {
  margin-bottom: 0;
}
.alert > p + p {
  margin-top: 5px;
}
.alert-dismissable,
.alert-dismissible {
  padding-right: 35px;
}
.alert-dismissable .close,
.alert-dismissible .close {
  position: relative;
  top: -2px;
  right: -21px;
  color: inherit;
}
.alert-success {
  background-color: #dff0d8;
  border-color: #d6e9c6;
  color: #3c763d;
}
.alert-success hr {
  border-top-color: #c9e2b3;
}
.alert-success .alert-link {
  color: #2b542c;
}
.alert-info {
  background-color: #d9edf7;
  border-color: #bce8f1;
  color: #31708f;
}
.alert-info hr {
  border-top-color: #a6e1ec;
}
.alert-info .alert-link {
  color: #245269;
}
.alert-warning {
  background-color: #fcf8e3;
  border-color: #faebcc;
  color: #8a6d3b;
}
.alert-warning hr {
  border-top-color: #f7e1b5;
}
.alert-warning .alert-link {
  color: #66512c;
}
.alert-danger {
  background-color: #f2dede;
  border-color: #ebccd1;
  color: #a94442;
}
.alert-danger hr {
  border-top-color: #e4b9c0;
}
.alert-danger .alert-link {
  color: #843534;
}
@-webkit-keyframes progress-bar-stripes {
  from {
    background-position: 40px 0;
  }
  to {
    background-position: 0 0;
  }
}
@keyframes progress-bar-stripes {
  from {
    background-position: 40px 0;
  }
  to {
    background-position: 0 0;
  }
}
.progress {
  overflow: hidden;
  height: 18px;
  margin-bottom: 18px;
  background-color: #f5f5f5;
  border-radius: 2px;
  -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
}
.progress-bar {
  float: left;
  width: 0%;
  height: 100%;
  font-size: 12px;
  line-height: 18px;
  color: #fff;
  text-align: center;
  background-color: #337ab7;
  -webkit-box-shadow: inset 0 -1px 0 rgba(0, 0, 0, 0.15);
  box-shadow: inset 0 -1px 0 rgba(0, 0, 0, 0.15);
  -webkit-transition: width 0.6s ease;
  -o-transition: width 0.6s ease;
  transition: width 0.6s ease;
}
.progress-striped .progress-bar,
.progress-bar-striped {
  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-size: 40px 40px;
}
.progress.active .progress-bar,
.progress-bar.active {
  -webkit-animation: progress-bar-stripes 2s linear infinite;
  -o-animation: progress-bar-stripes 2s linear infinite;
  animation: progress-bar-stripes 2s linear infinite;
}
.progress-bar-success {
  background-color: #5cb85c;
}
.progress-striped .progress-bar-success {
  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
}
.progress-bar-info {
  background-color: #5bc0de;
}
.progress-striped .progress-bar-info {
  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
}
.progress-bar-warning {
  background-color: #f0ad4e;
}
.progress-striped .progress-bar-warning {
  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
}
.progress-bar-danger {
  background-color: #d9534f;
}
.progress-striped .progress-bar-danger {
  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
}
.media {
  margin-top: 15px;
}
.media:first-child {
  margin-top: 0;
}
.media,
.media-body {
  zoom: 1;
  overflow: hidden;
}
.media-body {
  width: 10000px;
}
.media-object {
  display: block;
}
.media-object.img-thumbnail {
  max-width: none;
}
.media-right,
.media > .pull-right {
  padding-left: 10px;
}
.media-left,
.media > .pull-left {
  padding-right: 10px;
}
.media-left,
.media-right,
.media-body {
  display: table-cell;
  vertical-align: top;
}
.media-middle {
  vertical-align: middle;
}
.media-bottom {
  vertical-align: bottom;
}
.media-heading {
  margin-top: 0;
  margin-bottom: 5px;
}
.media-list {
  padding-left: 0;
  list-style: none;
}
.list-group {
  margin-bottom: 20px;
  padding-left: 0;
}
.list-group-item {
  position: relative;
  display: block;
  padding: 10px 15px;
  margin-bottom: -1px;
  background-color: #fff;
  border: 1px solid #ddd;
}
.list-group-item:first-child {
  border-top-right-radius: 2px;
  border-top-left-radius: 2px;
}
.list-group-item:last-child {
  margin-bottom: 0;
  border-bottom-right-radius: 2px;
  border-bottom-left-radius: 2px;
}
a.list-group-item,
button.list-group-item {
  color: #555;
}
a.list-group-item .list-group-item-heading,
button.list-group-item .list-group-item-heading {
  color: #333;
}
a.list-group-item:hover,
button.list-group-item:hover,
a.list-group-item:focus,
button.list-group-item:focus {
  text-decoration: none;
  color: #555;
  background-color: #f5f5f5;
}
button.list-group-item {
  width: 100%;
  text-align: left;
}
.list-group-item.disabled,
.list-group-item.disabled:hover,
.list-group-item.disabled:focus {
  background-color: #eeeeee;
  color: #777777;
  cursor: not-allowed;
}
.list-group-item.disabled .list-group-item-heading,
.list-group-item.disabled:hover .list-group-item-heading,
.list-group-item.disabled:focus .list-group-item-heading {
  color: inherit;
}
.list-group-item.disabled .list-group-item-text,
.list-group-item.disabled:hover .list-group-item-text,
.list-group-item.disabled:focus .list-group-item-text {
  color: #777777;
}
.list-group-item.active,
.list-group-item.active:hover,
.list-group-item.active:focus {
  z-index: 2;
  color: #fff;
  background-color: #337ab7;
  border-color: #337ab7;
}
.list-group-item.active .list-group-item-heading,
.list-group-item.active:hover .list-group-item-heading,
.list-group-item.active:focus .list-group-item-heading,
.list-group-item.active .list-group-item-heading > small,
.list-group-item.active:hover .list-group-item-heading > small,
.list-group-item.active:focus .list-group-item-heading > small,
.list-group-item.active .list-group-item-heading > .small,
.list-group-item.active:hover .list-group-item-heading > .small,
.list-group-item.active:focus .list-group-item-heading > .small {
  color: inherit;
}
.list-group-item.active .list-group-item-text,
.list-group-item.active:hover .list-group-item-text,
.list-group-item.active:focus .list-group-item-text {
  color: #c7ddef;
}
.list-group-item-success {
  color: #3c763d;
  background-color: #dff0d8;
}
a.list-group-item-success,
button.list-group-item-success {
  color: #3c763d;
}
a.list-group-item-success .list-group-item-heading,
button.list-group-item-success .list-group-item-heading {
  color: inherit;
}
a.list-group-item-success:hover,
button.list-group-item-success:hover,
a.list-group-item-success:focus,
button.list-group-item-success:focus {
  color: #3c763d;
  background-color: #d0e9c6;
}
a.list-group-item-success.active,
button.list-group-item-success.active,
a.list-group-item-success.active:hover,
button.list-group-item-success.active:hover,
a.list-group-item-success.active:focus,
button.list-group-item-success.active:focus {
  color: #fff;
  background-color: #3c763d;
  border-color: #3c763d;
}
.list-group-item-info {
  color: #31708f;
  background-color: #d9edf7;
}
a.list-group-item-info,
button.list-group-item-info {
  color: #31708f;
}
a.list-group-item-info .list-group-item-heading,
button.list-group-item-info .list-group-item-heading {
  color: inherit;
}
a.list-group-item-info:hover,
button.list-group-item-info:hover,
a.list-group-item-info:focus,
button.list-group-item-info:focus {
  color: #31708f;
  background-color: #c4e3f3;
}
a.list-group-item-info.active,
button.list-group-item-info.active,
a.list-group-item-info.active:hover,
button.list-group-item-info.active:hover,
a.list-group-item-info.active:focus,
button.list-group-item-info.active:focus {
  color: #fff;
  background-color: #31708f;
  border-color: #31708f;
}
.list-group-item-warning {
  color: #8a6d3b;
  background-color: #fcf8e3;
}
a.list-group-item-warning,
button.list-group-item-warning {
  color: #8a6d3b;
}
a.list-group-item-warning .list-group-item-heading,
button.list-group-item-warning .list-group-item-heading {
  color: inherit;
}
a.list-group-item-warning:hover,
button.list-group-item-warning:hover,
a.list-group-item-warning:focus,
button.list-group-item-warning:focus {
  color: #8a6d3b;
  background-color: #faf2cc;
}
a.list-group-item-warning.active,
button.list-group-item-warning.active,
a.list-group-item-warning.active:hover,
button.list-group-item-warning.active:hover,
a.list-group-item-warning.active:focus,
button.list-group-item-warning.active:focus {
  color: #fff;
  background-color: #8a6d3b;
  border-color: #8a6d3b;
}
.list-group-item-danger {
  color: #a94442;
  background-color: #f2dede;
}
a.list-group-item-danger,
button.list-group-item-danger {
  color: #a94442;
}
a.list-group-item-danger .list-group-item-heading,
button.list-group-item-danger .list-group-item-heading {
  color: inherit;
}
a.list-group-item-danger:hover,
button.list-group-item-danger:hover,
a.list-group-item-danger:focus,
button.list-group-item-danger:focus {
  color: #a94442;
  background-color: #ebcccc;
}
a.list-group-item-danger.active,
button.list-group-item-danger.active,
a.list-group-item-danger.active:hover,
button.list-group-item-danger.active:hover,
a.list-group-item-danger.active:focus,
button.list-group-item-danger.active:focus {
  color: #fff;
  background-color: #a94442;
  border-color: #a94442;
}
.list-group-item-heading {
  margin-top: 0;
  margin-bottom: 5px;
}
.list-group-item-text {
  margin-bottom: 0;
  line-height: 1.3;
}
.panel {
  margin-bottom: 18px;
  background-color: #fff;
  border: 1px solid transparent;
  border-radius: 2px;
  -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
}
.panel-body {
  padding: 15px;
}
.panel-heading {
  padding: 10px 15px;
  border-bottom: 1px solid transparent;
  border-top-right-radius: 1px;
  border-top-left-radius: 1px;
}
.panel-heading > .dropdown .dropdown-toggle {
  color: inherit;
}
.panel-title {
  margin-top: 0;
  margin-bottom: 0;
  font-size: 15px;
  color: inherit;
}
.panel-title > a,
.panel-title > small,
.panel-title > .small,
.panel-title > small > a,
.panel-title > .small > a {
  color: inherit;
}
.panel-footer {
  padding: 10px 15px;
  background-color: #f5f5f5;
  border-top: 1px solid #ddd;
  border-bottom-right-radius: 1px;
  border-bottom-left-radius: 1px;
}
.panel > .list-group,
.panel > .panel-collapse > .list-group {
  margin-bottom: 0;
}
.panel > .list-group .list-group-item,
.panel > .panel-collapse > .list-group .list-group-item {
  border-width: 1px 0;
  border-radius: 0;
}
.panel > .list-group:first-child .list-group-item:first-child,
.panel > .panel-collapse > .list-group:first-child .list-group-item:first-child {
  border-top: 0;
  border-top-right-radius: 1px;
  border-top-left-radius: 1px;
}
.panel > .list-group:last-child .list-group-item:last-child,
.panel > .panel-collapse > .list-group:last-child .list-group-item:last-child {
  border-bottom: 0;
  border-bottom-right-radius: 1px;
  border-bottom-left-radius: 1px;
}
.panel > .panel-heading + .panel-collapse > .list-group .list-group-item:first-child {
  border-top-right-radius: 0;
  border-top-left-radius: 0;
}
.panel-heading + .list-group .list-group-item:first-child {
  border-top-width: 0;
}
.list-group + .panel-footer {
  border-top-width: 0;
}
.panel > .table,
.panel > .table-responsive > .table,
.panel > .panel-collapse > .table {
  margin-bottom: 0;
}
.panel > .table caption,
.panel > .table-responsive > .table caption,
.panel > .panel-collapse > .table caption {
  padding-left: 15px;
  padding-right: 15px;
}
.panel > .table:first-child,
.panel > .table-responsive:first-child > .table:first-child {
  border-top-right-radius: 1px;
  border-top-left-radius: 1px;
}
.panel > .table:first-child > thead:first-child > tr:first-child,
.panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child,
.panel > .table:first-child > tbody:first-child > tr:first-child,
.panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child {
  border-top-left-radius: 1px;
  border-top-right-radius: 1px;
}
.panel > .table:first-child > thead:first-child > tr:first-child td:first-child,
.panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:first-child,
.panel > .table:first-child > tbody:first-child > tr:first-child td:first-child,
.panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:first-child,
.panel > .table:first-child > thead:first-child > tr:first-child th:first-child,
.panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:first-child,
.panel > .table:first-child > tbody:first-child > tr:first-child th:first-child,
.panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:first-child {
  border-top-left-radius: 1px;
}
.panel > .table:first-child > thead:first-child > tr:first-child td:last-child,
.panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:last-child,
.panel > .table:first-child > tbody:first-child > tr:first-child td:last-child,
.panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:last-child,
.panel > .table:first-child > thead:first-child > tr:first-child th:last-child,
.panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:last-child,
.panel > .table:first-child > tbody:first-child > tr:first-child th:last-child,
.panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:last-child {
  border-top-right-radius: 1px;
}
.panel > .table:last-child,
.panel > .table-responsive:last-child > .table:last-child {
  border-bottom-right-radius: 1px;
  border-bottom-left-radius: 1px;
}
.panel > .table:last-child > tbody:last-child > tr:last-child,
.panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child,
.panel > .table:last-child > tfoot:last-child > tr:last-child,
.panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child {
  border-bottom-left-radius: 1px;
  border-bottom-right-radius: 1px;
}
.panel > .table:last-child > tbody:last-child > tr:last-child td:first-child,
.panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:first-child,
.panel > .table:last-child > tfoot:last-child > tr:last-child td:first-child,
.panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:first-child,
.panel > .table:last-child > tbody:last-child > tr:last-child th:first-child,
.panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:first-child,
.panel > .table:last-child > tfoot:last-child > tr:last-child th:first-child,
.panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:first-child {
  border-bottom-left-radius: 1px;
}
.panel > .table:last-child > tbody:last-child > tr:last-child td:last-child,
.panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:last-child,
.panel > .table:last-child > tfoot:last-child > tr:last-child td:last-child,
.panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:last-child,
.panel > .table:last-child > tbody:last-child > tr:last-child th:last-child,
.panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:last-child,
.panel > .table:last-child > tfoot:last-child > tr:last-child th:last-child,
.panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:last-child {
  border-bottom-right-radius: 1px;
}
.panel > .panel-body + .table,
.panel > .panel-body + .table-responsive,
.panel > .table + .panel-body,
.panel > .table-responsive + .panel-body {
  border-top: 1px solid #ddd;
}
.panel > .table > tbody:first-child > tr:first-child th,
.panel > .table > tbody:first-child > tr:first-child td {
  border-top: 0;
}
.panel > .table-bordered,
.panel > .table-responsive > .table-bordered {
  border: 0;
}
.panel > .table-bordered > thead > tr > th:first-child,
.panel > .table-responsive > .table-bordered > thead > tr > th:first-child,
.panel > .table-bordered > tbody > tr > th:first-child,
.panel > .table-responsive > .table-bordered > tbody > tr > th:first-child,
.panel > .table-bordered > tfoot > tr > th:first-child,
.panel > .table-responsive > .table-bordered > tfoot > tr > th:first-child,
.panel > .table-bordered > thead > tr > td:first-child,
.panel > .table-responsive > .table-bordered > thead > tr > td:first-child,
.panel > .table-bordered > tbody > tr > td:first-child,
.panel > .table-responsive > .table-bordered > tbody > tr > td:first-child,
.panel > .table-bordered > tfoot > tr > td:first-child,
.panel > .table-responsive > .table-bordered > tfoot > tr > td:first-child {
  border-left: 0;
}
.panel > .table-bordered > thead > tr > th:last-child,
.panel > .table-responsive > .table-bordered > thead > tr > th:last-child,
.panel > .table-bordered > tbody > tr > th:last-child,
.panel > .table-responsive > .table-bordered > tbody > tr > th:last-child,
.panel > .table-bordered > tfoot > tr > th:last-child,
.panel > .table-responsive > .table-bordered > tfoot > tr > th:last-child,
.panel > .table-bordered > thead > tr > td:last-child,
.panel > .table-responsive > .table-bordered > thead > tr > td:last-child,
.panel > .table-bordered > tbody > tr > td:last-child,
.panel > .table-responsive > .table-bordered > tbody > tr > td:last-child,
.panel > .table-bordered > tfoot > tr > td:last-child,
.panel > .table-responsive > .table-bordered > tfoot > tr > td:last-child {
  border-right: 0;
}
.panel > .table-bordered > thead > tr:first-child > td,
.panel > .table-responsive > .table-bordered > thead > tr:first-child > td,
.panel > .table-bordered > tbody > tr:first-child > td,
.panel > .table-responsive > .table-bordered > tbody > tr:first-child > td,
.panel > .table-bordered > thead > tr:first-child > th,
.panel > .table-responsive > .table-bordered > thead > tr:first-child > th,
.panel > .table-bordered > tbody > tr:first-child > th,
.panel > .table-responsive > .table-bordered > tbody > tr:first-child > th {
  border-bottom: 0;
}
.panel > .table-bordered > tbody > tr:last-child > td,
.panel > .table-responsive > .table-bordered > tbody > tr:last-child > td,
.panel > .table-bordered > tfoot > tr:last-child > td,
.panel > .table-responsive > .table-bordered > tfoot > tr:last-child > td,
.panel > .table-bordered > tbody > tr:last-child > th,
.panel > .table-responsive > .table-bordered > tbody > tr:last-child > th,
.panel > .table-bordered > tfoot > tr:last-child > th,
.panel > .table-responsive > .table-bordered > tfoot > tr:last-child > th {
  border-bottom: 0;
}
.panel > .table-responsive {
  border: 0;
  margin-bottom: 0;
}
.panel-group {
  margin-bottom: 18px;
}
.panel-group .panel {
  margin-bottom: 0;
  border-radius: 2px;
}
.panel-group .panel + .panel {
  margin-top: 5px;
}
.panel-group .panel-heading {
  border-bottom: 0;
}
.panel-group .panel-heading + .panel-collapse > .panel-body,
.panel-group .panel-heading + .panel-collapse > .list-group {
  border-top: 1px solid #ddd;
}
.panel-group .panel-footer {
  border-top: 0;
}
.panel-group .panel-footer + .panel-collapse .panel-body {
  border-bottom: 1px solid #ddd;
}
.panel-default {
  border-color: #ddd;
}
.panel-default > .panel-heading {
  color: #333333;
  background-color: #f5f5f5;
  border-color: #ddd;
}
.panel-default > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #ddd;
}
.panel-default > .panel-heading .badge {
  color: #f5f5f5;
  background-color: #333333;
}
.panel-default > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #ddd;
}
.panel-primary {
  border-color: #337ab7;
}
.panel-primary > .panel-heading {
  color: #fff;
  background-color: #337ab7;
  border-color: #337ab7;
}
.panel-primary > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #337ab7;
}
.panel-primary > .panel-heading .badge {
  color: #337ab7;
  background-color: #fff;
}
.panel-primary > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #337ab7;
}
.panel-success {
  border-color: #d6e9c6;
}
.panel-success > .panel-heading {
  color: #3c763d;
  background-color: #dff0d8;
  border-color: #d6e9c6;
}
.panel-success > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #d6e9c6;
}
.panel-success > .panel-heading .badge {
  color: #dff0d8;
  background-color: #3c763d;
}
.panel-success > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #d6e9c6;
}
.panel-info {
  border-color: #bce8f1;
}
.panel-info > .panel-heading {
  color: #31708f;
  background-color: #d9edf7;
  border-color: #bce8f1;
}
.panel-info > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #bce8f1;
}
.panel-info > .panel-heading .badge {
  color: #d9edf7;
  background-color: #31708f;
}
.panel-info > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #bce8f1;
}
.panel-warning {
  border-color: #faebcc;
}
.panel-warning > .panel-heading {
  color: #8a6d3b;
  background-color: #fcf8e3;
  border-color: #faebcc;
}
.panel-warning > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #faebcc;
}
.panel-warning > .panel-heading .badge {
  color: #fcf8e3;
  background-color: #8a6d3b;
}
.panel-warning > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #faebcc;
}
.panel-danger {
  border-color: #ebccd1;
}
.panel-danger > .panel-heading {
  color: #a94442;
  background-color: #f2dede;
  border-color: #ebccd1;
}
.panel-danger > .panel-heading + .panel-collapse > .panel-body {
  border-top-color: #ebccd1;
}
.panel-danger > .panel-heading .badge {
  color: #f2dede;
  background-color: #a94442;
}
.panel-danger > .panel-footer + .panel-collapse > .panel-body {
  border-bottom-color: #ebccd1;
}
.embed-responsive {
  position: relative;
  display: block;
  height: 0;
  padding: 0;
  overflow: hidden;
}
.embed-responsive .embed-responsive-item,
.embed-responsive iframe,
.embed-responsive embed,
.embed-responsive object,
.embed-responsive video {
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  height: 100%;
  width: 100%;
  border: 0;
}
.embed-responsive-16by9 {
  padding-bottom: 56.25%;
}
.embed-responsive-4by3 {
  padding-bottom: 75%;
}
.well {
  min-height: 20px;
  padding: 19px;
  margin-bottom: 20px;
  background-color: #f5f5f5;
  border: 1px solid #e3e3e3;
  border-radius: 2px;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);
}
.well blockquote {
  border-color: #ddd;
  border-color: rgba(0, 0, 0, 0.15);
}
.well-lg {
  padding: 24px;
  border-radius: 3px;
}
.well-sm {
  padding: 9px;
  border-radius: 1px;
}
.close {
  float: right;
  font-size: 19.5px;
  font-weight: bold;
  line-height: 1;
  color: #000;
  text-shadow: 0 1px 0 #fff;
  opacity: 0.2;
  filter: alpha(opacity=20);
}
.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
  opacity: 0.5;
  filter: alpha(opacity=50);
}
button.close {
  padding: 0;
  cursor: pointer;
  background: transparent;
  border: 0;
  -webkit-appearance: none;
}
.modal-open {
  overflow: hidden;
}
.modal {
  display: none;
  overflow: hidden;
  position: fixed;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1050;
  -webkit-overflow-scrolling: touch;
  outline: 0;
}
.modal.fade .modal-dialog {
  -webkit-transform: translate(0, -25%);
  -ms-transform: translate(0, -25%);
  -o-transform: translate(0, -25%);
  transform: translate(0, -25%);
  -webkit-transition: -webkit-transform 0.3s ease-out;
  -moz-transition: -moz-transform 0.3s ease-out;
  -o-transition: -o-transform 0.3s ease-out;
  transition: transform 0.3s ease-out;
}
.modal.in .modal-dialog {
  -webkit-transform: translate(0, 0);
  -ms-transform: translate(0, 0);
  -o-transform: translate(0, 0);
  transform: translate(0, 0);
}
.modal-open .modal {
  overflow-x: hidden;
  overflow-y: auto;
}
.modal-dialog {
  position: relative;
  width: auto;
  margin: 10px;
}
.modal-content {
  position: relative;
  background-color: #fff;
  border: 1px solid #999;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 3px;
  -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
  box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
  background-clip: padding-box;
  outline: 0;
}
.modal-backdrop {
  position: fixed;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1040;
  background-color: #000;
}
.modal-backdrop.fade {
  opacity: 0;
  filter: alpha(opacity=0);
}
.modal-backdrop.in {
  opacity: 0.5;
  filter: alpha(opacity=50);
}
.modal-header {
  padding: 15px;
  border-bottom: 1px solid #e5e5e5;
}
.modal-header .close {
  margin-top: -2px;
}
.modal-title {
  margin: 0;
  line-height: 1.42857143;
}
.modal-body {
  position: relative;
  padding: 15px;
}
.modal-footer {
  padding: 15px;
  text-align: right;
  border-top: 1px solid #e5e5e5;
}
.modal-footer .btn + .btn {
  margin-left: 5px;
  margin-bottom: 0;
}
.modal-footer .btn-group .btn + .btn {
  margin-left: -1px;
}
.modal-footer .btn-block + .btn-block {
  margin-left: 0;
}
.modal-scrollbar-measure {
  position: absolute;
  top: -9999px;
  width: 50px;
  height: 50px;
  overflow: scroll;
}
@media (min-width: 768px) {
  .modal-dialog {
    width: 600px;
    margin: 30px auto;
  }
  .modal-content {
    -webkit-box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
  }
  .modal-sm {
    width: 300px;
  }
}
@media (min-width: 992px) {
  .modal-lg {
    width: 900px;
  }
}
.tooltip {
  position: absolute;
  z-index: 1070;
  display: block;
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-style: normal;
  font-weight: normal;
  letter-spacing: normal;
  line-break: auto;
  line-height: 1.42857143;
  text-align: left;
  text-align: start;
  text-decoration: none;
  text-shadow: none;
  text-transform: none;
  white-space: normal;
  word-break: normal;
  word-spacing: normal;
  word-wrap: normal;
  font-size: 12px;
  opacity: 0;
  filter: alpha(opacity=0);
}
.tooltip.in {
  opacity: 0.9;
  filter: alpha(opacity=90);
}
.tooltip.top {
  margin-top: -3px;
  padding: 5px 0;
}
.tooltip.right {
  margin-left: 3px;
  padding: 0 5px;
}
.tooltip.bottom {
  margin-top: 3px;
  padding: 5px 0;
}
.tooltip.left {
  margin-left: -3px;
  padding: 0 5px;
}
.tooltip-inner {
  max-width: 200px;
  padding: 3px 8px;
  color: #fff;
  text-align: center;
  background-color: #000;
  border-radius: 2px;
}
.tooltip-arrow {
  position: absolute;
  width: 0;
  height: 0;
  border-color: transparent;
  border-style: solid;
}
.tooltip.top .tooltip-arrow {
  bottom: 0;
  left: 50%;
  margin-left: -5px;
  border-width: 5px 5px 0;
  border-top-color: #000;
}
.tooltip.top-left .tooltip-arrow {
  bottom: 0;
  right: 5px;
  margin-bottom: -5px;
  border-width: 5px 5px 0;
  border-top-color: #000;
}
.tooltip.top-right .tooltip-arrow {
  bottom: 0;
  left: 5px;
  margin-bottom: -5px;
  border-width: 5px 5px 0;
  border-top-color: #000;
}
.tooltip.right .tooltip-arrow {
  top: 50%;
  left: 0;
  margin-top: -5px;
  border-width: 5px 5px 5px 0;
  border-right-color: #000;
}
.tooltip.left .tooltip-arrow {
  top: 50%;
  right: 0;
  margin-top: -5px;
  border-width: 5px 0 5px 5px;
  border-left-color: #000;
}
.tooltip.bottom .tooltip-arrow {
  top: 0;
  left: 50%;
  margin-left: -5px;
  border-width: 0 5px 5px;
  border-bottom-color: #000;
}
.tooltip.bottom-left .tooltip-arrow {
  top: 0;
  right: 5px;
  margin-top: -5px;
  border-width: 0 5px 5px;
  border-bottom-color: #000;
}
.tooltip.bottom-right .tooltip-arrow {
  top: 0;
  left: 5px;
  margin-top: -5px;
  border-width: 0 5px 5px;
  border-bottom-color: #000;
}
.popover {
  position: absolute;
  top: 0;
  left: 0;
  z-index: 1060;
  display: none;
  max-width: 276px;
  padding: 1px;
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-style: normal;
  font-weight: normal;
  letter-spacing: normal;
  line-break: auto;
  line-height: 1.42857143;
  text-align: left;
  text-align: start;
  text-decoration: none;
  text-shadow: none;
  text-transform: none;
  white-space: normal;
  word-break: normal;
  word-spacing: normal;
  word-wrap: normal;
  font-size: 13px;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid #ccc;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 3px;
  -webkit-box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
}
.popover.top {
  margin-top: -10px;
}
.popover.right {
  margin-left: 10px;
}
.popover.bottom {
  margin-top: 10px;
}
.popover.left {
  margin-left: -10px;
}
.popover-title {
  margin: 0;
  padding: 8px 14px;
  font-size: 13px;
  background-color: #f7f7f7;
  border-bottom: 1px solid #ebebeb;
  border-radius: 2px 2px 0 0;
}
.popover-content {
  padding: 9px 14px;
}
.popover > .arrow,
.popover > .arrow:after {
  position: absolute;
  display: block;
  width: 0;
  height: 0;
  border-color: transparent;
  border-style: solid;
}
.popover > .arrow {
  border-width: 11px;
}
.popover > .arrow:after {
  border-width: 10px;
  content: "";
}
.popover.top > .arrow {
  left: 50%;
  margin-left: -11px;
  border-bottom-width: 0;
  border-top-color: #999999;
  border-top-color: rgba(0, 0, 0, 0.25);
  bottom: -11px;
}
.popover.top > .arrow:after {
  content: " ";
  bottom: 1px;
  margin-left: -10px;
  border-bottom-width: 0;
  border-top-color: #fff;
}
.popover.right > .arrow {
  top: 50%;
  left: -11px;
  margin-top: -11px;
  border-left-width: 0;
  border-right-color: #999999;
  border-right-color: rgba(0, 0, 0, 0.25);
}
.popover.right > .arrow:after {
  content: " ";
  left: 1px;
  bottom: -10px;
  border-left-width: 0;
  border-right-color: #fff;
}
.popover.bottom > .arrow {
  left: 50%;
  margin-left: -11px;
  border-top-width: 0;
  border-bottom-color: #999999;
  border-bottom-color: rgba(0, 0, 0, 0.25);
  top: -11px;
}
.popover.bottom > .arrow:after {
  content: " ";
  top: 1px;
  margin-left: -10px;
  border-top-width: 0;
  border-bottom-color: #fff;
}
.popover.left > .arrow {
  top: 50%;
  right: -11px;
  margin-top: -11px;
  border-right-width: 0;
  border-left-color: #999999;
  border-left-color: rgba(0, 0, 0, 0.25);
}
.popover.left > .arrow:after {
  content: " ";
  right: 1px;
  border-right-width: 0;
  border-left-color: #fff;
  bottom: -10px;
}
.carousel {
  position: relative;
}
.carousel-inner {
  position: relative;
  overflow: hidden;
  width: 100%;
}
.carousel-inner > .item {
  display: none;
  position: relative;
  -webkit-transition: 0.6s ease-in-out left;
  -o-transition: 0.6s ease-in-out left;
  transition: 0.6s ease-in-out left;
}
.carousel-inner > .item > img,
.carousel-inner > .item > a > img {
  line-height: 1;
}
@media all and (transform-3d), (-webkit-transform-3d) {
  .carousel-inner > .item {
    -webkit-transition: -webkit-transform 0.6s ease-in-out;
    -moz-transition: -moz-transform 0.6s ease-in-out;
    -o-transition: -o-transform 0.6s ease-in-out;
    transition: transform 0.6s ease-in-out;
    -webkit-backface-visibility: hidden;
    -moz-backface-visibility: hidden;
    backface-visibility: hidden;
    -webkit-perspective: 1000px;
    -moz-perspective: 1000px;
    perspective: 1000px;
  }
  .carousel-inner > .item.next,
  .carousel-inner > .item.active.right {
    -webkit-transform: translate3d(100%, 0, 0);
    transform: translate3d(100%, 0, 0);
    left: 0;
  }
  .carousel-inner > .item.prev,
  .carousel-inner > .item.active.left {
    -webkit-transform: translate3d(-100%, 0, 0);
    transform: translate3d(-100%, 0, 0);
    left: 0;
  }
  .carousel-inner > .item.next.left,
  .carousel-inner > .item.prev.right,
  .carousel-inner > .item.active {
    -webkit-transform: translate3d(0, 0, 0);
    transform: translate3d(0, 0, 0);
    left: 0;
  }
}
.carousel-inner > .active,
.carousel-inner > .next,
.carousel-inner > .prev {
  display: block;
}
.carousel-inner > .active {
  left: 0;
}
.carousel-inner > .next,
.carousel-inner > .prev {
  position: absolute;
  top: 0;
  width: 100%;
}
.carousel-inner > .next {
  left: 100%;
}
.carousel-inner > .prev {
  left: -100%;
}
.carousel-inner > .next.left,
.carousel-inner > .prev.right {
  left: 0;
}
.carousel-inner > .active.left {
  left: -100%;
}
.carousel-inner > .active.right {
  left: 100%;
}
.carousel-control {
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  width: 15%;
  opacity: 0.5;
  filter: alpha(opacity=50);
  font-size: 20px;
  color: #fff;
  text-align: center;
  text-shadow: 0 1px 2px rgba(0, 0, 0, 0.6);
  background-color: rgba(0, 0, 0, 0);
}
.carousel-control.left {
  background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.0001) 100%);
  background-image: -o-linear-gradient(left, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.0001) 100%);
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.0001) 100%);
  background-repeat: repeat-x;
  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#80000000', endColorstr='#00000000', GradientType=1);
}
.carousel-control.right {
  left: auto;
  right: 0;
  background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.0001) 0%, rgba(0, 0, 0, 0.5) 100%);
  background-image: -o-linear-gradient(left, rgba(0, 0, 0, 0.0001) 0%, rgba(0, 0, 0, 0.5) 100%);
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.0001) 0%, rgba(0, 0, 0, 0.5) 100%);
  background-repeat: repeat-x;
  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#00000000', endColorstr='#80000000', GradientType=1);
}
.carousel-control:hover,
.carousel-control:focus {
  outline: 0;
  color: #fff;
  text-decoration: none;
  opacity: 0.9;
  filter: alpha(opacity=90);
}
.carousel-control .icon-prev,
.carousel-control .icon-next,
.carousel-control .glyphicon-chevron-left,
.carousel-control .glyphicon-chevron-right {
  position: absolute;
  top: 50%;
  margin-top: -10px;
  z-index: 5;
  display: inline-block;
}
.carousel-control .icon-prev,
.carousel-control .glyphicon-chevron-left {
  left: 50%;
  margin-left: -10px;
}
.carousel-control .icon-next,
.carousel-control .glyphicon-chevron-right {
  right: 50%;
  margin-right: -10px;
}
.carousel-control .icon-prev,
.carousel-control .icon-next {
  width: 20px;
  height: 20px;
  line-height: 1;
  font-family: serif;
}
.carousel-control .icon-prev:before {
  content: '\2039';
}
.carousel-control .icon-next:before {
  content: '\203a';
}
.carousel-indicators {
  position: absolute;
  bottom: 10px;
  left: 50%;
  z-index: 15;
  width: 60%;
  margin-left: -30%;
  padding-left: 0;
  list-style: none;
  text-align: center;
}
.carousel-indicators li {
  display: inline-block;
  width: 10px;
  height: 10px;
  margin: 1px;
  text-indent: -999px;
  border: 1px solid #fff;
  border-radius: 10px;
  cursor: pointer;
  background-color: #000 \9;
  background-color: rgba(0, 0, 0, 0);
}
.carousel-indicators .active {
  margin: 0;
  width: 12px;
  height: 12px;
  background-color: #fff;
}
.carousel-caption {
  position: absolute;
  left: 15%;
  right: 15%;
  bottom: 20px;
  z-index: 10;
  padding-top: 20px;
  padding-bottom: 20px;
  color: #fff;
  text-align: center;
  text-shadow: 0 1px 2px rgba(0, 0, 0, 0.6);
}
.carousel-caption .btn {
  text-shadow: none;
}
@media screen and (min-width: 768px) {
  .carousel-control .glyphicon-chevron-left,
  .carousel-control .glyphicon-chevron-right,
  .carousel-control .icon-prev,
  .carousel-control .icon-next {
    width: 30px;
    height: 30px;
    margin-top: -10px;
    font-size: 30px;
  }
  .carousel-control .glyphicon-chevron-left,
  .carousel-control .icon-prev {
    margin-left: -10px;
  }
  .carousel-control .glyphicon-chevron-right,
  .carousel-control .icon-next {
    margin-right: -10px;
  }
  .carousel-caption {
    left: 20%;
    right: 20%;
    padding-bottom: 30px;
  }
  .carousel-indicators {
    bottom: 20px;
  }
}
.clearfix:before,
.clearfix:after,
.dl-horizontal dd:before,
.dl-horizontal dd:after,
.container:before,
.container:after,
.container-fluid:before,
.container-fluid:after,
.row:before,
.row:after,
.form-horizontal .form-group:before,
.form-horizontal .form-group:after,
.btn-toolbar:before,
.btn-toolbar:after,
.btn-group-vertical > .btn-group:before,
.btn-group-vertical > .btn-group:after,
.nav:before,
.nav:after,
.navbar:before,
.navbar:after,
.navbar-header:before,
.navbar-header:after,
.navbar-collapse:before,
.navbar-collapse:after,
.pager:before,
.pager:after,
.panel-body:before,
.panel-body:after,
.modal-header:before,
.modal-header:after,
.modal-footer:before,
.modal-footer:after,
.item_buttons:before,
.item_buttons:after {
  content: " ";
  display: table;
}
.clearfix:after,
.dl-horizontal dd:after,
.container:after,
.container-fluid:after,
.row:after,
.form-horizontal .form-group:after,
.btn-toolbar:after,
.btn-group-vertical > .btn-group:after,
.nav:after,
.navbar:after,
.navbar-header:after,
.navbar-collapse:after,
.pager:after,
.panel-body:after,
.modal-header:after,
.modal-footer:after,
.item_buttons:after {
  clear: both;
}
.center-block {
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.pull-right {
  float: right !important;
}
.pull-left {
  float: left !important;
}
.hide {
  display: none !important;
}
.show {
  display: block !important;
}
.invisible {
  visibility: hidden;
}
.text-hide {
  font: 0/0 a;
  color: transparent;
  text-shadow: none;
  background-color: transparent;
  border: 0;
}
.hidden {
  display: none !important;
}
.affix {
  position: fixed;
}
@-ms-viewport {
  width: device-width;
}
.visible-xs,
.visible-sm,
.visible-md,
.visible-lg {
  display: none !important;
}
.visible-xs-block,
.visible-xs-inline,
.visible-xs-inline-block,
.visible-sm-block,
.visible-sm-inline,
.visible-sm-inline-block,
.visible-md-block,
.visible-md-inline,
.visible-md-inline-block,
.visible-lg-block,
.visible-lg-inline,
.visible-lg-inline-block {
  display: none !important;
}
@media (max-width: 767px) {
  .visible-xs {
    display: block !important;
  }
  table.visible-xs {
    display: table !important;
  }
  tr.visible-xs {
    display: table-row !important;
  }
  th.visible-xs,
  td.visible-xs {
    display: table-cell !important;
  }
}
@media (max-width: 767px) {
  .visible-xs-block {
    display: block !important;
  }
}
@media (max-width: 767px) {
  .visible-xs-inline {
    display: inline !important;
  }
}
@media (max-width: 767px) {
  .visible-xs-inline-block {
    display: inline-block !important;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  .visible-sm {
    display: block !important;
  }
  table.visible-sm {
    display: table !important;
  }
  tr.visible-sm {
    display: table-row !important;
  }
  th.visible-sm,
  td.visible-sm {
    display: table-cell !important;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  .visible-sm-block {
    display: block !important;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  .visible-sm-inline {
    display: inline !important;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  .visible-sm-inline-block {
    display: inline-block !important;
  }
}
@media (min-width: 992px) and (max-width: 1199px) {
  .visible-md {
    display: block !important;
  }
  table.visible-md {
    display: table !important;
  }
  tr.visible-md {
    display: table-row !important;
  }
  th.visible-md,
  td.visible-md {
    display: table-cell !important;
  }
}
@media (min-width: 992px) and (max-width: 1199px) {
  .visible-md-block {
    display: block !important;
  }
}
@media (min-width: 992px) and (max-width: 1199px) {
  .visible-md-inline {
    display: inline !important;
  }
}
@media (min-width: 992px) and (max-width: 1199px) {
  .visible-md-inline-block {
    display: inline-block !important;
  }
}
@media (min-width: 1200px) {
  .visible-lg {
    display: block !important;
  }
  table.visible-lg {
    display: table !important;
  }
  tr.visible-lg {
    display: table-row !important;
  }
  th.visible-lg,
  td.visible-lg {
    display: table-cell !important;
  }
}
@media (min-width: 1200px) {
  .visible-lg-block {
    display: block !important;
  }
}
@media (min-width: 1200px) {
  .visible-lg-inline {
    display: inline !important;
  }
}
@media (min-width: 1200px) {
  .visible-lg-inline-block {
    display: inline-block !important;
  }
}
@media (max-width: 767px) {
  .hidden-xs {
    display: none !important;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  .hidden-sm {
    display: none !important;
  }
}
@media (min-width: 992px) and (max-width: 1199px) {
  .hidden-md {
    display: none !important;
  }
}
@media (min-width: 1200px) {
  .hidden-lg {
    display: none !important;
  }
}
.visible-print {
  display: none !important;
}
@media print {
  .visible-print {
    display: block !important;
  }
  table.visible-print {
    display: table !important;
  }
  tr.visible-print {
    display: table-row !important;
  }
  th.visible-print,
  td.visible-print {
    display: table-cell !important;
  }
}
.visible-print-block {
  display: none !important;
}
@media print {
  .visible-print-block {
    display: block !important;
  }
}
.visible-print-inline {
  display: none !important;
}
@media print {
  .visible-print-inline {
    display: inline !important;
  }
}
.visible-print-inline-block {
  display: none !important;
}
@media print {
  .visible-print-inline-block {
    display: inline-block !important;
  }
}
@media print {
  .hidden-print {
    display: none !important;
  }
}
/*!
*
* Font Awesome
*
*/
/*!
 *  Font Awesome 4.2.0 by @davegandy - http://fontawesome.io - @fontawesome
 *  License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
 */
/* FONT PATH
 * -------------------------- */
@font-face {
  font-family: 'FontAwesome';
  src: url('../components/font-awesome/fonts/fontawesome-webfont.eot?v=4.2.0');
  src: url('../components/font-awesome/fonts/fontawesome-webfont.eot?#iefix&v=4.2.0') format('embedded-opentype'), url('../components/font-awesome/fonts/fontawesome-webfont.woff?v=4.2.0') format('woff'), url('../components/font-awesome/fonts/fontawesome-webfont.ttf?v=4.2.0') format('truetype'), url('../components/font-awesome/fonts/fontawesome-webfont.svg?v=4.2.0#fontawesomeregular') format('svg');
  font-weight: normal;
  font-style: normal;
}
.fa {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
/* makes the font 33% larger relative to the icon container */
.fa-lg {
  font-size: 1.33333333em;
  line-height: 0.75em;
  vertical-align: -15%;
}
.fa-2x {
  font-size: 2em;
}
.fa-3x {
  font-size: 3em;
}
.fa-4x {
  font-size: 4em;
}
.fa-5x {
  font-size: 5em;
}
.fa-fw {
  width: 1.28571429em;
  text-align: center;
}
.fa-ul {
  padding-left: 0;
  margin-left: 2.14285714em;
  list-style-type: none;
}
.fa-ul > li {
  position: relative;
}
.fa-li {
  position: absolute;
  left: -2.14285714em;
  width: 2.14285714em;
  top: 0.14285714em;
  text-align: center;
}
.fa-li.fa-lg {
  left: -1.85714286em;
}
.fa-border {
  padding: .2em .25em .15em;
  border: solid 0.08em #eee;
  border-radius: .1em;
}
.pull-right {
  float: right;
}
.pull-left {
  float: left;
}
.fa.pull-left {
  margin-right: .3em;
}
.fa.pull-right {
  margin-left: .3em;
}
.fa-spin {
  -webkit-animation: fa-spin 2s infinite linear;
  animation: fa-spin 2s infinite linear;
}
@-webkit-keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
    transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(359deg);
    transform: rotate(359deg);
  }
}
@keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
    transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(359deg);
    transform: rotate(359deg);
  }
}
.fa-rotate-90 {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=1);
  -webkit-transform: rotate(90deg);
  -ms-transform: rotate(90deg);
  transform: rotate(90deg);
}
.fa-rotate-180 {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=2);
  -webkit-transform: rotate(180deg);
  -ms-transform: rotate(180deg);
  transform: rotate(180deg);
}
.fa-rotate-270 {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=3);
  -webkit-transform: rotate(270deg);
  -ms-transform: rotate(270deg);
  transform: rotate(270deg);
}
.fa-flip-horizontal {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=0, mirror=1);
  -webkit-transform: scale(-1, 1);
  -ms-transform: scale(-1, 1);
  transform: scale(-1, 1);
}
.fa-flip-vertical {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1);
  -webkit-transform: scale(1, -1);
  -ms-transform: scale(1, -1);
  transform: scale(1, -1);
}
:root .fa-rotate-90,
:root .fa-rotate-180,
:root .fa-rotate-270,
:root .fa-flip-horizontal,
:root .fa-flip-vertical {
  filter: none;
}
.fa-stack {
  position: relative;
  display: inline-block;
  width: 2em;
  height: 2em;
  line-height: 2em;
  vertical-align: middle;
}
.fa-stack-1x,
.fa-stack-2x {
  position: absolute;
  left: 0;
  width: 100%;
  text-align: center;
}
.fa-stack-1x {
  line-height: inherit;
}
.fa-stack-2x {
  font-size: 2em;
}
.fa-inverse {
  color: #fff;
}
/* Font Awesome uses the Unicode Private Use Area (PUA) to ensure screen
   readers do not read off random characters that represent icons */
.fa-glass:before {
  content: "\f000";
}
.fa-music:before {
  content: "\f001";
}
.fa-search:before {
  content: "\f002";
}
.fa-envelope-o:before {
  content: "\f003";
}
.fa-heart:before {
  content: "\f004";
}
.fa-star:before {
  content: "\f005";
}
.fa-star-o:before {
  content: "\f006";
}
.fa-user:before {
  content: "\f007";
}
.fa-film:before {
  content: "\f008";
}
.fa-th-large:before {
  content: "\f009";
}
.fa-th:before {
  content: "\f00a";
}
.fa-th-list:before {
  content: "\f00b";
}
.fa-check:before {
  content: "\f00c";
}
.fa-remove:before,
.fa-close:before,
.fa-times:before {
  content: "\f00d";
}
.fa-search-plus:before {
  content: "\f00e";
}
.fa-search-minus:before {
  content: "\f010";
}
.fa-power-off:before {
  content: "\f011";
}
.fa-signal:before {
  content: "\f012";
}
.fa-gear:before,
.fa-cog:before {
  content: "\f013";
}
.fa-trash-o:before {
  content: "\f014";
}
.fa-home:before {
  content: "\f015";
}
.fa-file-o:before {
  content: "\f016";
}
.fa-clock-o:before {
  content: "\f017";
}
.fa-road:before {
  content: "\f018";
}
.fa-download:before {
  content: "\f019";
}
.fa-arrow-circle-o-down:before {
  content: "\f01a";
}
.fa-arrow-circle-o-up:before {
  content: "\f01b";
}
.fa-inbox:before {
  content: "\f01c";
}
.fa-play-circle-o:before {
  content: "\f01d";
}
.fa-rotate-right:before,
.fa-repeat:before {
  content: "\f01e";
}
.fa-refresh:before {
  content: "\f021";
}
.fa-list-alt:before {
  content: "\f022";
}
.fa-lock:before {
  content: "\f023";
}
.fa-flag:before {
  content: "\f024";
}
.fa-headphones:before {
  content: "\f025";
}
.fa-volume-off:before {
  content: "\f026";
}
.fa-volume-down:before {
  content: "\f027";
}
.fa-volume-up:before {
  content: "\f028";
}
.fa-qrcode:before {
  content: "\f029";
}
.fa-barcode:before {
  content: "\f02a";
}
.fa-tag:before {
  content: "\f02b";
}
.fa-tags:before {
  content: "\f02c";
}
.fa-book:before {
  content: "\f02d";
}
.fa-bookmark:before {
  content: "\f02e";
}
.fa-print:before {
  content: "\f02f";
}
.fa-camera:before {
  content: "\f030";
}
.fa-font:before {
  content: "\f031";
}
.fa-bold:before {
  content: "\f032";
}
.fa-italic:before {
  content: "\f033";
}
.fa-text-height:before {
  content: "\f034";
}
.fa-text-width:before {
  content: "\f035";
}
.fa-align-left:before {
  content: "\f036";
}
.fa-align-center:before {
  content: "\f037";
}
.fa-align-right:before {
  content: "\f038";
}
.fa-align-justify:before {
  content: "\f039";
}
.fa-list:before {
  content: "\f03a";
}
.fa-dedent:before,
.fa-outdent:before {
  content: "\f03b";
}
.fa-indent:before {
  content: "\f03c";
}
.fa-video-camera:before {
  content: "\f03d";
}
.fa-photo:before,
.fa-image:before,
.fa-picture-o:before {
  content: "\f03e";
}
.fa-pencil:before {
  content: "\f040";
}
.fa-map-marker:before {
  content: "\f041";
}
.fa-adjust:before {
  content: "\f042";
}
.fa-tint:before {
  content: "\f043";
}
.fa-edit:before,
.fa-pencil-square-o:before {
  content: "\f044";
}
.fa-share-square-o:before {
  content: "\f045";
}
.fa-check-square-o:before {
  content: "\f046";
}
.fa-arrows:before {
  content: "\f047";
}
.fa-step-backward:before {
  content: "\f048";
}
.fa-fast-backward:before {
  content: "\f049";
}
.fa-backward:before {
  content: "\f04a";
}
.fa-play:before {
  content: "\f04b";
}
.fa-pause:before {
  content: "\f04c";
}
.fa-stop:before {
  content: "\f04d";
}
.fa-forward:before {
  content: "\f04e";
}
.fa-fast-forward:before {
  content: "\f050";
}
.fa-step-forward:before {
  content: "\f051";
}
.fa-eject:before {
  content: "\f052";
}
.fa-chevron-left:before {
  content: "\f053";
}
.fa-chevron-right:before {
  content: "\f054";
}
.fa-plus-circle:before {
  content: "\f055";
}
.fa-minus-circle:before {
  content: "\f056";
}
.fa-times-circle:before {
  content: "\f057";
}
.fa-check-circle:before {
  content: "\f058";
}
.fa-question-circle:before {
  content: "\f059";
}
.fa-info-circle:before {
  content: "\f05a";
}
.fa-crosshairs:before {
  content: "\f05b";
}
.fa-times-circle-o:before {
  content: "\f05c";
}
.fa-check-circle-o:before {
  content: "\f05d";
}
.fa-ban:before {
  content: "\f05e";
}
.fa-arrow-left:before {
  content: "\f060";
}
.fa-arrow-right:before {
  content: "\f061";
}
.fa-arrow-up:before {
  content: "\f062";
}
.fa-arrow-down:before {
  content: "\f063";
}
.fa-mail-forward:before,
.fa-share:before {
  content: "\f064";
}
.fa-expand:before {
  content: "\f065";
}
.fa-compress:before {
  content: "\f066";
}
.fa-plus:before {
  content: "\f067";
}
.fa-minus:before {
  content: "\f068";
}
.fa-asterisk:before {
  content: "\f069";
}
.fa-exclamation-circle:before {
  content: "\f06a";
}
.fa-gift:before {
  content: "\f06b";
}
.fa-leaf:before {
  content: "\f06c";
}
.fa-fire:before {
  content: "\f06d";
}
.fa-eye:before {
  content: "\f06e";
}
.fa-eye-slash:before {
  content: "\f070";
}
.fa-warning:before,
.fa-exclamation-triangle:before {
  content: "\f071";
}
.fa-plane:before {
  content: "\f072";
}
.fa-calendar:before {
  content: "\f073";
}
.fa-random:before {
  content: "\f074";
}
.fa-comment:before {
  content: "\f075";
}
.fa-magnet:before {
  content: "\f076";
}
.fa-chevron-up:before {
  content: "\f077";
}
.fa-chevron-down:before {
  content: "\f078";
}
.fa-retweet:before {
  content: "\f079";
}
.fa-shopping-cart:before {
  content: "\f07a";
}
.fa-folder:before {
  content: "\f07b";
}
.fa-folder-open:before {
  content: "\f07c";
}
.fa-arrows-v:before {
  content: "\f07d";
}
.fa-arrows-h:before {
  content: "\f07e";
}
.fa-bar-chart-o:before,
.fa-bar-chart:before {
  content: "\f080";
}
.fa-twitter-square:before {
  content: "\f081";
}
.fa-facebook-square:before {
  content: "\f082";
}
.fa-camera-retro:before {
  content: "\f083";
}
.fa-key:before {
  content: "\f084";
}
.fa-gears:before,
.fa-cogs:before {
  content: "\f085";
}
.fa-comments:before {
  content: "\f086";
}
.fa-thumbs-o-up:before {
  content: "\f087";
}
.fa-thumbs-o-down:before {
  content: "\f088";
}
.fa-star-half:before {
  content: "\f089";
}
.fa-heart-o:before {
  content: "\f08a";
}
.fa-sign-out:before {
  content: "\f08b";
}
.fa-linkedin-square:before {
  content: "\f08c";
}
.fa-thumb-tack:before {
  content: "\f08d";
}
.fa-external-link:before {
  content: "\f08e";
}
.fa-sign-in:before {
  content: "\f090";
}
.fa-trophy:before {
  content: "\f091";
}
.fa-github-square:before {
  content: "\f092";
}
.fa-upload:before {
  content: "\f093";
}
.fa-lemon-o:before {
  content: "\f094";
}
.fa-phone:before {
  content: "\f095";
}
.fa-square-o:before {
  content: "\f096";
}
.fa-bookmark-o:before {
  content: "\f097";
}
.fa-phone-square:before {
  content: "\f098";
}
.fa-twitter:before {
  content: "\f099";
}
.fa-facebook:before {
  content: "\f09a";
}
.fa-github:before {
  content: "\f09b";
}
.fa-unlock:before {
  content: "\f09c";
}
.fa-credit-card:before {
  content: "\f09d";
}
.fa-rss:before {
  content: "\f09e";
}
.fa-hdd-o:before {
  content: "\f0a0";
}
.fa-bullhorn:before {
  content: "\f0a1";
}
.fa-bell:before {
  content: "\f0f3";
}
.fa-certificate:before {
  content: "\f0a3";
}
.fa-hand-o-right:before {
  content: "\f0a4";
}
.fa-hand-o-left:before {
  content: "\f0a5";
}
.fa-hand-o-up:before {
  content: "\f0a6";
}
.fa-hand-o-down:before {
  content: "\f0a7";
}
.fa-arrow-circle-left:before {
  content: "\f0a8";
}
.fa-arrow-circle-right:before {
  content: "\f0a9";
}
.fa-arrow-circle-up:before {
  content: "\f0aa";
}
.fa-arrow-circle-down:before {
  content: "\f0ab";
}
.fa-globe:before {
  content: "\f0ac";
}
.fa-wrench:before {
  content: "\f0ad";
}
.fa-tasks:before {
  content: "\f0ae";
}
.fa-filter:before {
  content: "\f0b0";
}
.fa-briefcase:before {
  content: "\f0b1";
}
.fa-arrows-alt:before {
  content: "\f0b2";
}
.fa-group:before,
.fa-users:before {
  content: "\f0c0";
}
.fa-chain:before,
.fa-link:before {
  content: "\f0c1";
}
.fa-cloud:before {
  content: "\f0c2";
}
.fa-flask:before {
  content: "\f0c3";
}
.fa-cut:before,
.fa-scissors:before {
  content: "\f0c4";
}
.fa-copy:before,
.fa-files-o:before {
  content: "\f0c5";
}
.fa-paperclip:before {
  content: "\f0c6";
}
.fa-save:before,
.fa-floppy-o:before {
  content: "\f0c7";
}
.fa-square:before {
  content: "\f0c8";
}
.fa-navicon:before,
.fa-reorder:before,
.fa-bars:before {
  content: "\f0c9";
}
.fa-list-ul:before {
  content: "\f0ca";
}
.fa-list-ol:before {
  content: "\f0cb";
}
.fa-strikethrough:before {
  content: "\f0cc";
}
.fa-underline:before {
  content: "\f0cd";
}
.fa-table:before {
  content: "\f0ce";
}
.fa-magic:before {
  content: "\f0d0";
}
.fa-truck:before {
  content: "\f0d1";
}
.fa-pinterest:before {
  content: "\f0d2";
}
.fa-pinterest-square:before {
  content: "\f0d3";
}
.fa-google-plus-square:before {
  content: "\f0d4";
}
.fa-google-plus:before {
  content: "\f0d5";
}
.fa-money:before {
  content: "\f0d6";
}
.fa-caret-down:before {
  content: "\f0d7";
}
.fa-caret-up:before {
  content: "\f0d8";
}
.fa-caret-left:before {
  content: "\f0d9";
}
.fa-caret-right:before {
  content: "\f0da";
}
.fa-columns:before {
  content: "\f0db";
}
.fa-unsorted:before,
.fa-sort:before {
  content: "\f0dc";
}
.fa-sort-down:before,
.fa-sort-desc:before {
  content: "\f0dd";
}
.fa-sort-up:before,
.fa-sort-asc:before {
  content: "\f0de";
}
.fa-envelope:before {
  content: "\f0e0";
}
.fa-linkedin:before {
  content: "\f0e1";
}
.fa-rotate-left:before,
.fa-undo:before {
  content: "\f0e2";
}
.fa-legal:before,
.fa-gavel:before {
  content: "\f0e3";
}
.fa-dashboard:before,
.fa-tachometer:before {
  content: "\f0e4";
}
.fa-comment-o:before {
  content: "\f0e5";
}
.fa-comments-o:before {
  content: "\f0e6";
}
.fa-flash:before,
.fa-bolt:before {
  content: "\f0e7";
}
.fa-sitemap:before {
  content: "\f0e8";
}
.fa-umbrella:before {
  content: "\f0e9";
}
.fa-paste:before,
.fa-clipboard:before {
  content: "\f0ea";
}
.fa-lightbulb-o:before {
  content: "\f0eb";
}
.fa-exchange:before {
  content: "\f0ec";
}
.fa-cloud-download:before {
  content: "\f0ed";
}
.fa-cloud-upload:before {
  content: "\f0ee";
}
.fa-user-md:before {
  content: "\f0f0";
}
.fa-stethoscope:before {
  content: "\f0f1";
}
.fa-suitcase:before {
  content: "\f0f2";
}
.fa-bell-o:before {
  content: "\f0a2";
}
.fa-coffee:before {
  content: "\f0f4";
}
.fa-cutlery:before {
  content: "\f0f5";
}
.fa-file-text-o:before {
  content: "\f0f6";
}
.fa-building-o:before {
  content: "\f0f7";
}
.fa-hospital-o:before {
  content: "\f0f8";
}
.fa-ambulance:before {
  content: "\f0f9";
}
.fa-medkit:before {
  content: "\f0fa";
}
.fa-fighter-jet:before {
  content: "\f0fb";
}
.fa-beer:before {
  content: "\f0fc";
}
.fa-h-square:before {
  content: "\f0fd";
}
.fa-plus-square:before {
  content: "\f0fe";
}
.fa-angle-double-left:before {
  content: "\f100";
}
.fa-angle-double-right:before {
  content: "\f101";
}
.fa-angle-double-up:before {
  content: "\f102";
}
.fa-angle-double-down:before {
  content: "\f103";
}
.fa-angle-left:before {
  content: "\f104";
}
.fa-angle-right:before {
  content: "\f105";
}
.fa-angle-up:before {
  content: "\f106";
}
.fa-angle-down:before {
  content: "\f107";
}
.fa-desktop:before {
  content: "\f108";
}
.fa-laptop:before {
  content: "\f109";
}
.fa-tablet:before {
  content: "\f10a";
}
.fa-mobile-phone:before,
.fa-mobile:before {
  content: "\f10b";
}
.fa-circle-o:before {
  content: "\f10c";
}
.fa-quote-left:before {
  content: "\f10d";
}
.fa-quote-right:before {
  content: "\f10e";
}
.fa-spinner:before {
  content: "\f110";
}
.fa-circle:before {
  content: "\f111";
}
.fa-mail-reply:before,
.fa-reply:before {
  content: "\f112";
}
.fa-github-alt:before {
  content: "\f113";
}
.fa-folder-o:before {
  content: "\f114";
}
.fa-folder-open-o:before {
  content: "\f115";
}
.fa-smile-o:before {
  content: "\f118";
}
.fa-frown-o:before {
  content: "\f119";
}
.fa-meh-o:before {
  content: "\f11a";
}
.fa-gamepad:before {
  content: "\f11b";
}
.fa-keyboard-o:before {
  content: "\f11c";
}
.fa-flag-o:before {
  content: "\f11d";
}
.fa-flag-checkered:before {
  content: "\f11e";
}
.fa-terminal:before {
  content: "\f120";
}
.fa-code:before {
  content: "\f121";
}
.fa-mail-reply-all:before,
.fa-reply-all:before {
  content: "\f122";
}
.fa-star-half-empty:before,
.fa-star-half-full:before,
.fa-star-half-o:before {
  content: "\f123";
}
.fa-location-arrow:before {
  content: "\f124";
}
.fa-crop:before {
  content: "\f125";
}
.fa-code-fork:before {
  content: "\f126";
}
.fa-unlink:before,
.fa-chain-broken:before {
  content: "\f127";
}
.fa-question:before {
  content: "\f128";
}
.fa-info:before {
  content: "\f129";
}
.fa-exclamation:before {
  content: "\f12a";
}
.fa-superscript:before {
  content: "\f12b";
}
.fa-subscript:before {
  content: "\f12c";
}
.fa-eraser:before {
  content: "\f12d";
}
.fa-puzzle-piece:before {
  content: "\f12e";
}
.fa-microphone:before {
  content: "\f130";
}
.fa-microphone-slash:before {
  content: "\f131";
}
.fa-shield:before {
  content: "\f132";
}
.fa-calendar-o:before {
  content: "\f133";
}
.fa-fire-extinguisher:before {
  content: "\f134";
}
.fa-rocket:before {
  content: "\f135";
}
.fa-maxcdn:before {
  content: "\f136";
}
.fa-chevron-circle-left:before {
  content: "\f137";
}
.fa-chevron-circle-right:before {
  content: "\f138";
}
.fa-chevron-circle-up:before {
  content: "\f139";
}
.fa-chevron-circle-down:before {
  content: "\f13a";
}
.fa-html5:before {
  content: "\f13b";
}
.fa-css3:before {
  content: "\f13c";
}
.fa-anchor:before {
  content: "\f13d";
}
.fa-unlock-alt:before {
  content: "\f13e";
}
.fa-bullseye:before {
  content: "\f140";
}
.fa-ellipsis-h:before {
  content: "\f141";
}
.fa-ellipsis-v:before {
  content: "\f142";
}
.fa-rss-square:before {
  content: "\f143";
}
.fa-play-circle:before {
  content: "\f144";
}
.fa-ticket:before {
  content: "\f145";
}
.fa-minus-square:before {
  content: "\f146";
}
.fa-minus-square-o:before {
  content: "\f147";
}
.fa-level-up:before {
  content: "\f148";
}
.fa-level-down:before {
  content: "\f149";
}
.fa-check-square:before {
  content: "\f14a";
}
.fa-pencil-square:before {
  content: "\f14b";
}
.fa-external-link-square:before {
  content: "\f14c";
}
.fa-share-square:before {
  content: "\f14d";
}
.fa-compass:before {
  content: "\f14e";
}
.fa-toggle-down:before,
.fa-caret-square-o-down:before {
  content: "\f150";
}
.fa-toggle-up:before,
.fa-caret-square-o-up:before {
  content: "\f151";
}
.fa-toggle-right:before,
.fa-caret-square-o-right:before {
  content: "\f152";
}
.fa-euro:before,
.fa-eur:before {
  content: "\f153";
}
.fa-gbp:before {
  content: "\f154";
}
.fa-dollar:before,
.fa-usd:before {
  content: "\f155";
}
.fa-rupee:before,
.fa-inr:before {
  content: "\f156";
}
.fa-cny:before,
.fa-rmb:before,
.fa-yen:before,
.fa-jpy:before {
  content: "\f157";
}
.fa-ruble:before,
.fa-rouble:before,
.fa-rub:before {
  content: "\f158";
}
.fa-won:before,
.fa-krw:before {
  content: "\f159";
}
.fa-bitcoin:before,
.fa-btc:before {
  content: "\f15a";
}
.fa-file:before {
  content: "\f15b";
}
.fa-file-text:before {
  content: "\f15c";
}
.fa-sort-alpha-asc:before {
  content: "\f15d";
}
.fa-sort-alpha-desc:before {
  content: "\f15e";
}
.fa-sort-amount-asc:before {
  content: "\f160";
}
.fa-sort-amount-desc:before {
  content: "\f161";
}
.fa-sort-numeric-asc:before {
  content: "\f162";
}
.fa-sort-numeric-desc:before {
  content: "\f163";
}
.fa-thumbs-up:before {
  content: "\f164";
}
.fa-thumbs-down:before {
  content: "\f165";
}
.fa-youtube-square:before {
  content: "\f166";
}
.fa-youtube:before {
  content: "\f167";
}
.fa-xing:before {
  content: "\f168";
}
.fa-xing-square:before {
  content: "\f169";
}
.fa-youtube-play:before {
  content: "\f16a";
}
.fa-dropbox:before {
  content: "\f16b";
}
.fa-stack-overflow:before {
  content: "\f16c";
}
.fa-instagram:before {
  content: "\f16d";
}
.fa-flickr:before {
  content: "\f16e";
}
.fa-adn:before {
  content: "\f170";
}
.fa-bitbucket:before {
  content: "\f171";
}
.fa-bitbucket-square:before {
  content: "\f172";
}
.fa-tumblr:before {
  content: "\f173";
}
.fa-tumblr-square:before {
  content: "\f174";
}
.fa-long-arrow-down:before {
  content: "\f175";
}
.fa-long-arrow-up:before {
  content: "\f176";
}
.fa-long-arrow-left:before {
  content: "\f177";
}
.fa-long-arrow-right:before {
  content: "\f178";
}
.fa-apple:before {
  content: "\f179";
}
.fa-windows:before {
  content: "\f17a";
}
.fa-android:before {
  content: "\f17b";
}
.fa-linux:before {
  content: "\f17c";
}
.fa-dribbble:before {
  content: "\f17d";
}
.fa-skype:before {
  content: "\f17e";
}
.fa-foursquare:before {
  content: "\f180";
}
.fa-trello:before {
  content: "\f181";
}
.fa-female:before {
  content: "\f182";
}
.fa-male:before {
  content: "\f183";
}
.fa-gittip:before {
  content: "\f184";
}
.fa-sun-o:before {
  content: "\f185";
}
.fa-moon-o:before {
  content: "\f186";
}
.fa-archive:before {
  content: "\f187";
}
.fa-bug:before {
  content: "\f188";
}
.fa-vk:before {
  content: "\f189";
}
.fa-weibo:before {
  content: "\f18a";
}
.fa-renren:before {
  content: "\f18b";
}
.fa-pagelines:before {
  content: "\f18c";
}
.fa-stack-exchange:before {
  content: "\f18d";
}
.fa-arrow-circle-o-right:before {
  content: "\f18e";
}
.fa-arrow-circle-o-left:before {
  content: "\f190";
}
.fa-toggle-left:before,
.fa-caret-square-o-left:before {
  content: "\f191";
}
.fa-dot-circle-o:before {
  content: "\f192";
}
.fa-wheelchair:before {
  content: "\f193";
}
.fa-vimeo-square:before {
  content: "\f194";
}
.fa-turkish-lira:before,
.fa-try:before {
  content: "\f195";
}
.fa-plus-square-o:before {
  content: "\f196";
}
.fa-space-shuttle:before {
  content: "\f197";
}
.fa-slack:before {
  content: "\f198";
}
.fa-envelope-square:before {
  content: "\f199";
}
.fa-wordpress:before {
  content: "\f19a";
}
.fa-openid:before {
  content: "\f19b";
}
.fa-institution:before,
.fa-bank:before,
.fa-university:before {
  content: "\f19c";
}
.fa-mortar-board:before,
.fa-graduation-cap:before {
  content: "\f19d";
}
.fa-yahoo:before {
  content: "\f19e";
}
.fa-google:before {
  content: "\f1a0";
}
.fa-reddit:before {
  content: "\f1a1";
}
.fa-reddit-square:before {
  content: "\f1a2";
}
.fa-stumbleupon-circle:before {
  content: "\f1a3";
}
.fa-stumbleupon:before {
  content: "\f1a4";
}
.fa-delicious:before {
  content: "\f1a5";
}
.fa-digg:before {
  content: "\f1a6";
}
.fa-pied-piper:before {
  content: "\f1a7";
}
.fa-pied-piper-alt:before {
  content: "\f1a8";
}
.fa-drupal:before {
  content: "\f1a9";
}
.fa-joomla:before {
  content: "\f1aa";
}
.fa-language:before {
  content: "\f1ab";
}
.fa-fax:before {
  content: "\f1ac";
}
.fa-building:before {
  content: "\f1ad";
}
.fa-child:before {
  content: "\f1ae";
}
.fa-paw:before {
  content: "\f1b0";
}
.fa-spoon:before {
  content: "\f1b1";
}
.fa-cube:before {
  content: "\f1b2";
}
.fa-cubes:before {
  content: "\f1b3";
}
.fa-behance:before {
  content: "\f1b4";
}
.fa-behance-square:before {
  content: "\f1b5";
}
.fa-steam:before {
  content: "\f1b6";
}
.fa-steam-square:before {
  content: "\f1b7";
}
.fa-recycle:before {
  content: "\f1b8";
}
.fa-automobile:before,
.fa-car:before {
  content: "\f1b9";
}
.fa-cab:before,
.fa-taxi:before {
  content: "\f1ba";
}
.fa-tree:before {
  content: "\f1bb";
}
.fa-spotify:before {
  content: "\f1bc";
}
.fa-deviantart:before {
  content: "\f1bd";
}
.fa-soundcloud:before {
  content: "\f1be";
}
.fa-database:before {
  content: "\f1c0";
}
.fa-file-pdf-o:before {
  content: "\f1c1";
}
.fa-file-word-o:before {
  content: "\f1c2";
}
.fa-file-excel-o:before {
  content: "\f1c3";
}
.fa-file-powerpoint-o:before {
  content: "\f1c4";
}
.fa-file-photo-o:before,
.fa-file-picture-o:before,
.fa-file-image-o:before {
  content: "\f1c5";
}
.fa-file-zip-o:before,
.fa-file-archive-o:before {
  content: "\f1c6";
}
.fa-file-sound-o:before,
.fa-file-audio-o:before {
  content: "\f1c7";
}
.fa-file-movie-o:before,
.fa-file-video-o:before {
  content: "\f1c8";
}
.fa-file-code-o:before {
  content: "\f1c9";
}
.fa-vine:before {
  content: "\f1ca";
}
.fa-codepen:before {
  content: "\f1cb";
}
.fa-jsfiddle:before {
  content: "\f1cc";
}
.fa-life-bouy:before,
.fa-life-buoy:before,
.fa-life-saver:before,
.fa-support:before,
.fa-life-ring:before {
  content: "\f1cd";
}
.fa-circle-o-notch:before {
  content: "\f1ce";
}
.fa-ra:before,
.fa-rebel:before {
  content: "\f1d0";
}
.fa-ge:before,
.fa-empire:before {
  content: "\f1d1";
}
.fa-git-square:before {
  content: "\f1d2";
}
.fa-git:before {
  content: "\f1d3";
}
.fa-hacker-news:before {
  content: "\f1d4";
}
.fa-tencent-weibo:before {
  content: "\f1d5";
}
.fa-qq:before {
  content: "\f1d6";
}
.fa-wechat:before,
.fa-weixin:before {
  content: "\f1d7";
}
.fa-send:before,
.fa-paper-plane:before {
  content: "\f1d8";
}
.fa-send-o:before,
.fa-paper-plane-o:before {
  content: "\f1d9";
}
.fa-history:before {
  content: "\f1da";
}
.fa-circle-thin:before {
  content: "\f1db";
}
.fa-header:before {
  content: "\f1dc";
}
.fa-paragraph:before {
  content: "\f1dd";
}
.fa-sliders:before {
  content: "\f1de";
}
.fa-share-alt:before {
  content: "\f1e0";
}
.fa-share-alt-square:before {
  content: "\f1e1";
}
.fa-bomb:before {
  content: "\f1e2";
}
.fa-soccer-ball-o:before,
.fa-futbol-o:before {
  content: "\f1e3";
}
.fa-tty:before {
  content: "\f1e4";
}
.fa-binoculars:before {
  content: "\f1e5";
}
.fa-plug:before {
  content: "\f1e6";
}
.fa-slideshare:before {
  content: "\f1e7";
}
.fa-twitch:before {
  content: "\f1e8";
}
.fa-yelp:before {
  content: "\f1e9";
}
.fa-newspaper-o:before {
  content: "\f1ea";
}
.fa-wifi:before {
  content: "\f1eb";
}
.fa-calculator:before {
  content: "\f1ec";
}
.fa-paypal:before {
  content: "\f1ed";
}
.fa-google-wallet:before {
  content: "\f1ee";
}
.fa-cc-visa:before {
  content: "\f1f0";
}
.fa-cc-mastercard:before {
  content: "\f1f1";
}
.fa-cc-discover:before {
  content: "\f1f2";
}
.fa-cc-amex:before {
  content: "\f1f3";
}
.fa-cc-paypal:before {
  content: "\f1f4";
}
.fa-cc-stripe:before {
  content: "\f1f5";
}
.fa-bell-slash:before {
  content: "\f1f6";
}
.fa-bell-slash-o:before {
  content: "\f1f7";
}
.fa-trash:before {
  content: "\f1f8";
}
.fa-copyright:before {
  content: "\f1f9";
}
.fa-at:before {
  content: "\f1fa";
}
.fa-eyedropper:before {
  content: "\f1fb";
}
.fa-paint-brush:before {
  content: "\f1fc";
}
.fa-birthday-cake:before {
  content: "\f1fd";
}
.fa-area-chart:before {
  content: "\f1fe";
}
.fa-pie-chart:before {
  content: "\f200";
}
.fa-line-chart:before {
  content: "\f201";
}
.fa-lastfm:before {
  content: "\f202";
}
.fa-lastfm-square:before {
  content: "\f203";
}
.fa-toggle-off:before {
  content: "\f204";
}
.fa-toggle-on:before {
  content: "\f205";
}
.fa-bicycle:before {
  content: "\f206";
}
.fa-bus:before {
  content: "\f207";
}
.fa-ioxhost:before {
  content: "\f208";
}
.fa-angellist:before {
  content: "\f209";
}
.fa-cc:before {
  content: "\f20a";
}
.fa-shekel:before,
.fa-sheqel:before,
.fa-ils:before {
  content: "\f20b";
}
.fa-meanpath:before {
  content: "\f20c";
}
/*!
*
* IPython base
*
*/
.modal.fade .modal-dialog {
  -webkit-transform: translate(0, 0);
  -ms-transform: translate(0, 0);
  -o-transform: translate(0, 0);
  transform: translate(0, 0);
}
code {
  color: #000;
}
pre {
  font-size: inherit;
  line-height: inherit;
}
label {
  font-weight: normal;
}
/* Make the page background atleast 100% the height of the view port */
/* Make the page itself atleast 70% the height of the view port */
.border-box-sizing {
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
}
.corner-all {
  border-radius: 2px;
}
.no-padding {
  padding: 0px;
}
/* Flexible box model classes */
/* Taken from Alex Russell http://infrequently.org/2009/08/css-3-progress/ */
/* This file is a compatability layer.  It allows the usage of flexible box 
model layouts accross multiple browsers, including older browsers.  The newest,
universal implementation of the flexible box model is used when available (see
`Modern browsers` comments below).  Browsers that are known to implement this 
new spec completely include:

    Firefox 28.0+
    Chrome 29.0+
    Internet Explorer 11+ 
    Opera 17.0+

Browsers not listed, including Safari, are supported via the styling under the
`Old browsers` comments below.
*/
.hbox {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
}
.hbox > * {
  /* Old browsers */
  -webkit-box-flex: 0;
  -moz-box-flex: 0;
  box-flex: 0;
  /* Modern browsers */
  flex: none;
}
.vbox {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
}
.vbox > * {
  /* Old browsers */
  -webkit-box-flex: 0;
  -moz-box-flex: 0;
  box-flex: 0;
  /* Modern browsers */
  flex: none;
}
.hbox.reverse,
.vbox.reverse,
.reverse {
  /* Old browsers */
  -webkit-box-direction: reverse;
  -moz-box-direction: reverse;
  box-direction: reverse;
  /* Modern browsers */
  flex-direction: row-reverse;
}
.hbox.box-flex0,
.vbox.box-flex0,
.box-flex0 {
  /* Old browsers */
  -webkit-box-flex: 0;
  -moz-box-flex: 0;
  box-flex: 0;
  /* Modern browsers */
  flex: none;
  width: auto;
}
.hbox.box-flex1,
.vbox.box-flex1,
.box-flex1 {
  /* Old browsers */
  -webkit-box-flex: 1;
  -moz-box-flex: 1;
  box-flex: 1;
  /* Modern browsers */
  flex: 1;
}
.hbox.box-flex,
.vbox.box-flex,
.box-flex {
  /* Old browsers */
  /* Old browsers */
  -webkit-box-flex: 1;
  -moz-box-flex: 1;
  box-flex: 1;
  /* Modern browsers */
  flex: 1;
}
.hbox.box-flex2,
.vbox.box-flex2,
.box-flex2 {
  /* Old browsers */
  -webkit-box-flex: 2;
  -moz-box-flex: 2;
  box-flex: 2;
  /* Modern browsers */
  flex: 2;
}
.box-group1 {
  /*  Deprecated */
  -webkit-box-flex-group: 1;
  -moz-box-flex-group: 1;
  box-flex-group: 1;
}
.box-group2 {
  /* Deprecated */
  -webkit-box-flex-group: 2;
  -moz-box-flex-group: 2;
  box-flex-group: 2;
}
.hbox.start,
.vbox.start,
.start {
  /* Old browsers */
  -webkit-box-pack: start;
  -moz-box-pack: start;
  box-pack: start;
  /* Modern browsers */
  justify-content: flex-start;
}
.hbox.end,
.vbox.end,
.end {
  /* Old browsers */
  -webkit-box-pack: end;
  -moz-box-pack: end;
  box-pack: end;
  /* Modern browsers */
  justify-content: flex-end;
}
.hbox.center,
.vbox.center,
.center {
  /* Old browsers */
  -webkit-box-pack: center;
  -moz-box-pack: center;
  box-pack: center;
  /* Modern browsers */
  justify-content: center;
}
.hbox.baseline,
.vbox.baseline,
.baseline {
  /* Old browsers */
  -webkit-box-pack: baseline;
  -moz-box-pack: baseline;
  box-pack: baseline;
  /* Modern browsers */
  justify-content: baseline;
}
.hbox.stretch,
.vbox.stretch,
.stretch {
  /* Old browsers */
  -webkit-box-pack: stretch;
  -moz-box-pack: stretch;
  box-pack: stretch;
  /* Modern browsers */
  justify-content: stretch;
}
.hbox.align-start,
.vbox.align-start,
.align-start {
  /* Old browsers */
  -webkit-box-align: start;
  -moz-box-align: start;
  box-align: start;
  /* Modern browsers */
  align-items: flex-start;
}
.hbox.align-end,
.vbox.align-end,
.align-end {
  /* Old browsers */
  -webkit-box-align: end;
  -moz-box-align: end;
  box-align: end;
  /* Modern browsers */
  align-items: flex-end;
}
.hbox.align-center,
.vbox.align-center,
.align-center {
  /* Old browsers */
  -webkit-box-align: center;
  -moz-box-align: center;
  box-align: center;
  /* Modern browsers */
  align-items: center;
}
.hbox.align-baseline,
.vbox.align-baseline,
.align-baseline {
  /* Old browsers */
  -webkit-box-align: baseline;
  -moz-box-align: baseline;
  box-align: baseline;
  /* Modern browsers */
  align-items: baseline;
}
.hbox.align-stretch,
.vbox.align-stretch,
.align-stretch {
  /* Old browsers */
  -webkit-box-align: stretch;
  -moz-box-align: stretch;
  box-align: stretch;
  /* Modern browsers */
  align-items: stretch;
}
div.error {
  margin: 2em;
  text-align: center;
}
div.error > h1 {
  font-size: 500%;
  line-height: normal;
}
div.error > p {
  font-size: 200%;
  line-height: normal;
}
div.traceback-wrapper {
  text-align: left;
  max-width: 800px;
  margin: auto;
}
/**
 * Primary styles
 *
 * Author: Jupyter Development Team
 */
body {
  background-color: #fff;
  /* This makes sure that the body covers the entire window and needs to
       be in a different element than the display: box in wrapper below */
  position: absolute;
  left: 0px;
  right: 0px;
  top: 0px;
  bottom: 0px;
  overflow: visible;
}
body > #header {
  /* Initially hidden to prevent FLOUC */
  display: none;
  background-color: #fff;
  /* Display over codemirror */
  position: relative;
  z-index: 100;
}
body > #header #header-container {
  padding-bottom: 5px;
  padding-top: 5px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
}
body > #header .header-bar {
  width: 100%;
  height: 1px;
  background: #e7e7e7;
  margin-bottom: -1px;
}
@media print {
  body > #header {
    display: none !important;
  }
}
#header-spacer {
  width: 100%;
  visibility: hidden;
}
@media print {
  #header-spacer {
    display: none;
  }
}
#ipython_notebook {
  padding-left: 0px;
  padding-top: 1px;
  padding-bottom: 1px;
}
@media (max-width: 991px) {
  #ipython_notebook {
    margin-left: 10px;
  }
}
#noscript {
  width: auto;
  padding-top: 16px;
  padding-bottom: 16px;
  text-align: center;
  font-size: 22px;
  color: red;
  font-weight: bold;
}
#ipython_notebook img {
  height: 28px;
}
#site {
  width: 100%;
  display: none;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  overflow: auto;
}
@media print {
  #site {
    height: auto !important;
  }
}
/* Smaller buttons */
.ui-button .ui-button-text {
  padding: 0.2em 0.8em;
  font-size: 77%;
}
input.ui-button {
  padding: 0.3em 0.9em;
}
span#login_widget {
  float: right;
}
span#login_widget > .button,
#logout {
  color: #333;
  background-color: #fff;
  border-color: #ccc;
}
span#login_widget > .button:focus,
#logout:focus,
span#login_widget > .button.focus,
#logout.focus {
  color: #333;
  background-color: #e6e6e6;
  border-color: #8c8c8c;
}
span#login_widget > .button:hover,
#logout:hover {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
span#login_widget > .button:active,
#logout:active,
span#login_widget > .button.active,
#logout.active,
.open > .dropdown-togglespan#login_widget > .button,
.open > .dropdown-toggle#logout {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
span#login_widget > .button:active:hover,
#logout:active:hover,
span#login_widget > .button.active:hover,
#logout.active:hover,
.open > .dropdown-togglespan#login_widget > .button:hover,
.open > .dropdown-toggle#logout:hover,
span#login_widget > .button:active:focus,
#logout:active:focus,
span#login_widget > .button.active:focus,
#logout.active:focus,
.open > .dropdown-togglespan#login_widget > .button:focus,
.open > .dropdown-toggle#logout:focus,
span#login_widget > .button:active.focus,
#logout:active.focus,
span#login_widget > .button.active.focus,
#logout.active.focus,
.open > .dropdown-togglespan#login_widget > .button.focus,
.open > .dropdown-toggle#logout.focus {
  color: #333;
  background-color: #d4d4d4;
  border-color: #8c8c8c;
}
span#login_widget > .button:active,
#logout:active,
span#login_widget > .button.active,
#logout.active,
.open > .dropdown-togglespan#login_widget > .button,
.open > .dropdown-toggle#logout {
  background-image: none;
}
span#login_widget > .button.disabled:hover,
#logout.disabled:hover,
span#login_widget > .button[disabled]:hover,
#logout[disabled]:hover,
fieldset[disabled] span#login_widget > .button:hover,
fieldset[disabled] #logout:hover,
span#login_widget > .button.disabled:focus,
#logout.disabled:focus,
span#login_widget > .button[disabled]:focus,
#logout[disabled]:focus,
fieldset[disabled] span#login_widget > .button:focus,
fieldset[disabled] #logout:focus,
span#login_widget > .button.disabled.focus,
#logout.disabled.focus,
span#login_widget > .button[disabled].focus,
#logout[disabled].focus,
fieldset[disabled] span#login_widget > .button.focus,
fieldset[disabled] #logout.focus {
  background-color: #fff;
  border-color: #ccc;
}
span#login_widget > .button .badge,
#logout .badge {
  color: #fff;
  background-color: #333;
}
.nav-header {
  text-transform: none;
}
#header > span {
  margin-top: 10px;
}
.modal_stretch .modal-dialog {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
  min-height: 80vh;
}
.modal_stretch .modal-dialog .modal-body {
  max-height: calc(100vh - 200px);
  overflow: auto;
  flex: 1;
}
@media (min-width: 768px) {
  .modal .modal-dialog {
    width: 700px;
  }
}
@media (min-width: 768px) {
  select.form-control {
    margin-left: 12px;
    margin-right: 12px;
  }
}
/*!
*
* IPython auth
*
*/
.center-nav {
  display: inline-block;
  margin-bottom: -4px;
}
/*!
*
* IPython tree view
*
*/
/* We need an invisible input field on top of the sentense*/
/* "Drag file onto the list ..." */
.alternate_upload {
  background-color: none;
  display: inline;
}
.alternate_upload.form {
  padding: 0;
  margin: 0;
}
.alternate_upload input.fileinput {
  text-align: center;
  vertical-align: middle;
  display: inline;
  opacity: 0;
  z-index: 2;
  width: 12ex;
  margin-right: -12ex;
}
.alternate_upload .btn-upload {
  height: 22px;
}
/**
 * Primary styles
 *
 * Author: Jupyter Development Team
 */
ul#tabs {
  margin-bottom: 4px;
}
ul#tabs a {
  padding-top: 6px;
  padding-bottom: 4px;
}
ul.breadcrumb a:focus,
ul.breadcrumb a:hover {
  text-decoration: none;
}
ul.breadcrumb i.icon-home {
  font-size: 16px;
  margin-right: 4px;
}
ul.breadcrumb span {
  color: #5e5e5e;
}
.list_toolbar {
  padding: 4px 0 4px 0;
  vertical-align: middle;
}
.list_toolbar .tree-buttons {
  padding-top: 1px;
}
.dynamic-buttons {
  padding-top: 3px;
  display: inline-block;
}
.list_toolbar [class*="span"] {
  min-height: 24px;
}
.list_header {
  font-weight: bold;
  background-color: #EEE;
}
.list_placeholder {
  font-weight: bold;
  padding-top: 4px;
  padding-bottom: 4px;
  padding-left: 7px;
  padding-right: 7px;
}
.list_container {
  margin-top: 4px;
  margin-bottom: 20px;
  border: 1px solid #ddd;
  border-radius: 2px;
}
.list_container > div {
  border-bottom: 1px solid #ddd;
}
.list_container > div:hover .list-item {
  background-color: red;
}
.list_container > div:last-child {
  border: none;
}
.list_item:hover .list_item {
  background-color: #ddd;
}
.list_item a {
  text-decoration: none;
}
.list_item:hover {
  background-color: #fafafa;
}
.list_header > div,
.list_item > div {
  padding-top: 4px;
  padding-bottom: 4px;
  padding-left: 7px;
  padding-right: 7px;
  line-height: 22px;
}
.list_header > div input,
.list_item > div input {
  margin-right: 7px;
  margin-left: 14px;
  vertical-align: baseline;
  line-height: 22px;
  position: relative;
  top: -1px;
}
.list_header > div .item_link,
.list_item > div .item_link {
  margin-left: -1px;
  vertical-align: baseline;
  line-height: 22px;
}
.new-file input[type=checkbox] {
  visibility: hidden;
}
.item_name {
  line-height: 22px;
  height: 24px;
}
.item_icon {
  font-size: 14px;
  color: #5e5e5e;
  margin-right: 7px;
  margin-left: 7px;
  line-height: 22px;
  vertical-align: baseline;
}
.item_buttons {
  line-height: 1em;
  margin-left: -5px;
}
.item_buttons .btn,
.item_buttons .btn-group,
.item_buttons .input-group {
  float: left;
}
.item_buttons > .btn,
.item_buttons > .btn-group,
.item_buttons > .input-group {
  margin-left: 5px;
}
.item_buttons .btn {
  min-width: 13ex;
}
.item_buttons .running-indicator {
  padding-top: 4px;
  color: #5cb85c;
}
.item_buttons .kernel-name {
  padding-top: 4px;
  color: #5bc0de;
  margin-right: 7px;
  float: left;
}
.toolbar_info {
  height: 24px;
  line-height: 24px;
}
.list_item input:not([type=checkbox]) {
  padding-top: 3px;
  padding-bottom: 3px;
  height: 22px;
  line-height: 14px;
  margin: 0px;
}
.highlight_text {
  color: blue;
}
#project_name {
  display: inline-block;
  padding-left: 7px;
  margin-left: -2px;
}
#project_name > .breadcrumb {
  padding: 0px;
  margin-bottom: 0px;
  background-color: transparent;
  font-weight: bold;
}
#tree-selector {
  padding-right: 0px;
}
#button-select-all {
  min-width: 50px;
}
#select-all {
  margin-left: 7px;
  margin-right: 2px;
}
.menu_icon {
  margin-right: 2px;
}
.tab-content .row {
  margin-left: 0px;
  margin-right: 0px;
}
.folder_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f114";
}
.folder_icon:before.pull-left {
  margin-right: .3em;
}
.folder_icon:before.pull-right {
  margin-left: .3em;
}
.notebook_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f02d";
  position: relative;
  top: -1px;
}
.notebook_icon:before.pull-left {
  margin-right: .3em;
}
.notebook_icon:before.pull-right {
  margin-left: .3em;
}
.running_notebook_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f02d";
  position: relative;
  top: -1px;
  color: #5cb85c;
}
.running_notebook_icon:before.pull-left {
  margin-right: .3em;
}
.running_notebook_icon:before.pull-right {
  margin-left: .3em;
}
.file_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f016";
  position: relative;
  top: -2px;
}
.file_icon:before.pull-left {
  margin-right: .3em;
}
.file_icon:before.pull-right {
  margin-left: .3em;
}
#notebook_toolbar .pull-right {
  padding-top: 0px;
  margin-right: -1px;
}
ul#new-menu {
  left: auto;
  right: 0;
}
.kernel-menu-icon {
  padding-right: 12px;
  width: 24px;
  content: "\f096";
}
.kernel-menu-icon:before {
  content: "\f096";
}
.kernel-menu-icon-current:before {
  content: "\f00c";
}
#tab_content {
  padding-top: 20px;
}
#running .panel-group .panel {
  margin-top: 3px;
  margin-bottom: 1em;
}
#running .panel-group .panel .panel-heading {
  background-color: #EEE;
  padding-top: 4px;
  padding-bottom: 4px;
  padding-left: 7px;
  padding-right: 7px;
  line-height: 22px;
}
#running .panel-group .panel .panel-heading a:focus,
#running .panel-group .panel .panel-heading a:hover {
  text-decoration: none;
}
#running .panel-group .panel .panel-body {
  padding: 0px;
}
#running .panel-group .panel .panel-body .list_container {
  margin-top: 0px;
  margin-bottom: 0px;
  border: 0px;
  border-radius: 0px;
}
#running .panel-group .panel .panel-body .list_container .list_item {
  border-bottom: 1px solid #ddd;
}
#running .panel-group .panel .panel-body .list_container .list_item:last-child {
  border-bottom: 0px;
}
.delete-button {
  display: none;
}
.duplicate-button {
  display: none;
}
.rename-button {
  display: none;
}
.shutdown-button {
  display: none;
}
.dynamic-instructions {
  display: inline-block;
  padding-top: 4px;
}
/*!
*
* IPython text editor webapp
*
*/
.selected-keymap i.fa {
  padding: 0px 5px;
}
.selected-keymap i.fa:before {
  content: "\f00c";
}
#mode-menu {
  overflow: auto;
  max-height: 20em;
}
.edit_app #header {
  -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
}
.edit_app #menubar .navbar {
  /* Use a negative 1 bottom margin, so the border overlaps the border of the
    header */
  margin-bottom: -1px;
}
.dirty-indicator {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  width: 20px;
}
.dirty-indicator.pull-left {
  margin-right: .3em;
}
.dirty-indicator.pull-right {
  margin-left: .3em;
}
.dirty-indicator-dirty {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  width: 20px;
}
.dirty-indicator-dirty.pull-left {
  margin-right: .3em;
}
.dirty-indicator-dirty.pull-right {
  margin-left: .3em;
}
.dirty-indicator-clean {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  width: 20px;
}
.dirty-indicator-clean.pull-left {
  margin-right: .3em;
}
.dirty-indicator-clean.pull-right {
  margin-left: .3em;
}
.dirty-indicator-clean:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f00c";
}
.dirty-indicator-clean:before.pull-left {
  margin-right: .3em;
}
.dirty-indicator-clean:before.pull-right {
  margin-left: .3em;
}
#filename {
  font-size: 16pt;
  display: table;
  padding: 0px 5px;
}
#current-mode {
  padding-left: 5px;
  padding-right: 5px;
}
#texteditor-backdrop {
  padding-top: 20px;
  padding-bottom: 20px;
}
@media not print {
  #texteditor-backdrop {
    background-color: #EEE;
  }
}
@media print {
  #texteditor-backdrop #texteditor-container .CodeMirror-gutter,
  #texteditor-backdrop #texteditor-container .CodeMirror-gutters {
    background-color: #fff;
  }
}
@media not print {
  #texteditor-backdrop #texteditor-container .CodeMirror-gutter,
  #texteditor-backdrop #texteditor-container .CodeMirror-gutters {
    background-color: #fff;
  }
}
@media not print {
  #texteditor-backdrop #texteditor-container {
    padding: 0px;
    background-color: #fff;
    -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
    box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  }
}
/*!
*
* IPython notebook
*
*/
/* CSS font colors for translated ANSI colors. */
.ansibold {
  font-weight: bold;
}
/* use dark versions for foreground, to improve visibility */
.ansiblack {
  color: black;
}
.ansired {
  color: darkred;
}
.ansigreen {
  color: darkgreen;
}
.ansiyellow {
  color: #c4a000;
}
.ansiblue {
  color: darkblue;
}
.ansipurple {
  color: darkviolet;
}
.ansicyan {
  color: steelblue;
}
.ansigray {
  color: gray;
}
/* and light for background, for the same reason */
.ansibgblack {
  background-color: black;
}
.ansibgred {
  background-color: red;
}
.ansibggreen {
  background-color: green;
}
.ansibgyellow {
  background-color: yellow;
}
.ansibgblue {
  background-color: blue;
}
.ansibgpurple {
  background-color: magenta;
}
.ansibgcyan {
  background-color: cyan;
}
.ansibggray {
  background-color: gray;
}
div.cell {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
  border-radius: 2px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  border-width: 1px;
  border-style: solid;
  border-color: transparent;
  width: 100%;
  padding: 5px;
  /* This acts as a spacer between cells, that is outside the border */
  margin: 0px;
  outline: none;
  border-left-width: 1px;
  padding-left: 5px;
  background: linear-gradient(to right, transparent -40px, transparent 1px, transparent 1px, transparent 100%);
}
div.cell.jupyter-soft-selected {
  border-left-color: #90CAF9;
  border-left-color: #E3F2FD;
  border-left-width: 1px;
  padding-left: 5px;
  border-right-color: #E3F2FD;
  border-right-width: 1px;
  background: #E3F2FD;
}
@media print {
  div.cell.jupyter-soft-selected {
    border-color: transparent;
  }
}
div.cell.selected {
  border-color: #ababab;
  border-left-width: 0px;
  padding-left: 6px;
  background: linear-gradient(to right, #42A5F5 -40px, #42A5F5 5px, transparent 5px, transparent 100%);
}
@media print {
  div.cell.selected {
    border-color: transparent;
  }
}
div.cell.selected.jupyter-soft-selected {
  border-left-width: 0;
  padding-left: 6px;
  background: linear-gradient(to right, #42A5F5 -40px, #42A5F5 7px, #E3F2FD 7px, #E3F2FD 100%);
}
.edit_mode div.cell.selected {
  border-color: #66BB6A;
  border-left-width: 0px;
  padding-left: 6px;
  background: linear-gradient(to right, #66BB6A -40px, #66BB6A 5px, transparent 5px, transparent 100%);
}
@media print {
  .edit_mode div.cell.selected {
    border-color: transparent;
  }
}
.prompt {
  /* This needs to be wide enough for 3 digit prompt numbers: In[100]: */
  min-width: 14ex;
  /* This padding is tuned to match the padding on the CodeMirror editor. */
  padding: 0.4em;
  margin: 0px;
  font-family: monospace;
  text-align: right;
  /* This has to match that of the the CodeMirror class line-height below */
  line-height: 1.21429em;
  /* Don't highlight prompt number selection */
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  -khtml-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
  /* Use default cursor */
  cursor: default;
}
@media (max-width: 540px) {
  .prompt {
    text-align: left;
  }
}
div.inner_cell {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
  /* Old browsers */
  -webkit-box-flex: 1;
  -moz-box-flex: 1;
  box-flex: 1;
  /* Modern browsers */
  flex: 1;
}
@-moz-document url-prefix() {
  div.inner_cell {
    overflow-x: hidden;
  }
}
/* input_area and input_prompt must match in top border and margin for alignment */
div.input_area {
  border: 1px solid #cfcfcf;
  border-radius: 2px;
  background: #f7f7f7;
  line-height: 1.21429em;
}
/* This is needed so that empty prompt areas can collapse to zero height when there
   is no content in the output_subarea and the prompt. The main purpose of this is
   to make sure that empty JavaScript output_subareas have no height. */
div.prompt:empty {
  padding-top: 0;
  padding-bottom: 0;
}
div.unrecognized_cell {
  padding: 5px 5px 5px 0px;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
}
div.unrecognized_cell .inner_cell {
  border-radius: 2px;
  padding: 5px;
  font-weight: bold;
  color: red;
  border: 1px solid #cfcfcf;
  background: #eaeaea;
}
div.unrecognized_cell .inner_cell a {
  color: inherit;
  text-decoration: none;
}
div.unrecognized_cell .inner_cell a:hover {
  color: inherit;
  text-decoration: none;
}
@media (max-width: 540px) {
  div.unrecognized_cell > div.prompt {
    display: none;
  }
}
div.code_cell {
  /* avoid page breaking on code cells when printing */
}
@media print {
  div.code_cell {
    page-break-inside: avoid;
  }
}
/* any special styling for code cells that are currently running goes here */
div.input {
  page-break-inside: avoid;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
}
@media (max-width: 540px) {
  div.input {
    /* Old browsers */
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-box-align: stretch;
    display: -moz-box;
    -moz-box-orient: vertical;
    -moz-box-align: stretch;
    display: box;
    box-orient: vertical;
    box-align: stretch;
    /* Modern browsers */
    display: flex;
    flex-direction: column;
    align-items: stretch;
  }
}
/* input_area and input_prompt must match in top border and margin for alignment */
div.input_prompt {
  color: #303F9F;
  border-top: 1px solid transparent;
}
div.input_area > div.highlight {
  margin: 0.4em;
  border: none;
  padding: 0px;
  background-color: transparent;
}
div.input_area > div.highlight > pre {
  margin: 0px;
  border: none;
  padding: 0px;
  background-color: transparent;
}
/* The following gets added to the <head> if it is detected that the user has a
 * monospace font with inconsistent normal/bold/italic height.  See
 * notebookmain.js.  Such fonts will have keywords vertically offset with
 * respect to the rest of the text.  The user should select a better font.
 * See: https://github.com/ipython/ipython/issues/1503
 *
 * .CodeMirror span {
 *      vertical-align: bottom;
 * }
 */
.CodeMirror {
  line-height: 1.21429em;
  /* Changed from 1em to our global default */
  font-size: 14px;
  height: auto;
  /* Changed to auto to autogrow */
  background: none;
  /* Changed from white to allow our bg to show through */
}
.CodeMirror-scroll {
  /*  The CodeMirror docs are a bit fuzzy on if overflow-y should be hidden or visible.*/
  /*  We have found that if it is visible, vertical scrollbars appear with font size changes.*/
  overflow-y: hidden;
  overflow-x: auto;
}
.CodeMirror-lines {
  /* In CM2, this used to be 0.4em, but in CM3 it went to 4px. We need the em value because */
  /* we have set a different line-height and want this to scale with that. */
  padding: 0.4em;
}
.CodeMirror-linenumber {
  padding: 0 8px 0 4px;
}
.CodeMirror-gutters {
  border-bottom-left-radius: 2px;
  border-top-left-radius: 2px;
}
.CodeMirror pre {
  /* In CM3 this went to 4px from 0 in CM2. We need the 0 value because of how we size */
  /* .CodeMirror-lines */
  padding: 0;
  border: 0;
  border-radius: 0;
}
/*

Original style from softwaremaniacs.org (c) Ivan Sagalaev <Maniac@SoftwareManiacs.Org>
Adapted from GitHub theme

*/
.highlight-base {
  color: #000;
}
.highlight-variable {
  color: #000;
}
.highlight-variable-2 {
  color: #1a1a1a;
}
.highlight-variable-3 {
  color: #333333;
}
.highlight-string {
  color: #BA2121;
}
.highlight-comment {
  color: #408080;
  font-style: italic;
}
.highlight-number {
  color: #080;
}
.highlight-atom {
  color: #88F;
}
.highlight-keyword {
  color: #008000;
  font-weight: bold;
}
.highlight-builtin {
  color: #008000;
}
.highlight-error {
  color: #f00;
}
.highlight-operator {
  color: #AA22FF;
  font-weight: bold;
}
.highlight-meta {
  color: #AA22FF;
}
/* previously not defined, copying from default codemirror */
.highlight-def {
  color: #00f;
}
.highlight-string-2 {
  color: #f50;
}
.highlight-qualifier {
  color: #555;
}
.highlight-bracket {
  color: #997;
}
.highlight-tag {
  color: #170;
}
.highlight-attribute {
  color: #00c;
}
.highlight-header {
  color: blue;
}
.highlight-quote {
  color: #090;
}
.highlight-link {
  color: #00c;
}
/* apply the same style to codemirror */
.cm-s-ipython span.cm-keyword {
  color: #008000;
  font-weight: bold;
}
.cm-s-ipython span.cm-atom {
  color: #88F;
}
.cm-s-ipython span.cm-number {
  color: #080;
}
.cm-s-ipython span.cm-def {
  color: #00f;
}
.cm-s-ipython span.cm-variable {
  color: #000;
}
.cm-s-ipython span.cm-operator {
  color: #AA22FF;
  font-weight: bold;
}
.cm-s-ipython span.cm-variable-2 {
  color: #1a1a1a;
}
.cm-s-ipython span.cm-variable-3 {
  color: #333333;
}
.cm-s-ipython span.cm-comment {
  color: #408080;
  font-style: italic;
}
.cm-s-ipython span.cm-string {
  color: #BA2121;
}
.cm-s-ipython span.cm-string-2 {
  color: #f50;
}
.cm-s-ipython span.cm-meta {
  color: #AA22FF;
}
.cm-s-ipython span.cm-qualifier {
  color: #555;
}
.cm-s-ipython span.cm-builtin {
  color: #008000;
}
.cm-s-ipython span.cm-bracket {
  color: #997;
}
.cm-s-ipython span.cm-tag {
  color: #170;
}
.cm-s-ipython span.cm-attribute {
  color: #00c;
}
.cm-s-ipython span.cm-header {
  color: blue;
}
.cm-s-ipython span.cm-quote {
  color: #090;
}
.cm-s-ipython span.cm-link {
  color: #00c;
}
.cm-s-ipython span.cm-error {
  color: #f00;
}
.cm-s-ipython span.cm-tab {
  background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAMCAYAAAAkuj5RAAAAAXNSR0IArs4c6QAAAGFJREFUSMft1LsRQFAQheHPowAKoACx3IgEKtaEHujDjORSgWTH/ZOdnZOcM/sgk/kFFWY0qV8foQwS4MKBCS3qR6ixBJvElOobYAtivseIE120FaowJPN75GMu8j/LfMwNjh4HUpwg4LUAAAAASUVORK5CYII=);
  background-position: right;
  background-repeat: no-repeat;
}
div.output_wrapper {
  /* this position must be relative to enable descendents to be absolute within it */
  position: relative;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
  z-index: 1;
}
/* class for the output area when it should be height-limited */
div.output_scroll {
  /* ideally, this would be max-height, but FF barfs all over that */
  height: 24em;
  /* FF needs this *and the wrapper* to specify full width, or it will shrinkwrap */
  width: 100%;
  overflow: auto;
  border-radius: 2px;
  -webkit-box-shadow: inset 0 2px 8px rgba(0, 0, 0, 0.8);
  box-shadow: inset 0 2px 8px rgba(0, 0, 0, 0.8);
  display: block;
}
/* output div while it is collapsed */
div.output_collapsed {
  margin: 0px;
  padding: 0px;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
}
div.out_prompt_overlay {
  height: 100%;
  padding: 0px 0.4em;
  position: absolute;
  border-radius: 2px;
}
div.out_prompt_overlay:hover {
  /* use inner shadow to get border that is computed the same on WebKit/FF */
  -webkit-box-shadow: inset 0 0 1px #000;
  box-shadow: inset 0 0 1px #000;
  background: rgba(240, 240, 240, 0.5);
}
div.output_prompt {
  color: #D84315;
}
/* This class is the outer container of all output sections. */
div.output_area {
  padding: 0px;
  page-break-inside: avoid;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
}
div.output_area .MathJax_Display {
  text-align: left !important;
}
div.output_area .rendered_html table {
  margin-left: 0;
  margin-right: 0;
}
div.output_area .rendered_html img {
  margin-left: 0;
  margin-right: 0;
}
div.output_area img,
div.output_area svg {
  max-width: 100%;
  height: auto;
}
div.output_area img.unconfined,
div.output_area svg.unconfined {
  max-width: none;
}
/* This is needed to protect the pre formating from global settings such
   as that of bootstrap */
.output {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: vertical;
  -moz-box-align: stretch;
  display: box;
  box-orient: vertical;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: column;
  align-items: stretch;
}
@media (max-width: 540px) {
  div.output_area {
    /* Old browsers */
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-box-align: stretch;
    display: -moz-box;
    -moz-box-orient: vertical;
    -moz-box-align: stretch;
    display: box;
    box-orient: vertical;
    box-align: stretch;
    /* Modern browsers */
    display: flex;
    flex-direction: column;
    align-items: stretch;
  }
}
div.output_area pre {
  margin: 0;
  padding: 0;
  border: 0;
  vertical-align: baseline;
  color: black;
  background-color: transparent;
  border-radius: 0;
}
/* This class is for the output subarea inside the output_area and after
   the prompt div. */
div.output_subarea {
  overflow-x: auto;
  padding: 0.4em;
  /* Old browsers */
  -webkit-box-flex: 1;
  -moz-box-flex: 1;
  box-flex: 1;
  /* Modern browsers */
  flex: 1;
  max-width: calc(100% - 14ex);
}
div.output_scroll div.output_subarea {
  overflow-x: visible;
}
/* The rest of the output_* classes are for special styling of the different
   output types */
/* all text output has this class: */
div.output_text {
  text-align: left;
  color: #000;
  /* This has to match that of the the CodeMirror class line-height below */
  line-height: 1.21429em;
}
/* stdout/stderr are 'text' as well as 'stream', but execute_result/error are *not* streams */
div.output_stderr {
  background: #fdd;
  /* very light red background for stderr */
}
div.output_latex {
  text-align: left;
}
/* Empty output_javascript divs should have no height */
div.output_javascript:empty {
  padding: 0;
}
.js-error {
  color: darkred;
}
/* raw_input styles */
div.raw_input_container {
  line-height: 1.21429em;
  padding-top: 5px;
}
pre.raw_input_prompt {
  /* nothing needed here. */
}
input.raw_input {
  font-family: monospace;
  font-size: inherit;
  color: inherit;
  width: auto;
  /* make sure input baseline aligns with prompt */
  vertical-align: baseline;
  /* padding + margin = 0.5em between prompt and cursor */
  padding: 0em 0.25em;
  margin: 0em 0.25em;
}
input.raw_input:focus {
  box-shadow: none;
}
p.p-space {
  margin-bottom: 10px;
}
div.output_unrecognized {
  padding: 5px;
  font-weight: bold;
  color: red;
}
div.output_unrecognized a {
  color: inherit;
  text-decoration: none;
}
div.output_unrecognized a:hover {
  color: inherit;
  text-decoration: none;
}
.rendered_html {
  color: #000;
  /* any extras will just be numbers: */
}
.rendered_html em {
  font-style: italic;
}
.rendered_html strong {
  font-weight: bold;
}
.rendered_html u {
  text-decoration: underline;
}
.rendered_html :link {
  text-decoration: underline;
}
.rendered_html :visited {
  text-decoration: underline;
}
.rendered_html h1 {
  font-size: 185.7%;
  margin: 1.08em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
}
.rendered_html h2 {
  font-size: 157.1%;
  margin: 1.27em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
}
.rendered_html h3 {
  font-size: 128.6%;
  margin: 1.55em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
}
.rendered_html h4 {
  font-size: 100%;
  margin: 2em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
}
.rendered_html h5 {
  font-size: 100%;
  margin: 2em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
  font-style: italic;
}
.rendered_html h6 {
  font-size: 100%;
  margin: 2em 0 0 0;
  font-weight: bold;
  line-height: 1.0;
  font-style: italic;
}
.rendered_html h1:first-child {
  margin-top: 0.538em;
}
.rendered_html h2:first-child {
  margin-top: 0.636em;
}
.rendered_html h3:first-child {
  margin-top: 0.777em;
}
.rendered_html h4:first-child {
  margin-top: 1em;
}
.rendered_html h5:first-child {
  margin-top: 1em;
}
.rendered_html h6:first-child {
  margin-top: 1em;
}
.rendered_html ul {
  list-style: disc;
  margin: 0em 2em;
  padding-left: 0px;
}
.rendered_html ul ul {
  list-style: square;
  margin: 0em 2em;
}
.rendered_html ul ul ul {
  list-style: circle;
  margin: 0em 2em;
}
.rendered_html ol {
  list-style: decimal;
  margin: 0em 2em;
  padding-left: 0px;
}
.rendered_html ol ol {
  list-style: upper-alpha;
  margin: 0em 2em;
}
.rendered_html ol ol ol {
  list-style: lower-alpha;
  margin: 0em 2em;
}
.rendered_html ol ol ol ol {
  list-style: lower-roman;
  margin: 0em 2em;
}
.rendered_html ol ol ol ol ol {
  list-style: decimal;
  margin: 0em 2em;
}
.rendered_html * + ul {
  margin-top: 1em;
}
.rendered_html * + ol {
  margin-top: 1em;
}
.rendered_html hr {
  color: black;
  background-color: black;
}
.rendered_html pre {
  margin: 1em 2em;
}
.rendered_html pre,
.rendered_html code {
  border: 0;
  background-color: #fff;
  color: #000;
  font-size: 100%;
  padding: 0px;
}
.rendered_html blockquote {
  margin: 1em 2em;
}
.rendered_html table {
  margin-left: auto;
  margin-right: auto;
  border: 1px solid black;
  border-collapse: collapse;
}
.rendered_html tr,
.rendered_html th,
.rendered_html td {
  border: 1px solid black;
  border-collapse: collapse;
  margin: 1em 2em;
}
.rendered_html td,
.rendered_html th {
  text-align: left;
  vertical-align: middle;
  padding: 4px;
}
.rendered_html th {
  font-weight: bold;
}
.rendered_html * + table {
  margin-top: 1em;
}
.rendered_html p {
  text-align: left;
}
.rendered_html * + p {
  margin-top: 1em;
}
.rendered_html img {
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.rendered_html * + img {
  margin-top: 1em;
}
.rendered_html img,
.rendered_html svg {
  max-width: 100%;
  height: auto;
}
.rendered_html img.unconfined,
.rendered_html svg.unconfined {
  max-width: none;
}
div.text_cell {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
}
@media (max-width: 540px) {
  div.text_cell > div.prompt {
    display: none;
  }
}
div.text_cell_render {
  /*font-family: "Helvetica Neue", Arial, Helvetica, Geneva, sans-serif;*/
  outline: none;
  resize: none;
  width: inherit;
  border-style: none;
  padding: 0.5em 0.5em 0.5em 0.4em;
  color: #000;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
}
a.anchor-link:link {
  text-decoration: none;
  padding: 0px 20px;
  visibility: hidden;
}
h1:hover .anchor-link,
h2:hover .anchor-link,
h3:hover .anchor-link,
h4:hover .anchor-link,
h5:hover .anchor-link,
h6:hover .anchor-link {
  visibility: visible;
}
.text_cell.rendered .input_area {
  display: none;
}
.text_cell.rendered .rendered_html {
  overflow-x: auto;
  overflow-y: hidden;
}
.text_cell.unrendered .text_cell_render {
  display: none;
}
.cm-header-1,
.cm-header-2,
.cm-header-3,
.cm-header-4,
.cm-header-5,
.cm-header-6 {
  font-weight: bold;
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.cm-header-1 {
  font-size: 185.7%;
}
.cm-header-2 {
  font-size: 157.1%;
}
.cm-header-3 {
  font-size: 128.6%;
}
.cm-header-4 {
  font-size: 110%;
}
.cm-header-5 {
  font-size: 100%;
  font-style: italic;
}
.cm-header-6 {
  font-size: 100%;
  font-style: italic;
}
/*!
*
* IPython notebook webapp
*
*/
@media (max-width: 767px) {
  .notebook_app {
    padding-left: 0px;
    padding-right: 0px;
  }
}
#ipython-main-app {
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  height: 100%;
}
div#notebook_panel {
  margin: 0px;
  padding: 0px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  height: 100%;
}
div#notebook {
  font-size: 14px;
  line-height: 20px;
  overflow-y: hidden;
  overflow-x: auto;
  width: 100%;
  /* This spaces the page away from the edge of the notebook area */
  padding-top: 20px;
  margin: 0px;
  outline: none;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  min-height: 100%;
}
@media not print {
  #notebook-container {
    padding: 15px;
    background-color: #fff;
    min-height: 0;
    -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
    box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  }
}
@media print {
  #notebook-container {
    width: 100%;
  }
}
div.ui-widget-content {
  border: 1px solid #ababab;
  outline: none;
}
pre.dialog {
  background-color: #f7f7f7;
  border: 1px solid #ddd;
  border-radius: 2px;
  padding: 0.4em;
  padding-left: 2em;
}
p.dialog {
  padding: 0.2em;
}
/* Word-wrap output correctly.  This is the CSS3 spelling, though Firefox seems
   to not honor it correctly.  Webkit browsers (Chrome, rekonq, Safari) do.
 */
pre,
code,
kbd,
samp {
  white-space: pre-wrap;
}
#fonttest {
  font-family: monospace;
}
p {
  margin-bottom: 0;
}
.end_space {
  min-height: 100px;
  transition: height .2s ease;
}
.notebook_app > #header {
  -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
}
@media not print {
  .notebook_app {
    background-color: #EEE;
  }
}
kbd {
  border-style: solid;
  border-width: 1px;
  box-shadow: none;
  margin: 2px;
  padding-left: 2px;
  padding-right: 2px;
  padding-top: 1px;
  padding-bottom: 1px;
}
/* CSS for the cell toolbar */
.celltoolbar {
  border: thin solid #CFCFCF;
  border-bottom: none;
  background: #EEE;
  border-radius: 2px 2px 0px 0px;
  width: 100%;
  height: 29px;
  padding-right: 4px;
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
  /* Old browsers */
  -webkit-box-pack: end;
  -moz-box-pack: end;
  box-pack: end;
  /* Modern browsers */
  justify-content: flex-end;
  display: -webkit-flex;
}
@media print {
  .celltoolbar {
    display: none;
  }
}
.ctb_hideshow {
  display: none;
  vertical-align: bottom;
}
/* ctb_show is added to the ctb_hideshow div to show the cell toolbar.
   Cell toolbars are only shown when the ctb_global_show class is also set.
*/
.ctb_global_show .ctb_show.ctb_hideshow {
  display: block;
}
.ctb_global_show .ctb_show + .input_area,
.ctb_global_show .ctb_show + div.text_cell_input,
.ctb_global_show .ctb_show ~ div.text_cell_render {
  border-top-right-radius: 0px;
  border-top-left-radius: 0px;
}
.ctb_global_show .ctb_show ~ div.text_cell_render {
  border: 1px solid #cfcfcf;
}
.celltoolbar {
  font-size: 87%;
  padding-top: 3px;
}
.celltoolbar select {
  display: block;
  width: 100%;
  height: 32px;
  padding: 6px 12px;
  font-size: 13px;
  line-height: 1.42857143;
  color: #555555;
  background-color: #fff;
  background-image: none;
  border: 1px solid #ccc;
  border-radius: 2px;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  -webkit-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
  -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
  transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
  height: 30px;
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1.5;
  border-radius: 1px;
  width: inherit;
  font-size: inherit;
  height: 22px;
  padding: 0px;
  display: inline-block;
}
.celltoolbar select:focus {
  border-color: #66afe9;
  outline: 0;
  -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102, 175, 233, 0.6);
  box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102, 175, 233, 0.6);
}
.celltoolbar select::-moz-placeholder {
  color: #999;
  opacity: 1;
}
.celltoolbar select:-ms-input-placeholder {
  color: #999;
}
.celltoolbar select::-webkit-input-placeholder {
  color: #999;
}
.celltoolbar select::-ms-expand {
  border: 0;
  background-color: transparent;
}
.celltoolbar select[disabled],
.celltoolbar select[readonly],
fieldset[disabled] .celltoolbar select {
  background-color: #eeeeee;
  opacity: 1;
}
.celltoolbar select[disabled],
fieldset[disabled] .celltoolbar select {
  cursor: not-allowed;
}
textarea.celltoolbar select {
  height: auto;
}
select.celltoolbar select {
  height: 30px;
  line-height: 30px;
}
textarea.celltoolbar select,
select[multiple].celltoolbar select {
  height: auto;
}
.celltoolbar label {
  margin-left: 5px;
  margin-right: 5px;
}
.completions {
  position: absolute;
  z-index: 110;
  overflow: hidden;
  border: 1px solid #ababab;
  border-radius: 2px;
  -webkit-box-shadow: 0px 6px 10px -1px #adadad;
  box-shadow: 0px 6px 10px -1px #adadad;
  line-height: 1;
}
.completions select {
  background: white;
  outline: none;
  border: none;
  padding: 0px;
  margin: 0px;
  overflow: auto;
  font-family: monospace;
  font-size: 110%;
  color: #000;
  width: auto;
}
.completions select option.context {
  color: #286090;
}
#kernel_logo_widget {
  float: right !important;
  float: right;
}
#kernel_logo_widget .current_kernel_logo {
  display: none;
  margin-top: -1px;
  margin-bottom: -1px;
  width: 32px;
  height: 32px;
}
#menubar {
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  margin-top: 1px;
}
#menubar .navbar {
  border-top: 1px;
  border-radius: 0px 0px 2px 2px;
  margin-bottom: 0px;
}
#menubar .navbar-toggle {
  float: left;
  padding-top: 7px;
  padding-bottom: 7px;
  border: none;
}
#menubar .navbar-collapse {
  clear: left;
}
.nav-wrapper {
  border-bottom: 1px solid #e7e7e7;
}
i.menu-icon {
  padding-top: 4px;
}
ul#help_menu li a {
  overflow: hidden;
  padding-right: 2.2em;
}
ul#help_menu li a i {
  margin-right: -1.2em;
}
.dropdown-submenu {
  position: relative;
}
.dropdown-submenu > .dropdown-menu {
  top: 0;
  left: 100%;
  margin-top: -6px;
  margin-left: -1px;
}
.dropdown-submenu:hover > .dropdown-menu {
  display: block;
}
.dropdown-submenu > a:after {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  display: block;
  content: "\f0da";
  float: right;
  color: #333333;
  margin-top: 2px;
  margin-right: -10px;
}
.dropdown-submenu > a:after.pull-left {
  margin-right: .3em;
}
.dropdown-submenu > a:after.pull-right {
  margin-left: .3em;
}
.dropdown-submenu:hover > a:after {
  color: #262626;
}
.dropdown-submenu.pull-left {
  float: none;
}
.dropdown-submenu.pull-left > .dropdown-menu {
  left: -100%;
  margin-left: 10px;
}
#notification_area {
  float: right !important;
  float: right;
  z-index: 10;
}
.indicator_area {
  float: right !important;
  float: right;
  color: #777;
  margin-left: 5px;
  margin-right: 5px;
  width: 11px;
  z-index: 10;
  text-align: center;
  width: auto;
}
#kernel_indicator {
  float: right !important;
  float: right;
  color: #777;
  margin-left: 5px;
  margin-right: 5px;
  width: 11px;
  z-index: 10;
  text-align: center;
  width: auto;
  border-left: 1px solid;
}
#kernel_indicator .kernel_indicator_name {
  padding-left: 5px;
  padding-right: 5px;
}
#modal_indicator {
  float: right !important;
  float: right;
  color: #777;
  margin-left: 5px;
  margin-right: 5px;
  width: 11px;
  z-index: 10;
  text-align: center;
  width: auto;
}
#readonly-indicator {
  float: right !important;
  float: right;
  color: #777;
  margin-left: 5px;
  margin-right: 5px;
  width: 11px;
  z-index: 10;
  text-align: center;
  width: auto;
  margin-top: 2px;
  margin-bottom: 0px;
  margin-left: 0px;
  margin-right: 0px;
  display: none;
}
.modal_indicator:before {
  width: 1.28571429em;
  text-align: center;
}
.edit_mode .modal_indicator:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f040";
}
.edit_mode .modal_indicator:before.pull-left {
  margin-right: .3em;
}
.edit_mode .modal_indicator:before.pull-right {
  margin-left: .3em;
}
.command_mode .modal_indicator:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: ' ';
}
.command_mode .modal_indicator:before.pull-left {
  margin-right: .3em;
}
.command_mode .modal_indicator:before.pull-right {
  margin-left: .3em;
}
.kernel_idle_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f10c";
}
.kernel_idle_icon:before.pull-left {
  margin-right: .3em;
}
.kernel_idle_icon:before.pull-right {
  margin-left: .3em;
}
.kernel_busy_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f111";
}
.kernel_busy_icon:before.pull-left {
  margin-right: .3em;
}
.kernel_busy_icon:before.pull-right {
  margin-left: .3em;
}
.kernel_dead_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f1e2";
}
.kernel_dead_icon:before.pull-left {
  margin-right: .3em;
}
.kernel_dead_icon:before.pull-right {
  margin-left: .3em;
}
.kernel_disconnected_icon:before {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  content: "\f127";
}
.kernel_disconnected_icon:before.pull-left {
  margin-right: .3em;
}
.kernel_disconnected_icon:before.pull-right {
  margin-left: .3em;
}
.notification_widget {
  color: #777;
  z-index: 10;
  background: rgba(240, 240, 240, 0.5);
  margin-right: 4px;
  color: #333;
  background-color: #fff;
  border-color: #ccc;
}
.notification_widget:focus,
.notification_widget.focus {
  color: #333;
  background-color: #e6e6e6;
  border-color: #8c8c8c;
}
.notification_widget:hover {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
.notification_widget:active,
.notification_widget.active,
.open > .dropdown-toggle.notification_widget {
  color: #333;
  background-color: #e6e6e6;
  border-color: #adadad;
}
.notification_widget:active:hover,
.notification_widget.active:hover,
.open > .dropdown-toggle.notification_widget:hover,
.notification_widget:active:focus,
.notification_widget.active:focus,
.open > .dropdown-toggle.notification_widget:focus,
.notification_widget:active.focus,
.notification_widget.active.focus,
.open > .dropdown-toggle.notification_widget.focus {
  color: #333;
  background-color: #d4d4d4;
  border-color: #8c8c8c;
}
.notification_widget:active,
.notification_widget.active,
.open > .dropdown-toggle.notification_widget {
  background-image: none;
}
.notification_widget.disabled:hover,
.notification_widget[disabled]:hover,
fieldset[disabled] .notification_widget:hover,
.notification_widget.disabled:focus,
.notification_widget[disabled]:focus,
fieldset[disabled] .notification_widget:focus,
.notification_widget.disabled.focus,
.notification_widget[disabled].focus,
fieldset[disabled] .notification_widget.focus {
  background-color: #fff;
  border-color: #ccc;
}
.notification_widget .badge {
  color: #fff;
  background-color: #333;
}
.notification_widget.warning {
  color: #fff;
  background-color: #f0ad4e;
  border-color: #eea236;
}
.notification_widget.warning:focus,
.notification_widget.warning.focus {
  color: #fff;
  background-color: #ec971f;
  border-color: #985f0d;
}
.notification_widget.warning:hover {
  color: #fff;
  background-color: #ec971f;
  border-color: #d58512;
}
.notification_widget.warning:active,
.notification_widget.warning.active,
.open > .dropdown-toggle.notification_widget.warning {
  color: #fff;
  background-color: #ec971f;
  border-color: #d58512;
}
.notification_widget.warning:active:hover,
.notification_widget.warning.active:hover,
.open > .dropdown-toggle.notification_widget.warning:hover,
.notification_widget.warning:active:focus,
.notification_widget.warning.active:focus,
.open > .dropdown-toggle.notification_widget.warning:focus,
.notification_widget.warning:active.focus,
.notification_widget.warning.active.focus,
.open > .dropdown-toggle.notification_widget.warning.focus {
  color: #fff;
  background-color: #d58512;
  border-color: #985f0d;
}
.notification_widget.warning:active,
.notification_widget.warning.active,
.open > .dropdown-toggle.notification_widget.warning {
  background-image: none;
}
.notification_widget.warning.disabled:hover,
.notification_widget.warning[disabled]:hover,
fieldset[disabled] .notification_widget.warning:hover,
.notification_widget.warning.disabled:focus,
.notification_widget.warning[disabled]:focus,
fieldset[disabled] .notification_widget.warning:focus,
.notification_widget.warning.disabled.focus,
.notification_widget.warning[disabled].focus,
fieldset[disabled] .notification_widget.warning.focus {
  background-color: #f0ad4e;
  border-color: #eea236;
}
.notification_widget.warning .badge {
  color: #f0ad4e;
  background-color: #fff;
}
.notification_widget.success {
  color: #fff;
  background-color: #5cb85c;
  border-color: #4cae4c;
}
.notification_widget.success:focus,
.notification_widget.success.focus {
  color: #fff;
  background-color: #449d44;
  border-color: #255625;
}
.notification_widget.success:hover {
  color: #fff;
  background-color: #449d44;
  border-color: #398439;
}
.notification_widget.success:active,
.notification_widget.success.active,
.open > .dropdown-toggle.notification_widget.success {
  color: #fff;
  background-color: #449d44;
  border-color: #398439;
}
.notification_widget.success:active:hover,
.notification_widget.success.active:hover,
.open > .dropdown-toggle.notification_widget.success:hover,
.notification_widget.success:active:focus,
.notification_widget.success.active:focus,
.open > .dropdown-toggle.notification_widget.success:focus,
.notification_widget.success:active.focus,
.notification_widget.success.active.focus,
.open > .dropdown-toggle.notification_widget.success.focus {
  color: #fff;
  background-color: #398439;
  border-color: #255625;
}
.notification_widget.success:active,
.notification_widget.success.active,
.open > .dropdown-toggle.notification_widget.success {
  background-image: none;
}
.notification_widget.success.disabled:hover,
.notification_widget.success[disabled]:hover,
fieldset[disabled] .notification_widget.success:hover,
.notification_widget.success.disabled:focus,
.notification_widget.success[disabled]:focus,
fieldset[disabled] .notification_widget.success:focus,
.notification_widget.success.disabled.focus,
.notification_widget.success[disabled].focus,
fieldset[disabled] .notification_widget.success.focus {
  background-color: #5cb85c;
  border-color: #4cae4c;
}
.notification_widget.success .badge {
  color: #5cb85c;
  background-color: #fff;
}
.notification_widget.info {
  color: #fff;
  background-color: #5bc0de;
  border-color: #46b8da;
}
.notification_widget.info:focus,
.notification_widget.info.focus {
  color: #fff;
  background-color: #31b0d5;
  border-color: #1b6d85;
}
.notification_widget.info:hover {
  color: #fff;
  background-color: #31b0d5;
  border-color: #269abc;
}
.notification_widget.info:active,
.notification_widget.info.active,
.open > .dropdown-toggle.notification_widget.info {
  color: #fff;
  background-color: #31b0d5;
  border-color: #269abc;
}
.notification_widget.info:active:hover,
.notification_widget.info.active:hover,
.open > .dropdown-toggle.notification_widget.info:hover,
.notification_widget.info:active:focus,
.notification_widget.info.active:focus,
.open > .dropdown-toggle.notification_widget.info:focus,
.notification_widget.info:active.focus,
.notification_widget.info.active.focus,
.open > .dropdown-toggle.notification_widget.info.focus {
  color: #fff;
  background-color: #269abc;
  border-color: #1b6d85;
}
.notification_widget.info:active,
.notification_widget.info.active,
.open > .dropdown-toggle.notification_widget.info {
  background-image: none;
}
.notification_widget.info.disabled:hover,
.notification_widget.info[disabled]:hover,
fieldset[disabled] .notification_widget.info:hover,
.notification_widget.info.disabled:focus,
.notification_widget.info[disabled]:focus,
fieldset[disabled] .notification_widget.info:focus,
.notification_widget.info.disabled.focus,
.notification_widget.info[disabled].focus,
fieldset[disabled] .notification_widget.info.focus {
  background-color: #5bc0de;
  border-color: #46b8da;
}
.notification_widget.info .badge {
  color: #5bc0de;
  background-color: #fff;
}
.notification_widget.danger {
  color: #fff;
  background-color: #d9534f;
  border-color: #d43f3a;
}
.notification_widget.danger:focus,
.notification_widget.danger.focus {
  color: #fff;
  background-color: #c9302c;
  border-color: #761c19;
}
.notification_widget.danger:hover {
  color: #fff;
  background-color: #c9302c;
  border-color: #ac2925;
}
.notification_widget.danger:active,
.notification_widget.danger.active,
.open > .dropdown-toggle.notification_widget.danger {
  color: #fff;
  background-color: #c9302c;
  border-color: #ac2925;
}
.notification_widget.danger:active:hover,
.notification_widget.danger.active:hover,
.open > .dropdown-toggle.notification_widget.danger:hover,
.notification_widget.danger:active:focus,
.notification_widget.danger.active:focus,
.open > .dropdown-toggle.notification_widget.danger:focus,
.notification_widget.danger:active.focus,
.notification_widget.danger.active.focus,
.open > .dropdown-toggle.notification_widget.danger.focus {
  color: #fff;
  background-color: #ac2925;
  border-color: #761c19;
}
.notification_widget.danger:active,
.notification_widget.danger.active,
.open > .dropdown-toggle.notification_widget.danger {
  background-image: none;
}
.notification_widget.danger.disabled:hover,
.notification_widget.danger[disabled]:hover,
fieldset[disabled] .notification_widget.danger:hover,
.notification_widget.danger.disabled:focus,
.notification_widget.danger[disabled]:focus,
fieldset[disabled] .notification_widget.danger:focus,
.notification_widget.danger.disabled.focus,
.notification_widget.danger[disabled].focus,
fieldset[disabled] .notification_widget.danger.focus {
  background-color: #d9534f;
  border-color: #d43f3a;
}
.notification_widget.danger .badge {
  color: #d9534f;
  background-color: #fff;
}
div#pager {
  background-color: #fff;
  font-size: 14px;
  line-height: 20px;
  overflow: hidden;
  display: none;
  position: fixed;
  bottom: 0px;
  width: 100%;
  max-height: 50%;
  padding-top: 8px;
  -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  /* Display over codemirror */
  z-index: 100;
  /* Hack which prevents jquery ui resizable from changing top. */
  top: auto !important;
}
div#pager pre {
  line-height: 1.21429em;
  color: #000;
  background-color: #f7f7f7;
  padding: 0.4em;
}
div#pager #pager-button-area {
  position: absolute;
  top: 8px;
  right: 20px;
}
div#pager #pager-contents {
  position: relative;
  overflow: auto;
  width: 100%;
  height: 100%;
}
div#pager #pager-contents #pager-container {
  position: relative;
  padding: 15px 0px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
}
div#pager .ui-resizable-handle {
  top: 0px;
  height: 8px;
  background: #f7f7f7;
  border-top: 1px solid #cfcfcf;
  border-bottom: 1px solid #cfcfcf;
  /* This injects handle bars (a short, wide = symbol) for 
        the resize handle. */
}
div#pager .ui-resizable-handle::after {
  content: '';
  top: 2px;
  left: 50%;
  height: 3px;
  width: 30px;
  margin-left: -15px;
  position: absolute;
  border-top: 1px solid #cfcfcf;
}
.quickhelp {
  /* Old browsers */
  display: -webkit-box;
  -webkit-box-orient: horizontal;
  -webkit-box-align: stretch;
  display: -moz-box;
  -moz-box-orient: horizontal;
  -moz-box-align: stretch;
  display: box;
  box-orient: horizontal;
  box-align: stretch;
  /* Modern browsers */
  display: flex;
  flex-direction: row;
  align-items: stretch;
  line-height: 1.8em;
}
.shortcut_key {
  display: inline-block;
  width: 20ex;
  text-align: right;
  font-family: monospace;
}
.shortcut_descr {
  display: inline-block;
  /* Old browsers */
  -webkit-box-flex: 1;
  -moz-box-flex: 1;
  box-flex: 1;
  /* Modern browsers */
  flex: 1;
}
span.save_widget {
  margin-top: 6px;
}
span.save_widget span.filename {
  height: 1em;
  line-height: 1em;
  padding: 3px;
  margin-left: 16px;
  border: none;
  font-size: 146.5%;
  border-radius: 2px;
}
span.save_widget span.filename:hover {
  background-color: #e6e6e6;
}
span.checkpoint_status,
span.autosave_status {
  font-size: small;
}
@media (max-width: 767px) {
  span.save_widget {
    font-size: small;
  }
  span.checkpoint_status,
  span.autosave_status {
    display: none;
  }
}
@media (min-width: 768px) and (max-width: 991px) {
  span.checkpoint_status {
    display: none;
  }
  span.autosave_status {
    font-size: x-small;
  }
}
.toolbar {
  padding: 0px;
  margin-left: -5px;
  margin-top: 2px;
  margin-bottom: 5px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
}
.toolbar select,
.toolbar label {
  width: auto;
  vertical-align: middle;
  margin-right: 2px;
  margin-bottom: 0px;
  display: inline;
  font-size: 92%;
  margin-left: 0.3em;
  margin-right: 0.3em;
  padding: 0px;
  padding-top: 3px;
}
.toolbar .btn {
  padding: 2px 8px;
}
.toolbar .btn-group {
  margin-top: 0px;
  margin-left: 5px;
}
#maintoolbar {
  margin-bottom: -3px;
  margin-top: -8px;
  border: 0px;
  min-height: 27px;
  margin-left: 0px;
  padding-top: 11px;
  padding-bottom: 3px;
}
#maintoolbar .navbar-text {
  float: none;
  vertical-align: middle;
  text-align: right;
  margin-left: 5px;
  margin-right: 0px;
  margin-top: 0px;
}
.select-xs {
  height: 24px;
}
.pulse,
.dropdown-menu > li > a.pulse,
li.pulse > a.dropdown-toggle,
li.pulse.open > a.dropdown-toggle {
  background-color: #F37626;
  color: white;
}
/**
 * Primary styles
 *
 * Author: Jupyter Development Team
 */
/** WARNING IF YOU ARE EDITTING THIS FILE, if this is a .css file, It has a lot
 * of chance of beeing generated from the ../less/[samename].less file, you can
 * try to get back the less file by reverting somme commit in history
 **/
/*
 * We'll try to get something pretty, so we
 * have some strange css to have the scroll bar on
 * the left with fix button on the top right of the tooltip
 */
@-moz-keyframes fadeOut {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
  }
}
@-webkit-keyframes fadeOut {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
  }
}
@-moz-keyframes fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
@-webkit-keyframes fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
/*properties of tooltip after "expand"*/
.bigtooltip {
  overflow: auto;
  height: 200px;
  -webkit-transition-property: height;
  -webkit-transition-duration: 500ms;
  -moz-transition-property: height;
  -moz-transition-duration: 500ms;
  transition-property: height;
  transition-duration: 500ms;
}
/*properties of tooltip before "expand"*/
.smalltooltip {
  -webkit-transition-property: height;
  -webkit-transition-duration: 500ms;
  -moz-transition-property: height;
  -moz-transition-duration: 500ms;
  transition-property: height;
  transition-duration: 500ms;
  text-overflow: ellipsis;
  overflow: hidden;
  height: 80px;
}
.tooltipbuttons {
  position: absolute;
  padding-right: 15px;
  top: 0px;
  right: 0px;
}
.tooltiptext {
  /*avoid the button to overlap on some docstring*/
  padding-right: 30px;
}
.ipython_tooltip {
  max-width: 700px;
  /*fade-in animation when inserted*/
  -webkit-animation: fadeOut 400ms;
  -moz-animation: fadeOut 400ms;
  animation: fadeOut 400ms;
  -webkit-animation: fadeIn 400ms;
  -moz-animation: fadeIn 400ms;
  animation: fadeIn 400ms;
  vertical-align: middle;
  background-color: #f7f7f7;
  overflow: visible;
  border: #ababab 1px solid;
  outline: none;
  padding: 3px;
  margin: 0px;
  padding-left: 7px;
  font-family: monospace;
  min-height: 50px;
  -moz-box-shadow: 0px 6px 10px -1px #adadad;
  -webkit-box-shadow: 0px 6px 10px -1px #adadad;
  box-shadow: 0px 6px 10px -1px #adadad;
  border-radius: 2px;
  position: absolute;
  z-index: 1000;
}
.ipython_tooltip a {
  float: right;
}
.ipython_tooltip .tooltiptext pre {
  border: 0;
  border-radius: 0;
  font-size: 100%;
  background-color: #f7f7f7;
}
.pretooltiparrow {
  left: 0px;
  margin: 0px;
  top: -16px;
  width: 40px;
  height: 16px;
  overflow: hidden;
  position: absolute;
}
.pretooltiparrow:before {
  background-color: #f7f7f7;
  border: 1px #ababab solid;
  z-index: 11;
  content: "";
  position: absolute;
  left: 15px;
  top: 10px;
  width: 25px;
  height: 25px;
  -webkit-transform: rotate(45deg);
  -moz-transform: rotate(45deg);
  -ms-transform: rotate(45deg);
  -o-transform: rotate(45deg);
}
ul.typeahead-list i {
  margin-left: -10px;
  width: 18px;
}
ul.typeahead-list {
  max-height: 80vh;
  overflow: auto;
}
ul.typeahead-list > li > a {
  /** Firefox bug **/
  /* see https://github.com/jupyter/notebook/issues/559 */
  white-space: normal;
}
.cmd-palette .modal-body {
  padding: 7px;
}
.cmd-palette form {
  background: white;
}
.cmd-palette input {
  outline: none;
}
.no-shortcut {
  display: none;
}
.command-shortcut:before {
  content: "(command)";
  padding-right: 3px;
  color: #777777;
}
.edit-shortcut:before {
  content: "(edit)";
  padding-right: 3px;
  color: #777777;
}
#find-and-replace #replace-preview .match,
#find-and-replace #replace-preview .insert {
  background-color: #BBDEFB;
  border-color: #90CAF9;
  border-style: solid;
  border-width: 1px;
  border-radius: 0px;
}
#find-and-replace #replace-preview .replace .match {
  background-color: #FFCDD2;
  border-color: #EF9A9A;
  border-radius: 0px;
}
#find-and-replace #replace-preview .replace .insert {
  background-color: #C8E6C9;
  border-color: #A5D6A7;
  border-radius: 0px;
}
#find-and-replace #replace-preview {
  max-height: 60vh;
  overflow: auto;
}
#find-and-replace #replace-preview pre {
  padding: 5px 10px;
}
.terminal-app {
  background: #EEE;
}
.terminal-app #header {
  background: #fff;
  -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
  box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.2);
}
.terminal-app .terminal {
  float: left;
  font-family: monospace;
  color: white;
  background: black;
  padding: 0.4em;
  border-radius: 2px;
  -webkit-box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.4);
  box-shadow: 0px 0px 12px 1px rgba(87, 87, 87, 0.4);
}
.terminal-app .terminal,
.terminal-app .terminal dummy-screen {
  line-height: 1em;
  font-size: 14px;
}
.terminal-app .terminal-cursor {
  color: black;
  background: white;
}
.terminal-app #terminado-container {
  margin-top: 20px;
}
/*# sourceMappingURL=style.min.css.map */
    </style>
<style type="text/css">
    .highlight .hll { background-color: #ffffcc }
.highlight  { background: #f8f8f8; }
.highlight .c { color: #408080; font-style: italic } /* Comment */
.highlight .err { border: 1px solid #FF0000 } /* Error */
.highlight .k { color: #008000; font-weight: bold } /* Keyword */
.highlight .o { color: #666666 } /* Operator */
.highlight .ch { color: #408080; font-style: italic } /* Comment.Hashbang */
.highlight .cm { color: #408080; font-style: italic } /* Comment.Multiline */
.highlight .cp { color: #BC7A00 } /* Comment.Preproc */
.highlight .cpf { color: #408080; font-style: italic } /* Comment.PreprocFile */
.highlight .c1 { color: #408080; font-style: italic } /* Comment.Single */
.highlight .cs { color: #408080; font-style: italic } /* Comment.Special */
.highlight .gd { color: #A00000 } /* Generic.Deleted */
.highlight .ge { font-style: italic } /* Generic.Emph */
.highlight .gr { color: #FF0000 } /* Generic.Error */
.highlight .gh { color: #000080; font-weight: bold } /* Generic.Heading */
.highlight .gi { color: #00A000 } /* Generic.Inserted */
.highlight .go { color: #888888 } /* Generic.Output */
.highlight .gp { color: #000080; font-weight: bold } /* Generic.Prompt */
.highlight .gs { font-weight: bold } /* Generic.Strong */
.highlight .gu { color: #800080; font-weight: bold } /* Generic.Subheading */
.highlight .gt { color: #0044DD } /* Generic.Traceback */
.highlight .kc { color: #008000; font-weight: bold } /* Keyword.Constant */
.highlight .kd { color: #008000; font-weight: bold } /* Keyword.Declaration */
.highlight .kn { color: #008000; font-weight: bold } /* Keyword.Namespace */
.highlight .kp { color: #008000 } /* Keyword.Pseudo */
.highlight .kr { color: #008000; font-weight: bold } /* Keyword.Reserved */
.highlight .kt { color: #B00040 } /* Keyword.Type */
.highlight .m { color: #666666 } /* Literal.Number */
.highlight .s { color: #BA2121 } /* Literal.String */
.highlight .na { color: #7D9029 } /* Name.Attribute */
.highlight .nb { color: #008000 } /* Name.Builtin */
.highlight .nc { color: #0000FF; font-weight: bold } /* Name.Class */
.highlight .no { color: #880000 } /* Name.Constant */
.highlight .nd { color: #AA22FF } /* Name.Decorator */
.highlight .ni { color: #999999; font-weight: bold } /* Name.Entity */
.highlight .ne { color: #D2413A; font-weight: bold } /* Name.Exception */
.highlight .nf { color: #0000FF } /* Name.Function */
.highlight .nl { color: #A0A000 } /* Name.Label */
.highlight .nn { color: #0000FF; font-weight: bold } /* Name.Namespace */
.highlight .nt { color: #008000; font-weight: bold } /* Name.Tag */
.highlight .nv { color: #19177C } /* Name.Variable */
.highlight .ow { color: #AA22FF; font-weight: bold } /* Operator.Word */
.highlight .w { color: #bbbbbb } /* Text.Whitespace */
.highlight .mb { color: #666666 } /* Literal.Number.Bin */
.highlight .mf { color: #666666 } /* Literal.Number.Float */
.highlight .mh { color: #666666 } /* Literal.Number.Hex */
.highlight .mi { color: #666666 } /* Literal.Number.Integer */
.highlight .mo { color: #666666 } /* Literal.Number.Oct */
.highlight .sb { color: #BA2121 } /* Literal.String.Backtick */
.highlight .sc { color: #BA2121 } /* Literal.String.Char */
.highlight .sd { color: #BA2121; font-style: italic } /* Literal.String.Doc */
.highlight .s2 { color: #BA2121 } /* Literal.String.Double */
.highlight .se { color: #BB6622; font-weight: bold } /* Literal.String.Escape */
.highlight .sh { color: #BA2121 } /* Literal.String.Heredoc */
.highlight .si { color: #BB6688; font-weight: bold } /* Literal.String.Interpol */
.highlight .sx { color: #008000 } /* Literal.String.Other */
.highlight .sr { color: #BB6688 } /* Literal.String.Regex */
.highlight .s1 { color: #BA2121 } /* Literal.String.Single */
.highlight .ss { color: #19177C } /* Literal.String.Symbol */
.highlight .bp { color: #008000 } /* Name.Builtin.Pseudo */
.highlight .vc { color: #19177C } /* Name.Variable.Class */
.highlight .vg { color: #19177C } /* Name.Variable.Global */
.highlight .vi { color: #19177C } /* Name.Variable.Instance */
.highlight .il { color: #666666 } /* Literal.Number.Integer.Long */
    </style>
<style type="text/css">
    
/* Temporary definitions which will become obsolete with Notebook release 5.0 */
.ansi-black-fg { color: #3E424D; }
.ansi-black-bg { background-color: #3E424D; }
.ansi-black-intense-fg { color: #282C36; }
.ansi-black-intense-bg { background-color: #282C36; }
.ansi-red-fg { color: #E75C58; }
.ansi-red-bg { background-color: #E75C58; }
.ansi-red-intense-fg { color: #B22B31; }
.ansi-red-intense-bg { background-color: #B22B31; }
.ansi-green-fg { color: #00A250; }
.ansi-green-bg { background-color: #00A250; }
.ansi-green-intense-fg { color: #007427; }
.ansi-green-intense-bg { background-color: #007427; }
.ansi-yellow-fg { color: #DDB62B; }
.ansi-yellow-bg { background-color: #DDB62B; }
.ansi-yellow-intense-fg { color: #B27D12; }
.ansi-yellow-intense-bg { background-color: #B27D12; }
.ansi-blue-fg { color: #208FFB; }
.ansi-blue-bg { background-color: #208FFB; }
.ansi-blue-intense-fg { color: #0065CA; }
.ansi-blue-intense-bg { background-color: #0065CA; }
.ansi-magenta-fg { color: #D160C4; }
.ansi-magenta-bg { background-color: #D160C4; }
.ansi-magenta-intense-fg { color: #A03196; }
.ansi-magenta-intense-bg { background-color: #A03196; }
.ansi-cyan-fg { color: #60C6C8; }
.ansi-cyan-bg { background-color: #60C6C8; }
.ansi-cyan-intense-fg { color: #258F8F; }
.ansi-cyan-intense-bg { background-color: #258F8F; }
.ansi-white-fg { color: #C5C1B4; }
.ansi-white-bg { background-color: #C5C1B4; }
.ansi-white-intense-fg { color: #A1A6B2; }
.ansi-white-intense-bg { background-color: #A1A6B2; }

.ansi-bold { font-weight: bold; }

    </style>


<style type="text/css">
/* Overrides of notebook CSS for static HTML export */
body {
  overflow: visible;
  padding: 8px;
}

div#notebook {
  overflow: visible;
  border-top: none;
}

@media print {
  div.cell {
    display: block;
    page-break-inside: avoid;
  } 
  div.output_wrapper { 
    display: block;
    page-break-inside: avoid; 
  }
  div.output { 
    display: block;
    page-break-inside: avoid; 
  }
}
</style>

<!-- Custom stylesheet, it must be in the same directory as the html file -->
<link rel="stylesheet" href="custom.css">

<!-- Loading mathjax macro -->
<!-- Load mathjax -->
    <script src="https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS_HTML"></script>
    <!-- MathJax configuration -->
    <script type="text/x-mathjax-config">
    MathJax.Hub.Config({
        tex2jax: {
            inlineMath: [ ['$','$'], ["\\(","\\)"] ],
            displayMath: [ ['$$','$$'], ["\\[","\\]"] ],
            processEscapes: true,
            processEnvironments: true
        },
        // Center justify equations in code and markdown cells. Elsewhere
        // we use CSS to left justify single line equations in code cells.
        displayAlign: 'center',
        "HTML-CSS": {
            styles: {'.MathJax_Display': {"margin": 0}},
            linebreaks: { automatic: true }
        }
    });
    </script>
    <!-- End of mathjax configuration --></head>
<body>
  <div tabindex="-1" id="notebook" class="border-box-sizing">
    <div class="container" id="notebook-container">

<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[1]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="c1"># Some commands for better formatting in the website, no need to look at this</span>
<span class="kn">from</span> <span class="nn">IPython.display</span> <span class="k">import</span> <span class="n">Image</span>
<span class="kn">from</span> <span class="nn">IPython.core.display</span> <span class="k">import</span> <span class="n">display</span><span class="p">,</span> <span class="n">HTML</span>
<span class="n">display</span><span class="p">(</span><span class="n">HTML</span><span class="p">(</span><span class="s2">&quot;&lt;style&gt;.container { width:100% !important; }&lt;/style&gt;&quot;</span><span class="p">))</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt"></div>

<div class="output_html rendered_html output_subarea ">
<style>.container { width:100% !important; }</style>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h1 id="Turn-blocks-into-diamods">Turn blocks into diamods<a class="anchor-link" href="#Turn-blocks-into-diamods">&#182;</a></h1><p>After completing the <strong>Hello world!</strong> example which introduces the very basics, we're going to look at a more advanced example which will turn existing blocks in the world into Diamond blocks.</p>
<p>To connect and interact with Minecraft we will use the <strong>mcpi</strong> library, so make use the <code>mcpi</code> folder you downloaded from RaspberryJam Mod's website is present in the same directory as this notebook. As an example, let's say you have the following folders:</p>
<ul>
<li>Desktop<ul>
<li>My Scripts<ul>
<li>mcpi</li>
<li>Diamonds.ipynb  &lt;---- this notebook!</li>
</ul>
</li>
</ul>
</li>
</ul>
<p>Let's start coding!</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="1.-Get-Minecraft-ready">1. Get Minecraft ready<a class="anchor-link" href="#1.-Get-Minecraft-ready">&#182;</a></h3><p>It is a good idea to tell Minecraft not to go into Settings Menu when you switch to another window, for example this browser, using maybe <code>alt+tab</code>. To do so, go to your Minecraft installation folder and edit the <code>options.txt</code> file.
Find the <code>pauseOnLostFocus</code> value and replace <code>true</code> by <code>false</code>. Now your Minecraft game won't go into Settings Menu when you are writing your code here, and you can see everything in real time!</p>
<p>Now open your Minecraft game with RaspberryJam and PythonTool mods loaded, and load your favourite world, both creative or survival modes work great!</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="2.-Load-the-required-libraries">2. Load the required libraries<a class="anchor-link" href="#2.-Load-the-required-libraries">&#182;</a></h3><p>We have to tell Python which libraries we're going to use, so that it can <strong>import</strong> them.</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[2]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="kn">import</span> <span class="nn">mcpi.minecraft</span> <span class="k">as</span> <span class="nn">minecraft</span>
<span class="kn">import</span> <span class="nn">mcpi.block</span> <span class="k">as</span> <span class="nn">block</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>If executing the previous cell gives you errors, it means that the <code>mcpi</code> folder is not in the same directory as this notebook, so Python cannot find it! Make sure you've placed it there.</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="3.-Establish-a-connection-to-your-loaded-Minecraft-world">3. Establish a connection to your loaded Minecraft world<a class="anchor-link" href="#3.-Establish-a-connection-to-your-loaded-Minecraft-world">&#182;</a></h3><p>Now that your world is up and running, and you have the <code>mcpi</code> library loaded in Python, we can make a connection to your game!</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[3]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">mc</span> <span class="o">=</span> <span class="n">minecraft</span><span class="o">.</span><span class="n">Minecraft</span><span class="o">.</span><span class="n">create</span><span class="p">()</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>When you execute the previous cell, it should connect without any complains or output. If an error is thrown, check that your Minecraft game has RaspberryJam and PythonTool mods loaded, and that you have opened a world.</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="4.-Find-your-player's-position-in-the-world">4. Find your player's position in the world<a class="anchor-link" href="#4.-Find-your-player's-position-in-the-world">&#182;</a></h3><p>We will obtain the player's coordinates:</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[4]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">position</span> <span class="o">=</span> <span class="n">mc</span><span class="o">.</span><span class="n">player</span><span class="o">.</span><span class="n">getPos</span><span class="p">()</span>
<span class="nb">print</span><span class="p">(</span><span class="n">position</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt"></div>
<div class="output_subarea output_stream output_stdout output_text">
<pre>Vec3(-21.626334681672915,8.50494823586493,41.76705753706466)
</pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>So my player is standing at position</p>
<ul>
<li>x = -21.521329516654646</li>
<li>y = 6.0</li>
<li>z = 41.48384559579614</li>
</ul>
<p>Your coordinates will vary, as your player is standing in a different place in a completely different world!</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>The coordinates of the block just underneath the player will have the same coordinates, but the <strong>height</strong> coordinate will be one unit smaller. The coordinate in charge of <strong>height</strong> is the number in the middle, coordinate <strong>y</strong>.</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[5]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">=</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span>
<span class="nb">print</span><span class="p">(</span><span class="n">position</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt"></div>
<div class="output_subarea output_stream output_stdout output_text">
<pre>Vec3(-21.626334681672915,7.50494823586493,41.76705753706466)
</pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="5.-Turn-the-block-you're-stading-on-into-a-Diamond-block">5. Turn the block you're stading on into a Diamond block<a class="anchor-link" href="#5.-Turn-the-block-you're-stading-on-into-a-Diamond-block">&#182;</a></h3><p>Remember that we have that block's coordinates stored in <code>position</code>. So we tell Python to turn the block placed at <code>position</code> into a nice Diamond block! We can also tell it to write something to the chat window to confirm the changes:</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[6]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">postToChat</span><span class="p">(</span><span class="s2">&quot;Look down! A shiny new Diamond appeared&quot;</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>A Diamond block should have appeared under your player. If you have moved the player <strong>after</strong> getting its position, the Diamond block has been placed at those old coordinates, so have a look around!</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[7]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">Image</span><span class="p">(</span><span class="s2">&quot;images/grass.png&quot;</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt output_prompt">Out[7]:</div>


<div class="output_png output_subarea output_execute_result">
<img src="data:image/png;base64,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
Mx0xM/O1AUm2HYAuwnxfPqsAE2SBnE+Yuf25K1W54F/0F7K6BfrcwVW0AAABnWlUWHRYTUw6Y29t
LmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0
az0iWE1QIENvcmUgNS40LjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMu
b3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJk
ZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczpleGlmPSJodHRwOi8vbnMuYWRvYmUuY29tL2V4
aWYvMS4wLyI+CiAgICAgICAgIDxleGlmOlBpeGVsWERpbWVuc2lvbj45NjY8L2V4aWY6UGl4ZWxY
RGltZW5zaW9uPgogICAgICAgICA8ZXhpZjpQaXhlbFlEaW1lbnNpb24+NjE0PC9leGlmOlBpeGVs
WURpbWVuc2lvbj4KICAgICAgPC9yZGY6RGVzY3JpcHRpb24+CiAgIDwvcmRmOlJERj4KPC94Onht
cG1ldGE+CngtFjsAAEAASURBVHgB7N15mCRpXej7tyozK2vfuruql+mehZlmBoYRGECQXY8DMngv
F4WLIuq9wjnHcxCP6OGKD54/jgvi4xW35+q9cB7F48IV0asCHkAPoIJHGBgYlhl6gOme3rtr37Jy
v/HL6rcmKioiMuKXS2VEfuOZmoh49/cT2VXxy4jINIYFAQQQQAABBBBAAAEEEEAAAQQQQAABBBBA
AAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQAAB
BBBAAAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQCD9AgPpn2LXZ4hp18npEAEEEEAAAQQQQACBvhOo
992MOzhhgrhgXGyCbchBAAEEEEAAAQQQQACBZAoQUPsct34O/vp57j4vBZIQQAABBBBAAAEEEEAA
AdOXgXO/BIf9Mk/+HSOAAAIIIIAAAggggAAC7RZIfbCc1oAxrfNq9wuc9hBAAAEEEEAAAQQQQACB
uAKpC5TTFECmaS5xX5iURwABBBBAAAEEEEAAAQQOQiAVQXLSg8kkjD8JYzyIf0D0iQACCCCAAAII
IIAAAtEFkhCAJmGMvuJJDdoOYtwH0afvQSMRAQQQQAABBBBAAAEEEIgocBDB6kH0GZHDv1iSgr1u
jLUbffgfCVIRQAABBBBAAAEEEEAAge4KdCOA7UYfLaslIRDs1Bg71W7LB4UGEEAAAQQQQAABBBBA
AIEDEuhUINupdtvC1MvBYSfG1ok27YHoZNu2D9YIIIAAAggggAACCCCAgFugkwFnJ9ruRJtuD9V2
rwZz7RpXr7WjOkhUQgABBBBAAAEEEEAAAQRaEGhXMNpr7bRAsrdquwLHva3q99oxnlbaaKWudtYH
0ad2rNRDAAEEEEAAAQQQQACBzgi0K+iMM7pW+mylrh1jO9qwbbW07qWgrNWxaOpr6rjBW63vbott
BBBAAAEEEEAAAQQQQKAVgVYDTU19TR33HFut725Lvd0LgV2rY4hTP05ZQY1bXn0gPBUPql/PMNhF
AAEEEEAAAQQQQACBDggcVDAYt9845eOU9SNttb5fm5HTDjoAa6X/qHXbXc6LG7V9bz32EUAAAQQQ
QAABBBBAAIF2CWgDy6j12l3Ob95R+/Cr21LaQQZ12r6j1GtXGcGN0lacg9Du9uL0TVkEEEAAAQQQ
QAABBBBIhkC7g8So7UUp164yfkciStt+9VpKO6ggTdNvlDrNyrSa78Zu1pa7LNsIIIAAAggggAAC
CCCAQDcE4gSWzcq2mi/zbdaGn4mmjl87kdO6Hdxp+2tWLyxfm2cRw+rbMu513PLuumwjgAACCCCA
AAIIIIAAAlEE4gaPUcqHldHmyVzC6obNVVsvrE3fvG4GcZq+mtUJyw/KC0oXoLC8KPm+yDcSm7Ud
Vpc8BBBAAAEEEEAAAQQQ6E+BVoLDZnXD8oPygtLl6ITlRcn3O8LN2vSrEzutW8Gapp+wOnHzgsoH
pQtkWF6U/DgHo1lfcdqiLAIIIIAAAggggAACCCRLoJ3BX7O2wvKD8vzS/dKsujbP1veuw9rzllXt
dyMgi9tHs/JB+X7pUdMEz69sWLobPKiuu4x2u5Nta8dEPQQQQAABBBBAAAEEEIgn0MngLkrbQWXi
pPuV9UsTmaB0q9Ys35az67jlbb1I604HXXHbDysflOeXHiXNr4ygxU230EH1bH47193sq53jpi0E
EEAAAQQQQAABBPpBoKNBnAewWV9B+VHT/cpFTZOh+pW1UwjLs2Xc67jl3XVDtzsdYMVpP6ysX16U
NG8Zu2/XbpyoaVLHr6y7LbsdtZwtzxoBBBBAAAEEEEAAAQQQCBKIGhgGlfNLD0vz5jXbl3F7ywSl
2Tn6lbd53nWcst66ofudDNzitB1W1i/Pmxa2L3n2Z9DZlh9b3q7dSFHTpI5fWXdbdjtqOVueNQII
IIAAAggggAACCCBgBaIGhEHl/NLD0iSvduNHtu1P0Hi8bXn3pZ5fWlB7Nt1vHdaOX/lIaZ0K2OK0
G1TWL92bFmVfAuGc85N3foZubGectdR113dvO1mNJWpaWHmbF7b26yesPHkIIIAAAggggAACCCCQ
HgFtsBdWzy+vWZrky0/V+Sk7PyXnp3hjWwJlb/24+04T+9qQNFm8be2k+v8/Tln/FjypnQjI4rQZ
VNYv3ZsWtm/zJCjOj4yMTHzkIx/5wdOnT790amrq6YODg/MeB3YRQAABBBBAAAEEEEAAAQQcgVqt
dnV1dfWLZ86c+cQrXvGKPykUCutOsgTIEhzL4g5M3dvePL/9oLSwdMnzLt5+vfmx9m0AGatSk8JR
2wwq55fuTXPvB203rhQ7QfH0Zz/72Z+9+eabf7xarRr5qdfbatiEg2wEEEAAAQQQQAABBBBAIDkC
AwMDJpPJNH7OnTv3u895znN+xQmOV5wZyFVkGxzLhNyBVdC2t5zsy+Iuv5Oy8/+gdHcZ2Y5azlvP
d1+Cx3Yu7iA1rN2gct502Xenuffd29KXLWfTZW7DzpXiHzh58uSPF4tFU6lUCIpFigUBBBBAAAEE
EEAAAQQQCBCQC4kSO0kMJbGUxFRO0WHnR2IsG29JbRuD2W277y7jzZN9WWzZnb0n/h+U/kSJna2o
5bz1fPezvqm6xKgDCyrnTQ/bd+f5bUuaHLT8bbfd9tJSSW6NZ0EAAQQQQAABBBBAAAEEEIgjILGU
xFROnT9xfgrOj33WWGIuuWpr4zF7BdemO1mNPJseZV/KyOJuYyfF//9Ry/nXdqW2MzB2NRu4adG8
BbzpYfvuPLtt19KubMuPBMY551bqpzv3yDubLAgggAACCCCAAAIIIIAAAnEFJKZy6sgHGtsrxtKE
NyiWGMwGwUHbUs+d57cvabJ4y+2kduj/7QqMZdDaxVs3bN/m2bX0abft2qbJQcs6QfF8lGeK61cW
TO1T/2yqn37Q1M58S9owg6dvM5nnP8MMvvh5ZuDo4UZa1P/VCpdN7drHTPn6P5rq2lcb1TKTTzW5
Iy80g3P3mcGRY1GbapS7VLpkPrzyYfOJlU+YhwoPNdLuGbnHvHT6peb+6fvN8aHjsdqjMAIIINBP
AmXnVrBcXr6cgAUBBBBAAAEE4gpITOXUkdjRBsZBQbGNyWy+X6As3Us5m+e3L2lRF29bUevtKWcH
vicx5k7UNvzKedPC9m2eXcsw7bbfWs6Ajly6dOmRZvOpP/R1U/7jvzAz3/qWGRsfNQNjOydP9c2i
2dzYMsu33WZyr3+1Gbjnyc2aauRXV79oyt96j5msPeC0N2YGh+Vbopx7DrZLTnubZm3wWSZ325tM
ZkreeGm+fH7z8+Z3Lv+O+WjuK8aMTjp394/uVNreMmZrzbysfLd587E3m3vH7m3eGCUQQACBVAiU
zfmHvmgWRm8xz7j9yL4Z1dbPm89/5Yo5cfe95mj5S+bN73iP+c5/+4vm+++Z3Vf24BJq5vzn/pv5
4O9/yEz/wDvMj74wxhuctXXz9c9/xRSPPsXcc3Iq0hSufONBc37rsHn6PScbb/k/UalmLn3t0+Yz
X/ymKQ3Nmbu//YVOmxNPZO/bcuwf/B/mXx4+75Q/4pR/TuQx7GuKBAQQQACBxAgcP378Tmew150f
+XRqG9QGrWVe3jx3mmzLYsvs7O3f9ytjy3rX3ra8+aH77bpiHNqJk2kD17By3jJ2366lrt22a780
ydv9aXYbtVwprjpB8bHLF032uJxcOZ43SAcmR8345JgZdvIuO2Uyh3+s6ZVjuVJccYLiufyXTXbS
aa9Wt82ZgZERMz42aobXvmyuOWXqp3+u6ZVjuVLcCIrHHzNm8qadsdlDLkHy2KT56JqT5wTOv3DT
L3DlWF4RLAgg0AcCFfPY3/++ef+jzzY/9+4fMcfl5i7XcuYf3md+/8OXzKt+5i5zdO6Iue+eZ5uT
R0bk6ydcpQ52s3z9AfNOJyh+/vf/qHnBXZONsV365G+aP6i82vzcvzoZODgJ+v/yt99lPnHJmDte
9TPm7hNhQaw0UzRf/tv3mf/7w87dRse/3/zq3SdMZrf1mvnmJ99r3v3nD5k7nn+fuWnhQ+b33vkh
c/9bfsl8z2m/gLtmvvbX7zL/18cumWffd78Zeuwvze/997809/+UU/5JfuV3O2IDAQQQQCD5Arsx
1o2pSFQiad61ZDdLkzKy2Po7e/7/j1LGv2aM1FYDYxmkdgmra/PsWvqw21HWu2Wa3UYtt0/LleK9
QbEcR2epO80M1E12ZrJRZsUpO/jaV+7kBfxfbp+WK8U2KHaq77wspLzTXN0JlLOTk2by6gNmwyk7
cOqHA1raSZbbpxtXim1QLOd0N4bXEJGbGSZnzEeLXzHPdcq+8cgbQ9sjEwEEEEiHQN1khp03Huuf
NZ8780rzPz3FdSW4fN585kMXG78qM4NOGefRle99087v2mZ/E7ppUy8VnPHfYV70wnvNced3uYyt
8W2CjbX9Re8ZUfmq+cOf/RXzuROnnQpnzHBmsFHPU8q1WzZffP9bzXv/6YS57/5nmY89mjGD0v6N
ErWlL5lf/8CXzAt+6OfM654rV6zvM7d98KfNe3/zI+YZv/U6My9/Y9xL8YL5+Ecvmpf8m/9svu9p
Yv4ic9P/8zbz/g89ZF76lhcYblZ3Y7GNAAIIpE5gN8ZqMjP5MyNl3Wup4pcm6e7FlnGnRd1upW7j
PvGoHWnLyQC9izfNve/etvVsWpS1lNn9aXYSVP/nLzVun24cNzl0jbMS2+2NY+lEt3KL9bJTtv6a
+22m77q6+GkzNjHWuFLcCIo9geyAnPw4wbHcYr3qlB08+Qbfdmzip9Y+ZYwTmDdeVtKW/NhFhieL
nLg4V48/tfwp82POVW0WBBBAIP0CTwR3H/v4l8x33fUSc+MhE7P08IPmczcAshIEli6a97/1feb2
d7zVPMuJ9L74F79rHpm814x97f1OoCgF7zE/8rYfMM86Od6otXTm0+aPfvv9ppFlnm1+7O2vNk8/
vpNX2zhrPvan/6eRi6+yPPv+HzOvfvnTzbjztY7S7kOjTzFDD/6V+fSl4+anf+3t5tS2U/6v/tR8
+HPO5V1nuee+HzE/8L3O4zSXPm1+5p3vb6T98lvebO553VvNM86/37zv01LuXebN/58xr3/Hr5nn
zntCzeqWGXr+68y7Xvcc87X3vNV8PCyIbrReMstrzzb/7hd/2Dx5+9PmYx8u7wTgjTznZqOvf9bZ
us+8/NuP3Qiwh8y3vfwnzPFP/LZ59PKrzNxxT//1QXPLs+8zT79j5kb5EXP70+4x5hNlU3HGMnSj
XVYIIIAAAqkU2I2xXLO7ETDtCYKlnF+6q9pukCxptrzN9+77lbFl27Zu9Ypxs4HIpLyLN82977dt
08LWfnmSNtDstjn5oK2B2+d2Dl3j+Dm1bHDsfLF1I8O5cizPHTc+lKvJbXjyQVuDR6Z2WpKXg/zY
xe47zcpzx9WLXzWZJu01Pmjr2K077di23OOzbTrPHUvZZvO1Q2GNAAIIJFugZspbdfPiV7/CfPKD
f26+evl55t55uZ96w3z+bz5qjj3r+Wbsc582Jed3bK1WNlfrF838dtnZzpjCwhnzT//9jPnu//2t
5udfY8yX/ubXzR+864R50m+93Aw7Aet/+q3/1zz/f/1x85onT5kL//wR895f/lnzr3/hN8zdE0vm
L37218wnj7/EvPnnXmKmVh82v/Q77zXL+f9ofuLFc412P/vQGafuvzY/deqImc8Vzb/83q+ZDz36
EvOT/+nfmvGNb5g/+/U/MH8yfdS88TlPM2/5wcvmN//4ovmRn3yVufnwnBl98o+aH87+vnmf+W7z
H597k5mZzu3/nZ47ZV772lPOm6RFU3DmP1qX+bnfMfUe1WHzoh/7ISexZoorpcafNylva5QLW6Z+
bNoMudJMZtQccv7OrK5tmdpRzz3quaPm/h+6v9Feo1vnCvY//tGXzLFXvMQMu9vwDoN9BBBAAIE0
CDTiK2ciN4Kkxto9L4lM3Hlh+1LPlvVu++0HpUl6W5ZWAmOZSKuLuw2/bZvmt26WJvkDza4Yx51A
v7UX14fyCCCAQHcE6qa8aczc7feaH3zaR8z7PvuoeeYr7zLlS18xf+VcdH3TG+41DzqB8c7tyTvv
KtrtsnwD43f/e/PKb7u5MdSXvPK15q8eetAsbb/MVB/6R+c53Feblz33tBmtGnP4O+8zX/j4Q+bC
9U1z+8ZXzCfNcfOWn/hfzJPk8vTcd5j//DOHzaXScKOfRruveIt57Xc8aYfA6fY5/+7d5hnOXqZa
NdXJ0+Z5zzLm78oVU8+OmZM3O2/KmovmyMmbzKFG/Dlnjs6OmeOVI+amY5J349bqndY8/79xxdwJ
YKP+Xao7t5XL0nBobBXNuYceNcef+z+bIWmnkeb8Lztr7r7DmE8+vmRedodzx1Lgsmo+9Xu/5Jh8
t/n5774t8jgCmyMDAQQQQKDXBRrxlTNIu7bjlT8hNjbzptk8v7WUlXr2T5B727YTd61uQxsYeyfu
N2C/Mn5pUtedbrfD1n55kuZOb+yHv5PuVLj9FlPfXDbyQVuNZ4rluDSuFNspOc04/8knVBunbNP2
xu9yPn36bOODthqjkVG4D7XsO4t8QvWAlG285b6T5vf/u/N3m3/Yvr7zadS2Lff4JE1+nHf9pWyz
9vz6IA0BBBBInkBtJxitT5hnvuTl5o9/6+/MxZffYTb++Y9N/e7/zdwxN2r+uRE0yhXVneCx3ri6
OtCod/v48O7vy2JlJ3+wtmEunHGeTb74QfPz/+GDe0gK55fMi+7IOHVnTW5A2tzJnjhxu5HvK6g5
V3Al4Lw9777KWzOXv/Rx867f/9s9bT3tZL3Rd+VGv/WK096NT8OS25Glnea/y3fmH63sTve1Rtsy
VnvFOGdO3n27ufjQRVN84QnTiM2laG3VPHambu55+WzIODbMZ/7Lz5sPnnmW+alffoVxSjpl90yT
HQQQQACB9AnYyMOu3TOUiEfS7Vry7HbYWsrZerLtXvzS/dLcdWQ7Shlvna48Y7yv0xsJMmDvYtPC
1n55kuZOt/vNrxh/+9PM5l//t8anT8sHbe11dJpptDrQ+Nqm+ne+qHHC4h20e39g5nlm07mdWj59
Wp4llmeK3YGxfJ6XGZT2No2UlZOasOWF4y80/7D1B41Pn248SyyFbZVGW86+rJ2vbXrh+KubtifV
WRBAAIHkC+xc4axUqmbo1mebF5u/NX/38Y+b1U8Z870//WSTrS8ZuTAsv2MbP+5t53eoTReHnd/D
Um7EHL/T+QCq+ovNr/775+wGivIdyM6XIJva1W86pRcbz9LaX93F1avOleZhc2xerhrvbdcULzpf
xfS35nlveJv5/mcec36Fl80X/svbzN/bMTUauTG+G7/X5YOxLpV3gmwZW/Ai9Tz9BRdu5OzM80ad
G2Xzk4eNefQhc3H72ebmG48Tl6983XzGyX/DxNANG2/DTlD8Rz9vPvDl55mf/pXXmpvyO2PxlmIf
AQQQQCB1AhJ1uH/kr5fs28Xu27Wk2+2wta0va2lPynZ90V4xbjZQN5At607z23an2TqytumyDtv2
5jXK2xMBd4Pu7frzn20WvvSwGb52pfHp043guBG92t4GTGV5zSzcfLOpOWUbZyLuBjzb9dnvNMur
n3e+kulrjU+fluB4d9RS1gmKK2trZrn+DCNlncjd08Le3ZeNv8z8y9V/MX+39njj06cbwbGtYkXW
ls2/2r7LvGz+ZQEnMXvbZA8BBBBIvoANKKvO771p87wfep5553/9iHMb9PeY159wAjrndmX5fW2D
R/e2k3ojb+eX6U6QLEl1M3XsLlP/6z8xH/38nPnOpx41K9/4lPnV9/6tec3bfsV8x+Fbzd31vzDv
/qO/N2/7vuebieI3zO++873m0ov/jXn3q251Wt3b7o3OTcm5o2dza8WsnPkX84dfrpun3W7H/sT4
7J8C5yKyqX/kAfPNZ8yak7NTJidvrvou0punP6fc8lc/bP6zw/D2/3C/mdu9BLzTgHueOzM35tBd
LzD31n+1Mae3v/b5ZnTrMfNX7/ozU7/jNebOQ1lnClvmsx/4HfPA1PeaN913p/NmQcF84QPvMH/2
gPMGxBufY/Irl8wluU3cjJn5YzO7byb4DplEBBBAAIGkC9jow67D5iN/aqScLHbb/vnZSd35v5Tx
5ts0KeHe3qnhn2bz1OtOBcbeAVmUKOm2rKzd27auNz1oX9IHm96OdsT5ZM3ve4U5/+cfNkcef7zx
6dPyQVuyyO3Tmxtb5vqpU6bmlKk7ZZveKzY0Z2rH32AuXfxDM1v4YuPTp+WDtmSR26flSvFS7emm
duINZsApW29y79l8Zt68ceaNpr70HvP3xUd2bql2PmirsTgnW3Kl+LsKd5o3zr7RSNmm892pyf8R
QACBhAvUTMb5M1qW24Kdn8N3fbt5pnOdc+bl95qJRtqAkW/3de6ebuTLb/WM81dBymacnZ3bqm/c
+5uR39HOFWEnb+L0y8xPvb5u3v1ff8P83Q2hF73uLeY5zgd71Zzni1//9jeZP3vne8yvfvlvGrm3
P/dV5u3fc9qpW9zfrvNBVa98/XeZd//xb5sHPuAUv/27zKtedMx85cYHZskt3rZfp+vGcuj0d5jb
nY/f+u1f+ox55U/9onnpTSM7Gfv+7zMPp8zWxpIxl4zZbhjsrdTo79iOwe5dz87fje9/x5tM7Rff
Y955Y07m7lea/+OHnmvy0obZMsuPXTKPHtto+NSK182DcjnZWf7mvb9hdhRk73bzll/+8d2rzpLC
ggACCCCQOgF5u9bGXrKWxQa1O3t79yVPFinrLme3bX6jkKuc3bdrW9/ud2RtJxS18Sjl/cq40/y2
bZrf2p3m3ZZ9+yNzsNty0OQ8aO6RRx75vGQ0Xa4umsxnHjCDn/2KGfjmuUbx+pOcq8TPudtUv8P5
tJT5Q02bcBeob18xmeVPGLPyP4zZdAJaWcbuNGb6uaY681IzMHx0Jy3i/y+XL5uPbX7M/NPmP5mv
lr7aqPXUoaeaF4y9wNw3dp85lnPOdlgQQAABBNoj4HySdbFcM4POLdR+V23Lzu3ONef6aN4v0zsC
p62y80FemVxu94kYb5GD3y+bwkbRVDM5Mz6y8+bwwY+JESCAAAII9JLAnXfeea8znmvOj/OMkfNn
cCfYtcGtrL0/TtJumt+2TfNbu9O827Ivi+17Z8///1HKNGpKIBlniVLeWyZo350u23bfb+3Nt/vu
su603cD44Ycfdm74YkEAAQQQQAABBBBAAAEEENAK3HXXXc7VQt/A2AbE0rTdtmtvmt33rt0BrN22
aykrS7P9nVJ7/++tszfXtdfuW6ltoOrqYs+mX35Ymg12bSN2364l3W77rps9Y2wbZo0AAggggAAC
CCCAAAIIIBAo4I23vAUlCJUy7sUGpjbdlrHptqzkR0mz5WXtV8edH2u73YGxt3MLEJRu871rKW/T
7Lbs2x9Jk8XuB64JjHeg+D8CCCCAAAIIIIAAAggg0IKAN+bya8oGt1LWvbjTvdtSVtK8a3d92bb5
3vS27Hc6MHYP0ovjzpNtmy9r77bdt3VsmWZr55svrLutyhoBBBBAAAEEEEAAAQQQQCCmgN+HbwU1
4Q7C3LGcDYClnt12l/W2J3XD8r3l1fvtDIzdE/YOyJ1nt71rqWPT7LbfvqRF/jl79qy0tbsQKO9S
sIEAAggggAACCCCAAAII+AoMDLhDsUYRbwzmW88n0Qa2tkH3vndbykiaXUtz7m3Zdy9hee5yTbfb
GRh7O5NBRl3cZd3bUl/24/zYdzIa67944FcijaFccj4yVLGsLRYUtYwZnxpW1ZNKhc2Sqm6ltPsF
HbHqa/vLj3q+RDNir4ePjUUsubfYwqWNvQkx9iYPBX0lSngjGyvyoXyKRXknQ6moe53KCCvOJ+xq
lvlT8qU38Zet9XL8Sk6N0rbz/bNdXuZPTap6vPCo89U4imVsUvepv+vK19vM3I2veFOMNTeUUdQy
ZmNV929jwPmud82yval7vUlf2SifLO0zKO1rNZOVP0/xF62N9HTslqn4HTo1kvK3Uft3SlDUfxs3
dH+Lp5X/HrX/FjeV/xbFRvua0/57zCTk36LYDCp/V3X73+Kq8jxV5qg9V9X+e9T+W9T+Dh+d3Pk6
VZlr3KWsPB9bXdDFDdtbur9xM/O6c+picH/yR9oda8U9ubRBsJBLW3bfvS15YUucsmHt7MvT/XXe
10zkBJmILN61O81uSxlbTtK8i833W9sDFlbf214i9rW/bBIxOQaJAAIIIIAAAgh0SaBaiXtO36WB
tbGbKeUb/20cAk0lUCDk4paNu9yxlk1zr4Nm7VdG0uxit71rm9/RdacCYzuZKIN3l5Vt977Ut2ne
tW3bm+7dt+VYI4AAAggggEAKBUbG9Fd+UsjBlBBAAIFOCXjjLO++7debbvdtvqy9abIfdYlTNmqb
Juqt1GGdh+XJQILy3enubVtH0uyPX5rNc6+97150KvCX8bAggAACCCCAAAIIIIAAAv0i4BdruW+9
kLjMb7HPDLvz7G3Ukib17L57210+KN3Wl7Vtw1svKM9drnGP+J4En52gCfoUDU2y7di1FPZuu/fd
jbnTZdv9Y9txp7m33e2wjQACCCCAAAIIIIAAAgggEF/AHWN5t6U1vzSb7tebLW/zZN8udtuubbp2
3bSdqFeM4wzA3al7O2obUsfWs9vutW3Hnea3bd/RsOVZI4AAAggggAACCCCAAAII6AQk5rIxlmzL
4l1Lmr1ya/MkzS6SZ9NtOZvXbC31bB33drN6kfI7ERj7dWwn711LWUmz6e66QWm2fNS1u022EUAA
AQQQQAABBBBAAIFUCpx+xvzuvC58Y3l3O+5GrWbjzz01vfGXZNqYza7dabLtbUjK+aW5y9oy3rWU
6djSrcDYbwJuPMmXffdPszS/fHd92eYZY1FiQQABBBBAAAEEEiowNRv+lYpL1zbVMxud0H1w28S0
7ms3L59dVY210sInaA+P6L4+s1LRfUXk+vK2ao7ar04sbevGefXxNdU4pdL4lO5rF6tV9+O40bt3
B7vRa3WkpPtqscRasnjXEvTaNPd2o7Dzv6A0my91vYGzzevoutXA2E5aO8iw+t482bdpfts2Tdbu
g6YdG/UQQAABBBDoCQE5eR9XnojLBLQn49qvs+n2ibjMsdsn49KnZtF+r3C3T8Rlbhnl9YVKWReo
zCq/c1VzHKiDAAIqARtvSaxlg1dJk0XW7qDXu90o5Cpn991r24Y7Lc52S/VbDYy9A7Uwku7edpfz
psu+N82Wt3k23+5Lvt325rnTbZ5tjzUCCKRYYPpI+FWFoKnX6/Z3e1AJ//SJGV1/QyMZ/wabpFYr
unFurBabtByc3e2T8W6fiMvMtSfjy8qrVNorVMFHiRwEEEAAAQS6IuAXZ0maDYJt7GX3ZVDubbsv
a/firmfTbbt2367d6e5tm69etzsw9huInahdSxn3tq0jad4fmydrW8dbptm+u41EbrtvZdG+Iy4T
196isrmuO6keGdXdurN8bUt1nMol3TvU0tnGim6O25sl1ViP3DShqpcb0gVU0tm6co6Dg/afXrwh
b6x091YqGZ02wI03M0ojgAACCCCAAAJ9KeCNuwTBptlt99oGxbK2i9+JpTtfykkZm2a37dq20/Z1
NwLjVgYtAPZH2pFtWdxrm++7jnr7WJJuF9sh4P8IIIAAAggggAACCCCAgL/ATbfPmFY+gMunVW+8
JUVsmt12B8OSZ/clXxYb8O7s9dD/u/XhVIIii13bbfe+O03S3Xl2367dZd3bNt+9lnwWBAIF8soP
pQhskAwEEEAAAQQQQACBrggMDevuppuZG+vK+FLWiTvG8m7LVG2ae9udFpbuzpNtWaSuLHa9s9eh
/3cqMLaDt+uw4UsZ++Mt55du02QtS9h+p+a30zP/RwABBBBAAAEEEEAAAQT6Q0Biq7DYSxS8+VbG
ptt9u7bpsm622DJ23ax8rPx2Bo5RBxi1nHsiUsf+SLrdjrJ2t8M2An0poH2+uC+xmDQCCCCAAAII
dF2gla9P6vpg+7fDKLGXLSNKdlvWcZeodaKWa9p/OwPjpp25CgRNQNLdP1LFlvWubZ5Nd+9725A8
FgQQQAABBBBAAAEEEieQzR7UKXviqBhwZwXcMZbdtj367UuepMviXtuyNm2nxBP/D0p/okQHtrT/
yuxkWhmSuw33trtNL4rd95a3+35rd3tsI4AAAggggAACCCCAAAIIxBfwi7Vsmm3NvS/b7sW7L3ne
8n5l3G0023a316zsnnxtYLynkYg7QZNslu6dnHvfbnvXMiSbFnF4FEMAAQQQQAABBBBImsAsH6KU
tEPGeJMr4I6v7LZ3LbOzaXam7n3Z9lvipvu10VJaJwJj76Tc++7toIFLGVvOrqWsO929b9P91lKO
BQEEEEAAAQQQQAABBBBAoHUBv5jLm2Z7senufdn2ptt871rK2cW9LWnefVtOve5EYKweTMAEvXB2
PwwjSplWxkldBBBAAAEEEEAAAQQQQKCfBKLEWH5lbJrXStJ7ZulkYOyeaNC2G8JdRtL99oPSJD3o
x92H73a1UvNNJxEBBBBAAAEEEEiywOj4UJKHz9gRQOCABSROsj/OUILiLXe6e8Q23ZsWtm/zpK5d
grZtflvW2ba0Er8ROznv2rbkTbf7ki/b9sdd3qZ517YMawQQQAABBBBAAAEEzMTMcENhYnpnHZek
XKrGrdIo38rFGO2bHMWtsmqsgxk5pY6/zLTwzPfVc2vxO3Rq5EdzqnqDg7o51qp1VX9jk3lVvW3l
MZTOtH2uLGz5jdUbZ7n3bXl3moWSNNn2rt11wvJtuY6u2xEYywQ1i61n17aNoH1J98vzSwtqy6az
RgABBBBAoK8FahHulhpRXm3s9om4HEjtyfgV5Yn4/MlJ1euntF1R1ZuYHVHVk0raoGHAe4YVcQQF
5Ul8Lp+J2MP+YjbQ3Z9DCgLJF1hb2jaTs7o3cdo8e/dvBfe2dCP78mODYW+aX563rDs4lvpRFzsW
d3tR6+6Wa0dgvNuYz4YdpE+Wb5K7vHvbXVjS7Y+k22279qbJft8v86d0f8D7Hg6AxAjU6y39Lgyc
5/rydmDe5loxMC8so7itO/mbUp4YF5Un4jKHSWWf3T4Rb+XddO3JuPZEfLzLV6jkOEYJgqUcCwII
IIAAAiECNt6StSzufb80v5MzKWfT3duNBpv8L275Js3tze50YLy3t/A9iyml7LZ37W3B5tt02Xf/
2HTWHoE475Brg+pr53W3w8zOj3lGG223qrytpbBRitaBT6lMVveYvvbWndWFgs8omidtrevnmMvp
grhqVffs/uqibo4t3Z42wTN4zV9FlEAAAQQQQAABBPbEWn6xmA163VRSTtK9aylj02T7QJd2B8Ze
nHZMzrYpa/sj7Qalu/sciPIuufZWMemo27eLdftWMTcm2wgggAACCCCAAAIIINC3Ajb+cgPY+Mzm
udc2zx0Uu+u2ui3t+wXiqnZ1l7tUXe0Gsn61LaDkubf9yrrLeMvKvvsnqD7pCCCAAAIIIIAAAggg
gAAC8QTcsZZfLCatedP9enCXcW97y4blecu2tN/NwFgG6p2Yd989mbA8dznbrre87HvTvPXYRwAB
BBBAAAEEEEAAgTYJaD9grk3d00xnBfziK7+0sFGExWfePO9+WLst53UqMA6bhDfPve/elsnZfVm7
f2yeTZN9Wey+rGWx6509/o8AAggggAACCCCAAAIIIKARsLGVN+aStrxp7n13PXe/Nt3WD8pzp/uV
9ear9jsVGDcbjBvBr6w7371ty0ZJ8ytj67OOKDB3ciJiSYohgAACCCCAAAIIIIBAygW8MZZ3X6bf
LM0v383WLN9dtm3bBxUYywS8E/buR52k1HPXde+706O2RzkEEEAAAQQQQAABBBBAAIG9Aja2csdb
UsK7v7dW+J5t05by7tv0jq8PMjAOmlwYhjtPtt370p53P6gP0hFAAAEEEECgxwRa+T7qHpsKw0HA
V2Du5KRvOokIJFTAG3t54zNvvnuaYXnucl3b7kZg3I5Ju9uQbfe+xbJpNt/u23zWCCCAAAIIIIAA
AggggAACegFvrOUXc9kythe/MjYv6rodbYT21Y3AWAbQbCJ++d407757YkF5QenuumwjgAACCCCA
AAIIIIAAAh0VqNfa9pW7HR1nSONBsVVQujTlzfPu+5XxDsGvjrdMy/vdCoy1AxWEZhDu/KBtbf/U
QwABBBBAAAEEEEAAAQQQ2BEIirfc6X5Wkt+sjF+9rqVlu9ZTtI7iYHlx3XXttl1H651SbRO4dn6t
bW3REAIIIIAAAgikX+DyuVVz7OapVEx0bakQOI+R8aHAvLCM8el8WHZgXq1aC8wLy5idHwvLDs1b
uLQRmh+UOZDRnboXC+WgJkPTpw6NhOYHZZaL1aCspukbq8WmZfwKaL8fOj+a82uuadrQsG+YaA+Q
XUs73m33frN+pGzPXEb3nXGzGXQhPwg0SnpQmS4Mmy4QQAABBBBAQARy+YwKYkZ5Mr6oPBEfVJ6I
FzZLqvltKk+Kpw7rTuBlkCvXt1RjrStPVyemh1X9SaWa8lbT1YXgQDRsMNrjoX19h42FPAQSJuCO
udzb7mmEpSt/w7ibb+92rwbGYbMU4DDksLrkIYAAAj0nUNiIdoI9pAw0tCd+AqU9GdeeiGvfNx4/
gBPxFeWJuPZqgfb4y3EcVl6hmujyFSoZKwsCCCCAQGIEwmIyyeu54DdM9qAD4yBM75jDygXlBaV7
22b/gAW87yxncrpH3weVR3z+lP6rE3JDuisil8+uqtS1H9pQVd5GJYMMux0sbBLZrM5mYEB3IDNZ
3etG5pDN6cY6NqW7rU0dNIaBk4cAAggggAACCHReIOhELShdRiR5UYLkqOU6MsuDDowtVJTJhWF7
27FlB6K8S659R3x1sZD6W8XWlrajHJt9ZbzB7r4CJCCAAAIIIIAAAggggECSBHZjLNegbZorac+m
5Pd8UCwj1l9i2TPftuw0Q43aSbvaidof5RBAAAEEEEAAAQQQQACBfhJoV8zVrnZatu+lwNhOJiqO
lIta1rbNGgEEEEAAAQQQQAABBJoILFxab1KC7DQLBHwqdbMpx4nPei6O68XA2ILHwYpT1rbPGgEE
EEAAAQQQSITA+TNLiRgng0QAgb4UiBOLxSnbVcxeDowFQuDi4LnLure7ikpnCCCAAAIItFug1ML3
ZrZ7LLSHAAIIINC3Au4Yy73dDETKxinfrL225/d6YNz2CdMgAggggAACCCCAAAIIIIAAAm6BpAXG
cd9p6Ol3JdwHgm0EEEAAAQQQQAABBBDofYFcXvc1j70/s6YjjBNbxY3bmnbe6QJJC4ytR7OD0izf
tsMaAbWA9juM1R1SEQEEEEAAAQQQQACBgxdoFms1yz/4GfiMIKmBsXsqFt6u3XlsI4AAAggggAAC
CCDQVoEyz/y31ZPGEi1gYzC7Tuxk0hAYe/ETf1C8E2IfAQQQQAABBBBAAAEEEOghgdTFXNkewmUo
CCCAAAIIIIAAAgggEFNg4eJGYA3l99E22rtybjWw3bCM4bFcWHZg3rDR1QtssEnG2tJ2kxLB2dmc
7vri9OGR4EZDcsYm8yG5wVnry/o5Vsu14IZTmENgnMKDypQQQAABBBDoN4HskO4kVXsinsno+ps6
PKo+NEtXN1V1J2aGVfUWLwcHW2ENzp+aDMsOzbt+YS00PyhzdGIoKCs0/dgtU6H5YZlf/8KVsOzA
vGO3TAfmhWWEBb9h9chDAIFoAgTG0ZwohQACCPS0wGDISXorJ+LLyhPxyQSdiF9TnoiPKU/Ej7Zw
In6myyfi10OuQoX9g8gP608vrnb5ClXYPMhDAAEEEOgfAf1frv4xYqYpE1jz3FKyvVVRzTCT1T9a
MTyqu1Voe6usGuvUtP4KRbWiu41mSHenkNlcLarmePj4uKqeVLp8Vner2MzcmKrPqUM6nLDgVzUQ
KiGAAAIIIIBAqgXkjpFWbqdONY5ncqkPjMcj3I/fD++Ia28VG9DdKWbKparnpRZ9d/uaLvgrbOrq
RR8ZJRFAAAEEEEAAAQQQQCCNAsqwJxEU+st5iZgeg0QAAQQQQAABBBBAAAEEuiqQ2hgrzYFxV18h
dIYAAggggAACCCBgzIVHl2BAAAEEEidAYJy4Q8aAEUAAAQQQQAABBBCIJlDa1n2WSrTWKYVAegQI
jNNzLJkJAggggAACCCCAAAIIIICAQoDAWIFGFQQQQAABBBBAAAEEEEi2gPZbQpI9a0YfJEBgHCRD
OgIIIIAAAggggAACCCCAQF8IEBj3xWFmkggggAACCCCAAAIIIIAAAkECBMZBMh1Mr5T13/HbwWHR
NAIIIIAAAggggAACCCDQlwIExn152Jk0AggggAACCCCAAAIIIICAFcjaDdYIIIAAAggggAACCCCA
QByBcmn/nZCl4v60KG3mR/ShSa1aj9LFvjKTs8P70qIkFDbKUYrtK+Pnta+QT0K9rpufNLWxVvRp
sXnS6PhQ80IpKqF/9aUIgan0jkC1UuudwTASBBBAAAEEIgisr2xHKLVTZP7kZOSy3oLXLkTvx11X
G2yMTeXdzcTavvjN5VjlbWHtpwSXlYHY1fNrtuvY68nZkdh1pMLqYkFVTxtQSWfHb5tW9Xn+0SVV
PW2lYqFitK9XbZ9JqSevm6lDutdcUuZ40OMkMD7oI0D/CCCAQAoEvO+cDynf9deeiGtPwoU+P5pT
HQHtFZFrLZyIT3T5RLzicyUoCpb2JFzavqA8EdceD+1JeJxgOIoZZQ5GoLjlBGKjnA4fjD69ItBb
Avwm6K3jwWj6QKBcqpmt9U3VTG9/+ryqXnFLd7uPdLZ4eUPV5+HjE6p648orFNfOr6v6k0on75hR
1b36uK7PmblRVX/aqwxzLVyhuq68QqWaIJVSI/D4I4vm1J2HUjMfJoIAAgggkH6B1AfGUU4ku/2O
uPbdcHk5dvsdcaN7RMTUqrpborXzE5sTT9IFN7WabqzXL+gCRhkrCwIIIIBAfwrIrbut3E7dn2rM
GgEEEOi8AJ9K3XljekAgsQLaq8WJnTADRwABBBBAAAEEEOhLAQLjvjzsTBoBBBBAAAEEEEAAAQQQ
QMAKEBhbCdYIIIAAAggggEBEgUyWU6iIVBRDAAEEEiHAb/VEHCYGiQACCCCAAAIIIIAAAggg0CkB
AuNOydIuAggggAACCCCAAAJtEhgZH2pTSzSDAAJ+AgTGfiqkIYAAAggggAACCCCAAAII9I0AgXHf
HGomigACCCCAAAIIIIAAAggg4CdAYOynQhoCCCCAQKIERie4xTBRB4zBIoAAAggg0GMCBMY9dkAY
DgIIIIAAAggggAACCCCAQHcFst3tjt4QQAABBBBAAAEEkiCQH8maYqGShKEyRgTUArVaXVW3Wq3p
6hVqRnuX07Xz66o+jxwfV9XbWCmq6iW1EoFxUo8c40YAAQQQQAABBDwCfifra0vbnlLRd0fGctEL
u0pKUK1ZiltlTTVTKlZV9RqVBnRVszndjZf1ui4Qk1EODOoGu7mmC3COnJjQ4Ti1rpxbVdXVvnYK
G7rXjmqQVEqlgO63ViopmBQCCCCAQBoE4p5UdftEfEB3Xts4NN0+EdeehMtgu30i3u2TcJnj4WO6
qzALlzekeuzFL+iN3QgVEEAAAQR8BQiMfVlIRKA/BJpdRSht69+B154UV0q6Pscm9R++tHh5U3XA
B3QXC9Tvop9+5lHVOBeVJ+HSmfZEfF15hWpYeXVKxho3IJY6LAisXN8y00dGgUAAAQQQ6HOB1AfG
UW5X0b4jrj3xT9JtKasLBdU/kblTultvtP3JIFcXdWPNKW+FauUkfFB5K9S5hxdUx2N0Iq+qRyUE
EEAAAQQQQACB/hQYn86bfnrOWHm9oz9fHMwaAQQQQAABBBBAAAEEEEAgfQIExuk7pswIAQQQQAAB
BBBAAAEEEEAghgCBcQysgy6q/WCRgx43/SOAAAIIIIAAAp0UGMpnOtk8bSOAQB8IEBj3wUFmiggg
gAACCCCAAAIIIIAAAsECBMbBNuQg0BGBcivftdiREdEoAggggAACCCCAAAL9LUBg3N/Hn9kjgAAC
CCCAAAIIIIAAAn0vQGDc9y8BABBAAAEEEEAAAQQQQACB/hYgMO7v48/sEUAAAQQQQAABBBBAAIG+
FyAw7vuXAAAIIIAAAggggAAC3RLI5jj97pZ1J/sZnRjqZPO0fQAC2QPos6e6LBYqPTUeBoMAAggg
gAACCCCAAAL9KRAWm8yfmlShnD+zpKonlY7eMqWum7SKfR8YJ+2AMV4EEEAAAQQQQCCJArmh5t81
XNgsq6d2571HVXUXr2yq6m1v6cc6c2RU1WdY0BTa4EBobmDmyvWtwLxmGcdvnW5WxDc/k9VdUa9V
677tNUvMtfAd2JWlWrPmffPVx9G3NRLbJUBg3C5J2kEAAQQQQCBEwJ60a0/Cpemi8kR8utsn4c5Y
B7p8In5MeRIurtoT8bOPLEr12MvciYnYdaTC0lVdADc6rr/lc2WhoBrr9OERVT0qIYAAAgclQGB8
UPL0iwACoQLlcrx3YVt597USsy878OGxnN2MtT56i+5KwTnlSfgR5Um4TEp7Ij6iPBFfVZ6Ey1in
lCfi2itUNtCVvlkQQACBNApMzA6b9aXtNE6tr+Z08vSsaeV26n7BIjDu8pGWd9C1t6UcxLvh2hPN
82eWVbKVUlVVTyppg5SZI7p3tasV3S075RbmWNrWPRNfq+nGOjqpv8pQ2CjpjqX2MpOuN2ohgAAC
CCCAAAIIIGBSHxg3u32slatMnL/zLwgBBBBAAAEEEEAAAQQQSL6A7un25M+bGaRMQHu1OGUMTAcB
BBIgcOjoWAJGyRARQAABBBDoLwEC4/463swWAQQQQAABBBBAAAEEEEDAI5D6W6k982UXAQQQQAAB
BBBAAAEEEEAggkArj51GaL6nihAY99ThYDAIIIAAAggggAACCCCAwMEJzMz35yM/3Ep9cK85ekYA
AQQQQAABBDousLKw1fE+6AABBNIh0K9BsRw9AuN0vIaZBQIIIIAAAggggAACCCDQksDy1c2W6ie5
MoFxko8eY0cAAQQQQAABBBBAAAEE2ijQr8ExgXEbX0Q0hQACCCCAAAIIIIAAAggkXaAfg2MC46S/
ahk/AggggAACCCCQEoHJmeGUzIRpJEWguFVJylC7Ps5+C475VOquv8ToEAEEEEAAAQQQQKBXBRYv
b0Qa2ngLQfzmeilSH95Cxa2yNynS/uxR/acMj0/lI/XhLaT90Lctpc1dzzrmHULk/XNfX4pc1l1w
ZCzn3o28XSlVI5d1F7z6+Jp7N9a29kO1BjMDplatx+orqYUJjJN65Bg3AggggAACHRJwn5huK0/E
DylPxMe6fBIuhAXlifj8qUnVEaiUa6p6rZz4n3nwqqrPm+88pKpXVp74S2fVis7n4rdWVGPdXC2q
6lGptwQefuCyaeXfSG/Nxn80AwPG1A8gRu2X4JjA2P91RyoCCCDQMQHtbVvad/y1J+ECcKfyHfhH
lSfhp5Qn4TJW7Tvw2pPwS8qTcBnrhvJEfEJ5hcod6Er/LAgg0LrAxvK2aeWqcesjoAUEuicgwXHa
FwLjtB/hFuZ34dElc/Ndzd8p9rutI5vTPb6eH9G9JE+enlXP9PJjuneYRyeGVH3m8hlVPam0fE33
EfqDg7pfZuPT+me9Chu6270mZ3V91mv6t1C1x2RzTXcrnPoFQEUEEEAAAQQQQACBjgjoopCODKUz
jTZ7l1x7i5iMth9uE/MLejtzpGgVAQQQQAABBBBAAAEEEDgYAd1lvYMZK70qBbTPTim7oxoCCCCA
AAIIIIBADwksXdHdcdZDU2AoCHRcgMC448R0gAACCCCAAAIIIIAAAggg0MsCBMa9fHQYGwIIIIAA
AghEEhgd133uQ6TGKYQAAl0T0H6GS9cGSEepFSAwVh5a7fPFyu6ohgACCCCAAAIIIIAAAggg0CEB
AuMOwdIsAggggAACCCCAAAIIIIBAMgQIjJNxnBglAggggAACCCCAAAIIIIBAhwQIjDsES7MIIIAA
AggggAACCCCAAALJECAwTsZxYpQIIIAAAggggAACCCCAAAIdEiAw7hAszSKAAAIIIIAAAggggAAC
CCRDIJuMYTJKBBBAAAEEEEAAAQQQ8BOYPTrml7wnbeHSxp79qDv5YV24UKvWo3axr9zh4xP70qIk
XHpsJUqxfWVy+cy+tCgJw6M6m8tnV6M071vm6M1TvunNEiularMivvkr17Z809OYqDuaaZRgTggg
gAACCCCQWIFioWLqyhNx7Um49oRxRPmdy+ceWVQfn+HRnKru9mZZVa+4XVHVO4hKI+M6Gxnr/MlJ
1ZC/8aWrqnpHb9EFRarOqNQxgWPOcWwlOO7YwPq8YQLjPn8BhE1/eEz/hyKsXfIQQKAzAkEn6dqT
cBnl48oT8XyXT8JlrP1wIq49CX9UeRIurnICp1m0V6eGlFenNGOkDgIIIIBAuMDU4RGzulAIL5SS
XALjlBxIphFfwL7zXq/pbvUpF3W3pAyN6P/ZzRxpfquUn8TWRskvuWna2pL+F+Hw2FDT9v0KbK3r
xurXVtS0mvI1cPL0bNQu9pS7rLzVKyjw3dM4OwgggAACCCCAAAKxBfRn6LG7OpgKzU7su/1OuCho
3w3v9i1im2tF9UHbWNlW1T355BlVPRvkqipTCQEEEEAAAQQQQAABBPpagE+l7uvDz+QRQAABBBBA
AAEEEEAAAQQIjHkNIIAAAggggAACCCCAAAII9LUAgXFfH34mjwACCCCAAAIIIIAAAgggQGDMawAB
BBBAAAEEEEiAgPYrlw5iatrvvj2IsdInAgggIAIExrwOEEAAAQQQQAABBPpWYDCTnNPhK2dXE3Oc
ckOZxIyVgSIgAsn5TcDxQgABBBBAAAEEEEAAAQQQQKADAgTGHUClSQQQQAABBBBAAAEEEEAAgeQI
EBgn51gxUgQQQAABBBBAAAEEEEAAgQ4IEBh3AJUmEUAAAQQQQAABBBBAAAEEkiOQTc5QGWlSBFYX
CkkZKuNEAAEEIgmc/drC/nL1/UlRU2p1XWXt79drF9ajDm1fuY2V4r60KAkbK9tRiu0rk83pP7Cn
Wq3tay9KwvBILkqxfWUuPbZivu0FN+1LJwGBXhbIxPywsfHpYfV0Hv/6oqpuJtvda3d15e/k2fkx
1fykkvZ33eaq7ndyNqc3HRkfUs8zSRUJjJN0tBhr2wXqNd3JadsHQoMIRBA4f2YpQqn9RYaG9b/q
y6Xq/gYjpQxEKuUtNDKuC1CknUpZFxTVa7p63rGznxwB76flViq613kmO2CunFs1tzzlcKzJH7tl
KlZ5d+GL31px70beLhYqkcu6Cy5f33Lvxtr2OketXNgsRS26p1xe+QaHNDI6oTvxv3Z+bc8You7k
R/W/65aubEbtZk+5uAHxnsrs+ApcfXzVzJ/S/3v2bbRDifI3spXguEPD6qlm9WdLPTUNBoNA+gVy
LVxFSb9O+md49uFFs3xty8zMjbZlstmhaO8ca0+mDx3VjXPpqu6ET1DUJ5oDzYP4W5+6P/AZGdOd
SMtY15d1V1O3NnQBw1Ofe1y6VS3a4EYCRs1ytIWgsbilC/60V4uav3I0AtRBAAEEEDgIAQLjg1Cn
z54QqFVq5tDxcfVYtCd9N90xo+rzkvIqgXSmfYcwm8urxiqVtN8LOT6p63N1SX8Lf2lbdzKtfQ1s
b5Vju1acK7cSFJ88PRu77nQLwbT2ysTNdx6KPU6poL0qLnW1t/vVlLffSp895uCvAABAAElEQVQs
CCCAAAIIIJAOgdQHxsNNblVZVN6Ooj3pl5fNhPJZDe1zGoPK5zRGlc8TtHKSqX2WTYJclt4RaOXf
R+/MgpEggAACCCCAAAII9ItAtHvp+kWjC/OcOaK7vbALQ6MLBBBAAAEEEEAAAQQQQKAvBQiM+/Kw
M2kEEEAAAQQQQAABBBBAAAErQGBsJVgjgAACCCCAAAIIIIAAAgj0pQCBcV8ediaNAAIIIIAAAggg
gAACCCBgBQiMrQRrBBDoT4E632XdnweeWSOAAAIIIIAAAk8IEBg/YcEWAggggAACCBywwJWzuu8/
PuBh0z0CCCCAQMIFCIwTfgAZPgIIIIAAAggggAACCCCAQGsCBMat+VEbAQQQQAABBBBAAAEEEEAg
4QIExgk/gAwfAQQQQAABBBBAAIFOCaxc3+pU07SLQE8JZHtqNAwGAQQQQAABBNousLpQMFOHR9re
Lg0igECyBW6561CkCZz7+lKkct5CEzPD3qRI+3XlB2PK7zrNoh2n9HX+jM5m/uSkZqhm+dqmqp5U
GhjQVc0OZXQVE1aLwDhhB4zhIoAAAggggEB7BY7fOq1q8NzDizv1Yp5taoMM6Wxsakg11sGM7ox4
cFBXTwa5trStGuvUId2bOOvLuv5kkMuFsmqs86d0wc3o5JCp13TfirC5VlKN9cRtute5qjMqdUxg
Zm6speC4YwNLQcMExik4iEwBAQQQaFWgXvNv4ciJCf+MJqmLlzealPDPnlO+gy6tbW/qTmzXl4r+
g2mSOpjRP41ULlebtO6fPTM36p8RIbVa1Z2EL1/T3UY5PJqLMCr/IhsrumNidFP0HwSpCCCAAAJ9
JUBg3FeHm8m2S2DpyqaZnNG9o33t/LpqGAXlSb90Nj6VV/WprTQ6obuiIf3lhnTBxrULuqDojqfP
a6fpvGOrCxjyI/F/9S5e3jTVSs2MjMe3DQp61ROnIgIIINCDAnI7bCtXjXtwSgypSwLyumnlduou
DZNuOiwQ/+yswwNqd/PNnqnaUt6Oclx5O8rjymc0xGW8y89pLFzSBXAjLQRFmoBBbLS/zCTAZUEA
AQQQQAABBBBAAIH+FtBdmulvM2aPAAIIIIAAAggggAACCCCQIgEC4xQdTKaCAAIIIIAAAgi0U6Cm
/ICodo6BthBAAIFuCBAYd0OZPhBAAAEEUiewvqT7WpDUQTAhBBBAoEcEmj1C2SPDZBg9KkBg3KMH
hmEhgAACCCCAAAIIIIAAAgh0R4DAuDvO9IIAAggggAACCCCAAAIIINCjAgTGPXpgGBYCCCCAAAII
pFMgl8+kc2LMCgEEEEiwAIFxgg8eQ0cAAQQQQAABBBBAAAEEEGhdgMC4dUNaQAABBBBAAAEEEEAA
AQQQSLAAgXGCDx5DRwABBBBAAAEEEEAAAQQQaF0g23oTyW1ha62U3MEzcgQQQAABBBBAAAEEUihQ
q9bNYGagqzMbzOiuF5Y3yqpxri5uqepJpXKxqq6rqVgp18zM3JimaqLq9HVgnKgjxWARQAABBBBA
AAGFwOLlTZPN6U76pbuMMmDQ9tnKSf/waE4hZNRBWCtjzQ3pPoRt6tCIao6PfW1BVU8qFZTBXysf
NHfy1lnVeKcOjarqrS7y3fQquBRVIjBO0cFkKggggAAC/gKVcvC76zed1p18NXqq+/fXLHVAeSFE
eyIt41k4u9psWL75J5U+i5c3fNuLkri9qbsCc+iY7orGpW+tRBnWvjLZoZ1gc3g0/ulUpRT8mtzX
kStBglwWBBBIvsDmasmMTQ0lfyIpmkH83+QpmjxTQQABf4Fjt043Mr750DX/Ak1SM1n9lYkrC7p3
bMenh5uMyj/7kQcu+2dESD3xpJkIpfYXuX5xfX9ik5TNtaIR1+JW/IBh/tRkk9aDs7U+Q8O6Py/a
qxIyg5Fx3ZWi4NmTgwACCCCAAAL9IqA7c0mwzoDrbfpJ5a0oMn3t7SjbyltRpM+s8nsPTylvRSlt
V6Tb2Eu1Uotdx1ZYvqZ7J3xwUHf5ZWwyb7uOvc6P6P75SICjWQ4dHddUa9SZPaq7iqLukIoIIIAA
Aggg0FMCR05MGM0bsz01CQaDQAcF9Jd1OjiodjYtgbD7p51td7MtbVDczTHSFwIIIIAAAv0kUN7W
3Q7dT0bMFQEEEEiKQOoD46QcCMaJAAIIIIAAAggggAACCCBwMAIExgfjTq8IIIAAAggggAACCCCA
AAI9IkBg3CMHgmEYo32+GDsEEEAAAQQQQOAgBLSfx3IQY6VPBBAIFyAwDvchFwEEEEAAAQQQQAAB
BBBAIOUCBMYpP8BMDwEEEEAAAQQQQAABBBBAIFyAwDjch1wEEEAAAQQQQAABBBBAAIGUCxAYp/wA
Mz0EEEAgSQLVqv570JM0T8aKAAIIIIAAAr0lQGDcW8eD0SCAAAIIIIAAAn0tUC7x/dB9/QJg8ggc
kED2gPqlWwQQQAABBBBAAAEEEEAAgS4JlItVk8tnzPZmOXaPG6vbseskrQKBcdKOGONFAAEEEEAA
gbYK5EezprhVaWubNHYwAgODA6qON1aLqnpSKbMRP8iQehKgaBZtPekrm9P1OTalc506NKqZYqPO
uUcWVXXzw7rw5pa7Dqn6e+xrC6p6UmlwUHfz7tFbptR9XvzGsrpu2ivqXjlpV2F+CCCAAAIIJFjA
7yT/2K26E6mrj6+pJMYmh1T1pFK1onvWXK6GaJdiIX5gXCnXzNZGyVw+uxq725HRXOw6UiE/ojt1
09aTPrXHIzekC8Kkz5WFgqxiL+NT+dh1qIAAAgiIgO63K3YIIIBAigSGlO8uF5wTYs1y6s7470pv
OVckVuVEcSD+u/aPPnhVM8xGnanDunf7Ky08IzgxO6wa76DCRjrSBn5Sd/qIzkeCKc2SyeiuLmj6
og4CCCCAAAL9JEBgnPKjPXdiwmhvRZmY1r3runJ9S6U6f7PuaoZ0pn03WztWeeddGxRlc7oT240V
/bMd1y+uq47J0LDu3f5WgqKpwyOqsWqel5GOtEGxapBUQgABBBBAAIFUCdz6lMOmldupU4WR8Mmk
PjBeXQy+FWdI+WyHHPOc8hmNQeUzGtMtPKOR8Ncow0cAAQQQQAABBBBIoMDq4pZp5TnjBE6ZISdY
QHfpKsETZugIIIAAAggggEC/CWieoe43I+aLAAL9LUBg3N/Hn9kjgAACCCCAAAIIIIAAAn0vQGDc
9y8BABBAAAEEEEAAAQQQQACB/hYgMO7v48/sEUAAAQQQQAABBBBAAIG+FyAw7vuXAAAIIIAAAggg
gAACSRFo5fu6kzJHxonAQQgQGB+EOn0igAACCCCAAAIIIIAAAgj0jACBcc8cCgaCAAIIIIBAegQ2
10rpmQwzQQABBBBIvQCBseIQV0o1RS2qIIAAAggggAACCCCAAAII9KIAgXEvHhXGhAACCCCAAAII
IIAAAggg0DWBbNd6oiMEEEAAAQQQQAABBBDomMDI2FBo24OTA6H5QZlXzq4GZTVNX65uNi3jV2Bk
LOeX3DStWtHd2XnxWytN2w4qcOTERFBWaPr6ynZoflBmrVoPymqaPjSsC/+mDo00bTvpBXQySZ81
40cAAQQQQACBVAoMDOpO/LUYcrJ49Oap2NVXrm3FriMVDh8bV9WTSlcfX1PVnTupO+kfGNAfi611
3TPqk7PDujnepJujdHbmwauqPms1fXAzOZv+IEWF2ieVCpsl0+xNkD6haOs0CYzbykljCCCAQG8I
uN/ZHT41qR7U+TNLqrpTh/UnbaVCRdXn5mpRVS+X1/8p1J73ZzK6J5laCfoWLm2ofOZbeP2sLRZU
fQ4egI9qoFRKjcD2VtkMj+quUKYGgYkg0OcC+rOBPodj+ukTqNejv3PbysmpUZ5J50f0/1yjz2zv
cc0NZfYmRNwrOicY2iWT1QUME8qrBKsLuhN3md/4dF41zQuKYHPl6qYZncobd8Cr6pxKCCCAAAII
IIAAAvsE9Gfa+5rqzYRiyJWHKeVtKNrnM0TosvIZDe3zGdLnsPIZjTA7aTdo0b7Tv3BpPajJpuk3
3T7TtIxfgcXLuisofm2RhgACCCCAAAIIIIAAAskU0F2aSeZcGTUCCCCAAAIIIIAAAggggAAC+wQI
jPeRkIBAugS2Q+6aSNdMmQ0CCCCAAAIIIKATKG3rPt9C1xu1elGAwLgXjwpjQgABBBBAAAEEEEAA
AQQQ6JoAgXHXqA+mo0HlBxkdzGjpFQEEEEAAAQQQQAABBBDovgCBcffN6REBBBBAAAEEEEAAgcQI
HL0l/nd1J2ZyDBSBGwIExrwUEEAAAQQQQAABBBBAAAEE+lqAwLivDz+TRwABBBBAAAEEOiNQr9c7
0zCtIoBA1wWundd/rWrXB6vskMBYCUc1BBBAAAEEEEAAAQQQ6C2BDJ+v01sHJEGjITBO0MFiqAgg
gAACCCDQOwInT882BvPNh671zqAYCQIIIICASiCrqkUlBBBAAAEEEEAAAQQQQCDhAgODA7szGJsc
2t2Os1Gt1OIU3y1bLlZ3t+NubKzobm3O5rguGmRNYBwkQzoCCCCAAAIIIJBggfNnlvaM/tituk8W
vvL42p524uyMT+bjFN8tmx/N7W7H2ShslOMU31N24dLGnv2oOzPzY1GL7ilX3NKPdfGybqyl7cqe
McTZGR7THRNtINbKLdG1Gs+3xzm2lN0RIDDmlYAAAgggkGqBm+7Yud01aJLL17eCspqmX1UGDNqr
C9lcpumYggqMKQOUgYEnrqYEtR2Unh3SjVd7FWVtaTtoKE3TR5SBWLWycwJeKcW78jM2pQsYvcFu
04lRAAEEEEAgkgCBcSQmCiHQXwJD+Z2TWe3J+/EnTavBLn5jWVVXe3VhRPkOuAxye1P3zvv49HDs
Ocr8KuWaKSre7de+Wy+DnDo8EnusUiFukODupFjQuTYLgN19JHW7Uq6aVoLjpM6bcSOQRgH5vd7K
VeM0mvTbnKYOjZjVxUK/Tbtn59t3gXHOdV/9wgHchqI9Cc+4xh3n1dTKbSi6U1NjJmfjn/TLnLZb
uKVo4fJmHJbdstoTzMlDujlKx1ceW93tP87G6WcejVN8t+yVc7r+dhtgAwEEEEAAAQQQQACBlAuk
PjB2B8IpP5ZMDwEEEEAAAQQQQAABBBBAQCHAx5Ip0KjSWwKZFp65662ZMBoEEEAAAQQQQAABBBA4
CAEC44NQp08EEEAAAQQQQAABBBAIFNB+zklgg2Qg0ESAwLgJENkIIIAAAggggAACCCCAAALpFiAw
TvfxZXYIIIAAAgggkCIB7XfmpoiAqSCAAAIdESAw7ghr8huVr4VhQQABBBBAAAEEEEAAAQT6QYDA
uB+OMnNEAAEEEEAAAQQQQAABBBAIFCAwDqQhAwEEEEAAAQSSJMBXNCbpaDFWBBBAoLcECIy7eDxG
xnJd7I2uEEAAAQQQQACB/hKoVHgUrL+OOLONK8DjksFi2eAschBAAAEEEEAAAQQQQAABBPpNID/a
fxf0CIz77VXOfBFAAAEEEEAAgT4XWFnY2ieQyepupCxulfe1FTXh2C1TUYvuKVcuVffsR91ZXSxE
Lbqv3PjU8L60KAmFzVKUYr5lKiXdHQD5YV2IMzA44DuOZonlou54SLvauqXtSrNhBeaPTY0F5vVz
hu5V089izB0BBBBAAIE+Eli4uK6ebUl5sjg6MaTuc0RZd00ZMBQ2dk76VxfiBRzTc6PqOR5VBlMb
K0VVn6Pj+uOxta4LijI5XZAqE9xoIWBQASWo0tShEdNKcJygqTJUBGILEBjHJqMCAgj0q4D3+0Mv
PLqkohibzMeuV6/VTN2pVavGf/d8fWU7dn+2gvakdlD5rrv0q71969qFNTvsWOupw/oAZXwq/rGU
wWmvEEjdtaV4AZjUYUEAAQQQQACBcAEC43CfvsqtVeS0u/nS9JYh5TMJ86cmm3fuU2Lh0oZParSk
wyfGoxX0lNK+6y7NTMzobkU698iiZxTRdlv5kIX5UxPROvGUWrmuP3HP5XW/ltaXdcGf9nXnmTK7
CCCAAAIIIIAAAgkW0J2BJmjCYbcbaZ/P0N5upX02Q7i1z2don81oGvwm6DXAUBFAAAEEEEAAAQQQ
QACBMAH9AxxhrZKHAAIIIIAAAggggAACCPSBQC6f6YNZpn+KBMbpP8bMEAEEEEAAAQQQQAABBBBA
IESAwDgEhywEEEAAAQQQQAABBBBAAIH0CxAYp/8YM0MEEEAAAQQQQAABBBBAAIEQAQLjEByyEEAA
AQQQQAABBBBAAAEE0i9AYJz+Y8wMEUAAAQQQQAABBBBAAAEEQgQIjENwyEIAAQQQQAABBPpdoF6r
9ztB6Pxr+IT6kIlAUgQIjJNypBgnAggggEAqBb53/jeN/LAggAACaRQYGRtK47SYUwoFCIxTeFAP
ckr50dxBdk/fCCCAAAIIIIAAAggggEBsgWzsGimpUC5VUzITppEogTq3o4Udr9J2JSybPAQQQAAB
BBDookC99kRnlYr+3Hl9efuJhmJszZ+ajFH6iaKlbd1Yrz6+9kQjMbfGp/Ixa+wUr1ZdyDFayOUz
5tanHI5R44miF76x/MQOW7sCfRsY7wqwgQACCCCAAAIIhAjkR4Lvhhoa3jmVGhmPd7vo5moxpMfw
rG6fgMtoMkZ3k2GlrAtQZufHwhFCcpeubYbkBmeNTsQ7hu6WJqaH3buRty+fXY1c1l2wUtEFU9LG
cMjr2d0H2wj0mwCBcb8dceaLAAIIKAVuv2cucs1HPn8lcllvwcGM7gR8yHn3XLO0coVg+vCIpkvj
vnoy87SdAGD5y9FO5qvKE+K4gZud2KHj43Yz9nptSXeVqJUPe9pQXpkKC35jT5wKCCCAAAKJEyAw
TtwhY8BJEtjeLO0Z7pGbJvbsx9nJDelO+tdX9FclBgcH4gxxt+zGiu5kWHvLlHRcV96mrq0nfU7M
6IKioZH4xzLrBH1luTWsy3fjxwmGxYQFAQQQQAABBBBIokDqA+OgW1S077jLQdbegpKkZzM213XB
1EgLH761fG1L9W+olefFN5RBozfgVQ2cSggggAACCCCAAAIIINATArr71Xpi6AwCAQQQQAABBBBA
AAEEEEAAgdYFUn/FuHUiWkAAAQQQQEAv8Jpbf3df5Yln7v+gnp/8rj/dV86d8Jt//wPuXbYRQAAB
BBBAoI0CXDFuIyZNIYAAAgggkDaBwkY5bVNiPggggAACCOwT4IrxPhISEEAAAQQQaJ/ABx778X2N
rX/hiQ+os1eKuSK8j4kEBBBAAAEEuibAFeOuUdMRAggggAACCCCAAAKtC2SznMK3rkgLCOwV4F/V
Xg/2EEAAAQQQQAABBBBAoA8FZuZ2vle+D6fOlB0BAmNeBggggAACCCCAAAI9JXDtwlpPjYfBIIBA
+gUIjNN/jJkhAggggAACCCCAAAIIIIBAiACBcQgOWQgggAACCCCAAAIIIIAAAukX4FOp03+MmSEC
CCCAQIjA2MSQ2VwvhZQgCwEEEEAAgfYL1Kp1MzaZVze8vaX7Or1W+lQPNgEVCYwTcJAYIgIIIIAA
AgikSyCby5hKuZquSblmM3V4pLFXUJ64S+VcPuNqMfrmxMxw9MKukhPTunrSRLmkO5bVSs01gnib
o+ND8SrcKF1UHpPBzICqP6mk/VCrq+d0z5rnR3PqsQ4O6uYpQS5LsgUIjBNw/JaubCZglAwRAQQQ
QMArMB5wou0+GX7PZ3+kUW3UuXIdZdlSXt3eXCtGad63zMzcqG96s8QrZ1ebFfHNH5vSX0Gp1XQn
p1H9vQMevnECrgnGStsVb3OR9idmd4LOSIVdhVoJFgZ0sYKrdzYRQACB3hYgMO7t48PoEOg7gdXF
gmrO7kAjTgPak2HpQxtoFLfjXwUpbjkn0M6JabUa/+pCYUN3q5XMcVH5xtzImP7d+vyI7k/T3MlJ
GbJqOffIoqpeUOCraoxKCCCAAAJtEZCr4q28EdSWQdBI4gR0Zx+Jm2bvDLhxchtzONrbT6SbK8pb
UOZP6U4wr53X3fIiY52d1313XLWFW1cKG7rnCjNZ3efWaW/PEZ/VBV3AqL26JH3mnFv9NIsmeJN+
tEGxZozUQQABBBBAAAEEDlqg7tzlMqC8ffugx562/lMfGNcCnt0YUT6XIS+Ag3g2I20vPOaDAAII
IIAAAgggkBwBrsIm51gxUp2A7rKXri9qIYAAAggggAACCCCAAAIIINBzAgTGPXdIGBACCCCAAAII
IIAAAggggEA3BQiMu6lNXwgggAACCCCAAAIIIIAAAj0nQGDcc4eEASGAAAIIIIAAAgh0W2B9Zbvb
XdIfAgj0kACBcQ8dDIbSXQHth6h1d5T0hgACCCCAAAIIIIAAAp0WIDDutDDtI4AAAggggAACCCCA
AAI9IjAynuuRkfTWMAiMe+t4MBoEEEAAAQQQQAABBBBAAIEuCxAYdxmc7hBAAAEEEEAAAQQQQKC5
wMz8WPNClECgTQIExm2CpBkEEEAAAQQQQAABBBBAAIFkCmSTOWxGjQACCCCAAAJpFdhcLZqxqXwi
plet1Ewmm4zrDEPDWVPariTClUEaMzI+FMowPq37N1Kr1kLbDcucVV7BXbi0EdZsaN5AZiA0Pyiz
WCgHZYWmTx0aCc0PyiwXq0FZTdM3nN95mqWVf8/5UZ4z9poTGHtFmuzzScZNgMhGAAEEEECgzQIS
0EVdxpUB9eZaKWoXe8pVnSBDfgqb8evLGwCaZeqw7sRd+lq5vqXp0tTrqmpmYnpYV9GpVavpOl1d
KKj71B6TXD6j6rNZ8KtqlEoIIKASiP6XRtU8lRBAAAEE2iUwfXjUnLhtJnZzV8+vxa5jK2jfDMzm
9FfQqlXdyfCZL1yxw469npjRnbyXS7orBOMtBAuFTd1VkOEWrg6cefBqbFOp0EqfcYJh1eCohAAC
CCCAgEuAwNiFwWb6BAZD7r6ZPzWpnnBuSPfO8OWzq+o+68p3zuVKhnZZW9K9657N6nwGBkIOWJNJ
aG9lzOZ0Y5XhaG/11FyxKbVwi1YTOrIRQAABBBBAAIG+F0h9YDwc8HzGxAE8l6H9ZL3FFp7LGFQ+
l7G2tK36x9HKLVMZ5RWmsOBXNQkqIYAAAggggAACXRCoO/eot/KmcBeGSBcI9I2A/l63viFioggg
gAACCCCAAAIIIIAAAmkWIDBO89FlbggggAACCCCAAAIIIIAAAk0FCIybElEAAQQQQAABBBBAAAEE
EEAgzQIExmk+uswNAQQQQAABBBBAAAEEOi6g/cqujg+MDiILEBhHpqIgAggggAACCCCAAAIIIIBA
GgUIjNN4VJkTAggggAACCCCAAAIIIIBAZAEC48hUFEQAAQQQQAABBBBAAAEEEEijAIFxGo8qc0Kg
DQJD+dR/zXkblGgCAQQQQCBMoFiohGWTdwACk4dGDqBXukSg9wUIjHv/GPXFCIfHc30xTyaJAAII
IIAAAggggAACvSfAJaHeOyaMCAEEEEAAAQQQQAABBA5QYG1pO3bv2ZzumuP0Yf1V/LHJfOxxSoX1
5fjzU3WUoEoExgk6WAwVAQQQQAABBBBoh8DEzHCsZhYvb8Qq7y48f2rSvRt5+/qFtchl3QVHJ4bc
u7G2j90yFau8Lfz1L1yxm7HXx26Zjl1HKixc1B+ToWFdCHDl3KpqrMNj+jsDh42+rmawmoBY0w91
ek9A96+i9+bBiBBAAAEEEIgtYE9IN9aKsetKhevndSfug1ndVQXpU3vifuWs7oRW+tSeRLfyvZ65
oYx0HXup1eqx60iF0rbuWdhKuWaG8hmTycQ/plOHR1VjXbq6qaonleIGxOqOqIgAAqkS6IfPCyAw
TtVLlskg0HmBKCfIQ8o7gjZXdcGJzPrw8XHV5C+3ECzMzI2p+pxSfPDJ0pVNc+3Cusnlr8buc3JW
eUCcnsamdLdorVzfij1OW2FgYMBuxlrbIDdWJQojcENgyrmVcXWhgAcCCCCAgEegH4JimTKBsefA
X29yW0peeeuJdHM1QbefDMR/47shWS5VPaLRdrevlaMV9ClV2NTV3d7SXR2QIWSyuhP34VH97UDb
W7p5Tk3rrkhUKzUfbZIQQAABBBBAAAEE+kWgX4JiOZ6pD4zHAx5IbxYA98uLnXkigAACCCCAAAII
IIAAAn4C+ZHUh4u701ZeF9ytzwYCCCCAAAIIxBSocUdGTDGKI4BAkgW2lXf3JXnOjD15AgTGyTtm
jBgBBBBAAAEEEEAAAQQQQKCNAgTGbcSkKQQQQAABBBBAAIGDFahV+YyMgz0C9I5AMgUIjJN53CKN
ulLiD0MkKAohgAACCCCAAAIIIIBAXwsQGPf14WfyCCCAAAIIIIAAAggggAACBMa8BhBAAAEEEEAA
AQQQQAABBPpagMC4rw8/k0cAAQQQQAABBBBAAAEEECAw5jWAAAIIIIAAAggggAACCDgCw6M5HPpU
gMC4Tw8800YAAQQQQAABBBBAAAEEENgRyAKBAAIIIIAAAggggAAC7ROYnB2J3NjqYiFyWXfBcqnq
3o21ffy26VjlbeHzjy7ZzdjrUlE33vyILlypVeuxx2grTM4O281Y68JGOVZ5W7iVY1mv6+a5sVa0
3bO+IaB7pcGHAAIIIIAAAgg0ERjKZ5qUCM7OZHU3ta0pgwwZSa0W/wRTTkq3t8pmfWU7eDIBOfMn
JwNywpOvXYjfl21RG2SMTeVtE7HXF7+5HLuOVGjlltayMgi7en5NNdbpI6OmlUBM1SmVEECgrQIE
xm3lpDEEEECgdYHc0P5gQoKEqUMj5tgtU7E7WLyyGbuOraANToqFim0i9rquCE6kk1becT9yYjz2
OFutUNgoqZrQzrPawtWTuRMTqrEWNnVzVHVGJQQQQAABBFoQIDBuAY+qnRWIesvNiSfNqAZSq9VU
9aTS9Qsbqrpb6/oA5fanz6v6LDpXMjTL4mXdHKWvw8d1J9HjLVyRuHZ+XTNNc/IO3etHOrv6uK7P
mblR1ViphAACCCCAAAIIINAZgdQHxkHPbVSUz2Von8mQw3dB+VxG1ADR+xLR3i7VaEf3GIhzG5Eu
2NTO0Ttn9hFAAAEEEEAAAQQQSJJApVQz2SHd4yNJmmevj5Uj0KUjpA2KuzQ8ukEAAQQQQAABBBBA
AAEE+laAwLhvDz0TRwABBBBAAAEEEEAAAQQQEAECY14HCCRAQPt8cQKmxhARQAABBGIKzN2k+xyH
mN1QHIFECwxmBhI9fgbffQEC4+6b0yMCCCCAAAIIIIAAAi0JjIwPtVSfygggsFeAwHivB3sIIIAA
AggggEBkgZOnZxtlz59ZilyHgggggMBBCxw9pfse9YMedyf7JzDupC5tI4AAAggggAACCCCAAAII
9LwAgXHPHyIGiAACCCCAAAIIIIAAAggg0EkBAuNO6tI2AggggAACPSIwd5IPbOqRQ8EwEEAAAQR6
UKAvA+PCRqkHDwVDQgABBBBAAAEEEEAAAQQQOAiB7EF0Sp8IIIAAAggggAACCCCQLIGTd8ya84/2
3gfN5Uf8Q5rCRlkFXKvVVfWq1ZqqnlTKZ/3n0KzBa+fXmxUJzD9yfDwwrx8zdEegH6WYMwIIIIAA
Aggg0MMCUU7K15a2VTMYGcup6kmloKClWYPFLV1QI+2WitVmzfvnt/DVt9mc7kbMel0XhMkEBgZ1
A95cK/rPP0LqkRO6xzKunFuN0Pr+ItrXz/6WSEEgXIDAONyHXAQQQACBBArkh+P9eVtdLKhmWdae
fDu9DY/oAo015VhlgqXtimqegxndyXelpL96cv2i7irIrU85rJqjVDr78KKq7uz8WKPeqRtf3RS1
kYXLG1GL7isXJQjeV6mFhMJm2bQSHLfQNVURQACBrgjEO3PoypDoBAEEDkrAfSWhtK18t90ZvPad
6EpJ3+fY5JCKbfHypqqeVBrQXRwwmnfNJRjK5TNm4VL8E+nDLdwqVVYek9mjO4GCBndsMq+pZhYV
NqqOqIQAAggggAACqRPoq8DY3qqive1Ejr72hF9724n0qTmJlnraW09WF3RXTqTPuVO622ta6VN7
pSenvOWpFdtB5S1P5x5ekG5Vy+iELshQdUYlBBBAAAEEEEAAAQQSKKC83pGcmUowbH+SM2pGigAC
CCCAAAIIIIAAAivXt0BAoCsCqQ+Mu6JIJwgggAACCCCAAAIIIIAAAokVIDBO7KFj4AgggAACCCCA
AAIIIIAAAu0QIDBuhyJt9JWA+isg+kqJySKAAAIIIIAAAgggkBwBAuPkHCtGigACCCCAAAII9I3A
0EhffUZs3xxXJopArwoQGPfqkWFcCCCAAAIIIIAAAgggkBiB0QndV0cmZoIpHyiBccoPMNNDAAEE
EEAAAQQQQAABBBAIFyAwDvchFwEEEEAAAQSUAlOHR5Q1qYYAAggggEB3BQiMu+tNbwgggAACCCCA
AAIIIIAAAj0mQGDcYweE4SCAAAIIIIAAAggggAACUQRGJ3muOYpTlDJ83F8UJcoggAACCCCAAAII
pF5ge7NshsdyqnkODAyo6s0cGVXVk0rFQkVXVzfURl8r17dUfR6/dVpVTyplsrprebVqXdVnLp9R
1ZNKlaWaqq76WDq9zZ+aVPV5/sySql5aKxEYp/XIMi8EEEAAAQQOSODy2dXdnvOjulON7Y3ybhtx
Nh7/uv5ETxugnP3aQmOIZx9ZjDNUM3diIlZ5d+Glq5vu3cjbo+P6q0srC4XI/bgLTrfwrHnBCVQ1
y533HtVUa9RZvKKz3d7SjVU9UCoigEBbBXR/rdo6BBpDAAEEEDh6y1QowuZayZSLVTM0HP/Xdivv
Qm+uFkPHFZQ53cIVkAuP6gKb3JD+Hf75m8P9g+a5rAxOpD1twJjN6ucpryHN4g50NfWpgwACCCCA
QK8LxD/D6vUZMb7EC2w5AUCcRXvL08wR3aelViu623JkTuWS7qS0tK28Vcrps1bTjbeVZ1YKG/GO
4e7xVt6GJvW1wV+lrLvlSfrUvvaO3qK/bU76ZUEAAQQQQAABBBBor0DqA2O/qxbaE2ih1563a5/H
kD6PKZ/J0D6P0crXa5w/syxDjr1UlAGjNjCJPUAqIIAAAggggAACCCCAQGoFdE+yp5aDiSGAAAII
IIAAAggg0D2BDeUjK90bIT0h0B8CBMb9cZyZJQIIIIAAAggggAACCCCAQIAAgXEADMkIIIAAAggg
kDwB7QfGJW+mjBgBBBBAoJ0CBMbt1KQtBBBAAAEEEEAAAQQQQACBxAkQGCfukDFgBBBAAAEEEEAA
AQT0ArUWvmFD3ys1EehtAQLj3j4+jA4BBBBAAAEEEEAAAQQQQKDDAgTGHQbup+a1X9XUT0bMFQEE
EEAAAQQQQAABBHpPgMC4947JnhHNzI/t2WcHAQQQQAABBBBAAAEEEECgvQIExu31pDUEEEAAAQQQ
QAABBBDwCCxd3fSksItAbwlke2s4jOb/b+/NY2VL7vu+vvv6lnlvljdDzoxIiouTiKBkBUKgyIgA
y4gAQ0kAZ6Mh2qIoW4ZimdrBWLYgWw4RWXYYCUZkxUIcATagv+LYiW3JQ1Emw9AMaK2GzGXM0cxw
tjfz9vvuvuT8zqlP3+q6dbbqvft7gL6/ql/9avuc033717+qc0RABERABERABERABERABEQgncDL
X7mdV758baO2kbe98+oFmxe/VNS/UNBAsbG10sDqosnx4clFZUPNGy/db2jZa6aVqb085Bj38lBO
BERABERABERABGaGwB/55id75vLl336jJ98m8+z7rrcx79oe9fGF/+T4tNtOm8QrX73bxrzHNvVZ
2NuPrPe00ybz8MFhG/Ou7cHuUTfdNnHtRtp2ve0ra2276trffWu3m26T2E3kE3N62/Qr2/kiIMd4
vs63ZisCIiACc0tgveJX/Fuv7iRxqWqzrsHbr6ctK7zUx5fvpZW0HVSrdZOpKL96fbOitLzocD89
enJykuZMvfSlW+UDqijZulIQut7S0Tg+ShunDSV0eCuGpyIREIGWBJ5977VOP1Hjlt3JfEIIyDFu
cSKWlhdaWMtUBGaDwMrqUuuJ7O2k/YJ9+Vr6r+1np2etx2kVVtbaz4+OHt5P/YX/mCYaS1tiZV/2
U5ZapToJNrjUZVavvZAerVlcSnPe+nFSG58IGYqACIiACIiACMwkgbl3jB/eP2h8Ytv+Euw3vJW4
7CR1yYn1vZe47CT1y+VyYiTCxrq2kXYpPv2ea1Y96Uj94r55KT12kuqE3bmZFlkyMIuLaT/obF9N
d1KTTogqiYAIiIAIiIAIiIAIiMCYCKR5I2MabEq3sT0J+33sx0gZg+qIgAiIgAiIgAiIQEhgIVsc
cZa+mjpsTnkREIEpJrCcrdBLWRU2xVOeuKHPvGM8ccQ1IBEQAREQAREQAREQgaER+G++6YOdP/6f
/Eedk6O9zp/7+R8fWj9qWAREYLYIyDGerfOp2YiACIiACIiACIjAXBIwh5jjud/8XOfbv/UDnV/6
wZ/NVXKQISMpAucE7A7sqds9z1uZnVTaHU5mZ/6aiQiIgAiIgAiIgAiIwJQT8J3i2FTMQcZJjpVL
JwIiIAKKGOsaEAEREAEREAEREIE5IfCeb3yi08+zjCcNU51DHI4X51gR5JCM8iIgAooY6xoQAREQ
AREQAREQARGYOgJtnWJ/gjjIvk5pERCB+SagiPF8n3/NXgREQAREQAREQASmikA/DrE/UZxjRY99
KkqLwPwSUMR4fs+9Zi4CIiACIiACIiACU0VgUE6xP2lzkHGSfb3S00/g337htemfhGYwMgKKGI8M
tToSAREQAREQAREQgfkjsJI9n/Xo8KSviQ/DIQ4HhHP8p//6XwqLlBcBEZgDAooYz8FJ1hRFQARE
QAREQAREYFoJpDrFn/rs7yRN+R/8lf85qZ4qiYAITDcBRYyn+/xp9CIgAiIgAiIgAiIwkwT+5Du+
q9NZGM9XVZzjYUaPn3j6cve8Pf+7b3TTbRI3vu5KG/Me27de3enJN82sraefk9OTs6bd9Ng9+tSl
nnybzKsv3G1j3rVdWVvqptsk1jfT+bz2h/fadNW1vfFs+nVw3Odqju4gZiCRfuZmYPKaggiIgAiI
gAiIwPgJvPHy/QuDePZ91y/omipefynty+WVxzabdtFjd+ffvJnn797c7dE3yWxsrzYxu2Dz4hdv
XdA1VaxvrjQ17bHbf3jUk2+TOdg/bmPe+a/e/6cK+7Os3picYxuAOcgnhwedP/93/nLt+H1Ht9ZY
BiIgAhNHQI7xxJ0SDUgEREAE4gTWN1Y621fX44UV2rdefVBRWl10/cZ2tUFJ6dVEB8OaO9hr9wWa
IRwfnpJsLff30r7w7+4ctu6LCjeePY8WoWsi79/ab2IWtVlaTttBdZYW5MnHEHN6o4OTUgQyAl2H
eMJo/N0f+Bv5iJo4yBM2dA1HBESgIQE5xg1ByWyyCaT8cn52mvZN7+gg/QYiqxtpb7lHHttKPgGp
X9zv395L7nN9Ky0Csvsg3clIHexp4nVg/T39nmtJ3b6WsKwr7WpNGp4qiYAIiMBYCEyqU+zDkIPs
01BaBGaLQNq39CliEPty/2TifozUvRiGazVxP8ZZ4l4M6zN1P8bD+wdWvfWxczc9ivH0ex9p3Z9V
SHGIkzpSJREQAREQAREQgaEQmAaHOJy4Ochh9PjVr97pPPXOtO8zYfvKi4AIjJ5A2pqq0Y9TPYqA
CIiACIiACIiACMwYgWl0ijkF5hwTQUYnKQIiML0EZj5iPL2nRiMXAREQAREQAREQgdkkMCqHeGll
o3NylL41qAl9nOMwgtykrmxEQAQmh4AixpNzLjQSERABERABERABEZh5AqNyig3kc7/5ub55Lq2u
NWrDHOSf+s4fbWQ7KKPXEx/vM6j+1Y4IzBIBOcazdDY1FxEQARGIEEi930CkKalEQAREIJmAOcSj
dIqTB9pnxVE7x30OV9VFQAQcATnGuhREQAREQAREQAREQASGSmAeHGIfoDnH/TjIn/jQ9/vNTVS6
7TOpJ2rwGowIVBDQHuMKOCoSAREQAREQAREQgToCi9nzoU+P05+jXdf+NJf/Z+/5z6d5+H2PHef4
p//Zz7Vq66O/8out7Gfd2J58sn11fdanqfmNmYAixmM+AepeBERABERABERABGaRwLw7xf45NQf5
r33Xx3yV0jNKYH/3eEZnNvvTUsR49s+xZigCIiACIiACIiACIyMwcIf4LHM0Fsb7ldVuwHVyeNA3
Q5zjv/qPP953W2pABCDw+ov3OjeevUJWMpGAIsaJ4FRNBERABERABERABESgl8DAneLe5mcmh4M8
MxPSRERgBgiM9+e3GQCoKYiACIiACIiACIjAvBOYZIf4U5/9nc63f+sHJu4U4RwretzpPLizX3t+
lrK9/CnH0eFJSrXO1cc3k+pZpVuvP0yq++4PPJFUzyq9/OXbSXW1d/scmxzjcxZKiYAIiIAIiIAI
jIDAK8/fqe1lb+eo1qbM4P7tvbKiSv3CQmVxaeHt7Evw1Uc3SsvbFDz5dc2WQ77y1bttmu2xPdhL
2wN5583dnnbI/Nlv/SDJ4cgxL6Me1KROjo46SysrF5rLHeTv6nS+52/92IWyJgq7/lKOpaU0R9P6
SnWmXvrSrZShqo4IjISAHOORYFYnIiACItA/gTdfeZDcyM69+l/jY43vJjonB7vpTs3xUXF3383t
i18gY2NEd+9WmjNk9R9/+yWaaSXvvpneZ+r5TPTd8nktLKbVXk6M1Fine5FrYWml/gv5vbfSvuxb
nyurSyZaH4cHaZGlK5lT/O5vTIv0NHWEW09mBBWG7hDbHGbEKW5yOv63H/mbuVmqg9ykD9mIgAiU
E5BjXM5GJSIwMQTWNtPfqmW/8NdNbjHxl+T1jXbOjD+O1GVSaxvpfFJ/9f7aV25nS79e94ffOP3o
U+2dsPd+043Ov/u9m52zs7PG/fiGyw0cEd+e9N6DtJvNHB+mP7pm++oa3UvOKIFn3nOtdmap17o1
vL6Z9jm0t3NYOy4ZjIjAHDnEIVFzkH/gR3+6s/vkTlikvAiIwBAJpH+bHOKgBtn05WsXlzalfmFL
/aXd5nN0kLZsaS3xn7v1ee9WfMmTlVUdK2tpl8WVxy6yrurHL9vcTvsi/ObX0v9prG+lfXFKdTBs
vqfHaU6Nz0rp+SXwzv/gseTJp0aMUyNvqUs1bYKPPrWdNE+7K2fq8fXvfzypaj/LWVN/CEqL+RbT
S/3Ba3U97f+C9Zq6rDnphKjSbBCYUKd4UHembnKS/s7P/VRupuhxE1qyEYHBEKhfyzSYftSKCIiA
CIiACIiACIiACJQTMId4Qp3i8kG3K7F9xm0Oix6zxLpNPdmKgAi0J5D+E3D7vlRDBERgxARef/H+
iHtUdyIgAiIgAiLQksCMO8MtaUTNcY4VQY7ikVIEBkJAEeOBYFQjIiACIiACIiACIiACrQmMyCm2
RzbNwmEO8t/7wf9hFqaiOYjAxBGQYzxxp0QDmlUC2l88q2dW8xIBERABEWhNYA6WTbdm0qKCnOMW
sGQqAg0JyDFuCEpmIiACIiACIiACIiACAyAwoihxz0jP0m6C2tNGlrEbcI374FnI5hz34yD/rz/4
0+OeivoXgYkiIMd4ok6HBjMqAql3pB7V+NSPCIiACIiACMwkgSl2igd1PtregKuu31/+6Mc79mp7
fN/PF3e+bltP9iIwqwR0861ZPbOalwiIgAiIgAiIgAjMM4EBRYmnBSHO8fd+4mPTMmSNUwQmioAi
xhN1OuZzMDeeuTKfE9esRUAEREAEREAEBk/AHOI5c4p9iOYgb71xyVcpLQIi0ICAHOMGkGQiAiIg
AiIgAiIgAiIw4QTmyCFmn3HZGfn5j//3Scury9qTXgTmgYCWUs/DWdYcRUAERGDEBNY2ljsHe4O5
2c2Ih67uREAEppHAlEWIbZ9xfiOvs9Oh0tby6qHiTW78sbfFI/q3XttJbvPxpy8n1d1/eJRUbxYr
yTGexbOazWlv53BGZ6ZpiYAIiIAIiIAIiIAj0MIh/tT/84XOt//H39w3OnNoTw4P+m4nb2DBLd4c
kYP8F37xr3TH/bZ3Xu2m2yZe/NLttlVy+0uPrCfVs0pnZ2dJdTe2V5Pq9XNKyhzfpIGo0sgIzJ1j
vLY+hiknvpFHdhWoIxEQARGYAQI3nr3Sef3FezMwk+FNYfNS2hfE5dX0nVc3v5YWjXj3B55IBnH3
5m5SXVvpkHoc7J8kVU11MLaupJ1LG+Ti0kLSWBcX0+r1dGaO7CDuTN3CIe7pf1IzI3KQ/5fv/+s5
Ad9BnlQkGpcIjJpA+n+AUY9U/YmACIhACYG7b6Z9CbbmUn9J3kh0MKzPnbv7Jlof/awESXWI+nEU
UiMDt19/2JoNFS49skGylXzj5Qet7DHuZwna1pXxPw+VeUiKQAqB4yxqujyO5/rOmlPswzcHuWGo
0vYZpz76yRzkn/n1v+X3rHRA4HD/uLM64oCafSfp5399MIVGWXuEaT//yxp1MiVGcoyn5EQ1Hebq
WnFK+/ky++q/u9u0ux677cTlMS99OW05jnX+ROJ+ijs30794nyT+YL6yutTDq03mjZfutzHv2l57
YqubbptI/ZDsJ7K0e1tbANqeJ9mPl8D21fXkHzpSR26LCRM/hlK7VD0RiBL4P770Tzr/5Tf8qWjZ
UJSz7BD7wEYUPf7JP/Ejco597krPPYGZd4zDKMnKlC0Hu5O4HGzur2wBEAEREAERGBiB48PTLDKY
vpw6ZSBf+Z03Ov0sp07p0wJ1+CQp9VVnSARm1CG2fcr5DbjKsHExNowglzUjvQiIQDMCo/0v12xM
shIBERABERABERABEZh3AuYQT6hTXOnQDvq8mYOMkxy0XffYpsBcWREQgQoCcowr4KhIBERABERA
BERABCaRwMN7o996cnqadlfgJH4T6hD7cxmpc2wdlzjH/pjapm059SiPxSW5HqPkrb7aEdDV2Y6X
rEVABERABERABERABIZFYMhRYntk0yAPc45H6iBXRI8HOS+1JQLzSECO8Tyedc1ZBERABERABERA
BCaJwJAd4mFPNdVBTn4eshzkYZ9StT+HBOQYz+FJ15RFQAREQAREQAREYCIITLlDHDIcafTYOs8c
5H77HPVy6pCZ8iIwKQTkGE/KmdA4REAEREAEREAERGCeCEzBPuKU05EaPU7pizr9Ose0IykC80xg
5h/XNM8nV3MXAREQAREQAREQgYkjMKMOccgZZzV5uXTYYE1+1P3VDEfFIjB1BBQxnrpTpgGLgAiI
gAiIgAiIwBQSWMjiMfaas6Mugjxox7muvznDr+mKQGMCcowbo5KhCIiACIiACIiACIhAawIT5hAP
2hFtyoOIblP7fu3aOMjaZ9wvbdWfBQLz97PdLJw1zUEEREAEREAEREAEpoHABEWID/Z3u8Rwjsfh
rNog6L87oCEmmOMw+3x476DxDFbWlhrb+oZPv+Oan22cfu2Fu41tQ8Mnnrkcqhrlv/iF1xrZxYxW
19Pcs72do1hzjXQb2yuN7GbdKI38rFPR/ERABERABERABEQggcD6ZruvVseHJwm9FFVuvfYwqe7y
SvqCwaWlhnUn1CE2YP/i05/vfMcf+5acnTmLOI5JMBMr0ecwndVwaNZnVX8v/MFbYZXSfD9OWGmj
KhCBMRNo9+k95sGqexEQAREQgdkkcOQ5B5uX15Inub6R9m9t537zaEc4uOs3tkNVo/y1G1uN7GJG
z//ezZi6Vre43NCpibR07629iLZedenqer1RicWXEqMub3vXIyUt1qtvvvKg3ihi8ehTaddBpKnp
Vk2wQ1wGFmcRZ7XMbhj6UfdJf8zZn9Mvf/Tjne/9xMd81Uykn3zH1U4/UeOZgKBJNCKQ9g2iUdMy
EgERSCWwsbXaUzV12dHB7nFPO20y1xO/5L3x4r023fTYLiz0ZBtnbjx7pbFtaHjnjbSIy9aVdOft
YC/tvDz97rRlZDbnk+PTcOqN8rdvpvGxxi8tJp7QRiOTkQiIwMQRmBCn2F8y3YYRziLOY5u6g7C1
/kfVN/0w50GMX22IwLQTmHnHeG/nsOccvZ74i7c1sp34q3c/+wxSf/V+M/EXb5vnM++9bqL1ce9W
WjRhv489EXdvne8XajPgw4P0pWu9LmvzXi8/stHcWJYiIAIiIAIiMC0EptwhDjHjLOI8huXDzI/S
ObZ5MEfmPMy5qW0RmHQC6WuqJn1mGp8IiIAIiIAIiIAIiMBwCUyAU2wR4tQocRWccTmL1u+o+8ZB
tuXUOkRgXgnMfMR4Xk+s5i0CIiACIiACIiACE0nAnOmztC0l/nyG4Qz77VsaBxXHMSwfZn7UfY9j
jsPkp7ZFoC0BOcZticleBERABERABERABERgbARG4RCHkxuFk2qOKf34/aOT4+pTUVoEBk9AS6kH
z3SqW3z87WnPa5vqSWvwIiACIiACIiACc0XAHtmUcpiTiqOaUr+fOqPq9+//+N/uZ5iqKwJTS0CO
8dSeOg1cBERABERABERABERgHARG5aSGcxunYx6ORfnJInBykvb0icmaxXhHI8d4vPzVuwiIgAiI
gAiIgAiIwBQSGKeTOs6+p/BUjXzI7/vmJ0fepzrsn4Ac4/4ZqgUREAEREAEREAEREIE5JTBOJ3Wc
fc/p6da0Z5iAHOMZPrmamgiIgAiIgAiIgAiIwGgImJPa75F6g61B9O2PXfuMfRpKzwsBOcbzcqY1
TxEQAREQAREQARGYAQJr65sTO4txRnDH2ffEnhANTARaENDjmlrAkqkIiIAIiIAIiIAIiIAI1BEg
gpsaAa5rv6p8nH1XjUtl00NgfXNlegY7wJHKMR4gTDUlAiIgAiIgAiIgAiIgAhAYp5Pab9+2nPoj
/9OPMZUeuXVloSffJnPlelrE/8Uv3mrTTY/t6nqay/OV336jp502mSuPps3z+PCkTTc9tpeurffk
m2YWF9LPZ9M+psEu7SqZhplpjCIgAiIgAiIgAmMlcOXRjc7+w6PkMawkfpnd3TlM7vPZ911Pqvv8
791MqrfRR2RmbSPta1xqPZvgyXGfj4Q5O07iNIxK9izj7/hj3zKMpi+0aU5q0+ix2eHUXmgoQdGm
74TmVUUEZoZA2ifqzExfExEBERCB0RDwv4g+uLOf1OmDu2n1rLO7b+4m9Xnj2StJ9axS6hfo1LFa
nz5nyzc9llfSb7mRel7efOVB0+FdsFtdX7qga6LoJxJhTq4OEUgmMEEOcfIc+qyIs9vUQe6zu57q
4+y7ZyB9ZJ54+nLnjZfv99GCqopANQE5xtV8VDokAs+891q35Rf+4K1uum1iaTHty+yTX5f+Zf9r
z99pO8zcfuVeulNzlvgD/eFB+i/zb72a9qV9eSXtC7tBeiLRCXt4P/1OoKnLjlZW0+eZdAGpkgiI
gAhMIwE5xBfO2jid1LZ9/70f+pvR5dSL2fev09PELycXiEghApNBYOYd4/DX8X5+8U5dDpa6r8Eu
kb3E5WDPJC4Fe+2Fe8lX5tf9kbTlZ8kdqqIIiIAIiIAIiMDkEpBTXHlu2jqplY21LBxn3y2HKnMR
GBmBtHDbyIanjkRABERABERABERABKaKgDnEU+IUn52l74Ef1DnBSR1Ue23aGWffbcYpWxEYBQE5
xqOgrD5EQAREQAREQAREYNYJTJFD7J8Kc47H7SCbg+o7qaPchxz27bOxtC2n1iEC80BAjvE8nGXN
UQREQAREQAREQASGRWBKHeIQx7idYxtPnZMajnmQ+XH2Pch5qC0RSCUgxziVnOqJgAiIgAiIgAiI
wLwTmJIl02Wn6bnP/FZP0SREj21AfvS4Z4AjyMhBHgFkdTGRBOQYNzwtqTfeati8zERABERABERA
BERABBoSWFvfbGiZZjYpDnLa6AdTa5zOu5sThwAAQABJREFU+WBmoFZEoB0BOcbteMlaBERABERA
BERABERgTghMwvLqcaImeqx9xuM8C+p7VATkGI+KtPoRAREQAREQAREQARGYOgKKHo93affUXTAa
8NQSkGM8tadOAxcBERABERABERABERgVATnIoyKtfkRgPATkGI+He6Net6+sNbKTkQiIgAiIgAiI
gAjMFYHT8T1/eF4d5L/7Az8zV5eYJjt/BJbnb8qasQiIgAiIgAiIgAiIwFQSGKNDHPIyB3lhYSVU
Kz+FBK5c34iOev2Zy1F9E+XLX77dxOyCzZVH42O5YBhRHO4dR7TNVA/vHTQznGErOcYzfHI1NREQ
AREQAREQARFoQ2D3/mGl+eNPX6osH1rhEB3i09NOZzFxDaU5x3bMi4PsO22v/+G9pNN95+RhUj2r
tLGV9kPE9tX15D5VcX4IyDGen3OtmYqACIiACAyRwNrG6P6lrqwuJc1kfzd9+enScprncPla+hfS
u2/tJc1z+2r6VqTUKM+NZ68kjfXuzd2kelbp0Se3k+q+8dL9pHpjqTREh5j5/MZnf6vzx7/tm8gm
yXlxkH/2v/7LnR//1b+RxEiVRGDSCYzuv/ikk9D4REAEBkbgYD9tKc9LX7yVNIaFxYWkelbp6mNp
z8K8fzv9F+9Hn0r7Mnv79fQ+F5fSnJo3X32QzPbtX/9IUt23XttJqmeVUq+FhYX0a2iUDnEyGFUU
gWkjMAKHeBhI5sVBHgY7tVkQuJf9IOhH5sVldATkGI+Adeqv7P384v21xH0Ni4kRgbX15c6rX72b
RPOxt6Uvy9q5u5/U5+nJWVI9q7SazTXluFyyf6VJW6m/7m9srzZpPmpzKTHi8uYr6U5NdCBSioAI
iIAIDJTAE9m+ydT/KwMdSNjYlDrD4TSUFwERmE4Cad/wp2iuB8Em9FQn9VIfS8Hslx8dIiACIiAC
IiACIiACEQJyiCNQJlc1T8up9x8eddYT9zVP7hnUyMoIpK2tK2tNehEQAREQAREQAREQARFoQsAc
4j6c4rXVtBsxNRmabERABOaPgBzj+TvnmrEIiIAIiIAIiIAIjI9Anw7x+AbevGf2GjevIUsREIFx
E5j5pdTjBqz+RUAEREAEREAEREAEMgJ9RIfFTwREQASGTUAR42ETVvsiIAIiIAIiIAIiUELg6uNp
d8YvaW4y1VMQIX7uM781mewmdFS2z1iHCMwaAUWMZ+2MztF8Uu9IPUeINFUREAEREAERGB8BRYjH
x149i4AItCagiHFrZKogAiIgAiIgAiIgAiJgBI4PD3pBEB2WU9zLRTkREIGJJ6CI8cSfIg1QBETg
k7/6b6cawnf+2W+Y6vFr8CIgAiJQS0CO8AVEdgOuhYXZvXP2r/zEz3Y+9D/++IV5SyEC00pAEeNp
PXMatwiIgAiIgAiIgAiMmcCvvfpruqnWmM+BuhcBERgMAUWMB8NRrYiACAyRwI1nruatv/binVye
np7m8uCgWMK3sLSQ51/dezGXz17++lx+6ea/ySV/sF9dXc1VCwtFvZWV4hf9o6PsmZresbS0lOdO
Tk5yub+/n8v19XXP6mLyC//fv86VH/4v/lwu/9nf//2LRtKIgAiIwIwQ+JXO5y7M5Fd/8a9d0Ekh
Akbg6OCks7JW/H8VERGYJAJyjCfpbGgsIiACIiACIiACIiACIyOwtjq7S51HAdGWU3/vJz7Wuqvl
lbRFq0vLafUO9o9bj5EKqWO98ugGTbSWx4fFD/JtKx7spc/z7e++1ra7mbOXYzxzp1QTEoHZJUDk
9h/80/89OsnDw8Ncv7r62Wj52dlZrr98+XIu33rrrVyura3l8s6dIiJ97Vrxz4EIMeVEnMnnlbI/
GxvFP7+9vb1c9clf/41cvv/978/lhz/84VzqjwiIgAjMKoEvf/nL+dR+4Rd+YSqmGHOI7bOdz/mp
mIQGKQIiMFACaT+7DHQIakwEREAEREAEREAEREAE2hOIObhlrZgtr5jNc5/+Qkw9UTq7oZe9dIiA
CAyegCLGg2eqFkWgs+T2vPooVlbT99OkLh3a3ykiqP44hp1+9Mnt5C7u3SoirmEDzP/opPfLwG9+
8l/mpuGeYyK6RJDZQ8ye4gvtB3uJsWPP8fJy8VFJP4uLvb8pfuef/E/zJrGjPhHoz32u2H/HnuWw
/zDiTDkRcuoh0WOHJBJ+//59VLl86qmncvnmm2/m8u1vf3suX3jhhVzyB07Mm3EdH/cuzaIceySR
FsaHHnv6CeX169dz1a1bt3L5jne8I5fh+KhH+/BAH0rKsQ/LGS/XS9l4w/G9613vypsiQhb2Qz7s
j/PDdVFmx3jLysNxhuOr40e79MM4w3bQh5J6tBOWh/nNzc1cxYqNxx9/PM9/9atfzWXTdsJ+Qw5h
v03z4bzr+IXthuMKy8M87ytWmITzoD3uhYDE/umnn86bZMUL+rCfMA9nrnfKd3d3SfbIcFw9hV4G
frwfvKKJSbZxngc96EHfmdrucu07x5Nw1+tf/ujHk5ZTD5q12hOBfgnMvGP81LuKm/YA6pXni6WS
5JvKtc30PSgbW2l19x/2fhltOlaz275afXOgsrb2d3sdjzK7UL95ubiZUahvkj85Lm6k1MTWtznM
bt6Qejy4+yCp6kq2Jybm9CY1pkoiIAIiIAIiIAJDITBOZ3goEyppdNCOd0k3UovAXBCYecd4Ls6i
JikCc0JgfbX3Bx8iuP/8H/2TZAIWyXc3pe5wU+pF98l4WvHb1MnJ+Q86P/wTH837/53f+t2ecRAh
+9T/+09z/Wqxlbmzu3Net6dCTWZpqTdSHZovuXGfuHG7m253/vz3FOMri9w+9+mC34Jr/swb3unp
WfZjUNGTuzl32G32nM5C5bZwd8uXV4qCU/cbVlhOve/7Mz+Y1ymLfP3ap/5xt826hH+n00U3rmwK
tcfhXvmPgn/hIz+U1yeizXXH3ck/+dnm4/MHsrBQnKjD4mbnnSbjpL5dW8zv+/7MX8rVZef31/9l
MT6zX11f7ributNUhwUQXJ/78YUbnYOAUd11QQff/+Hi+nv++edz1Y0bN3JJBPM3Pvt/53muB/86
Oc3eZ+H7k3br5IIDFGvXr/uR7/6LeZbz65dZ+rnP/F+hKs/DDZ7ucuvahu/HbkEkEbtEqf/hDxbj
YwUFEWRWcvzzT/6fkRbPVWXzX9vo/QoIZz7a+Bzwz4e1Gv4o/f0fLq6/8x7Hm5oXh9inzNLqSYge
++NSWgSmjUD1t6xpm43GKwIiIAIiIAIiIAIiMFcE2Dc8j06xf6L9Jda+fhRpW049yccZv/hM8iA1
trET6P25cOzD0QBEQAREoJzAH7xRRGS3traiRo8UW1U7G6u9sZvdvSIes7nh9GeFXFle6ixnEeOj
IxfSXHBxG1e+s1+ETrep5/V6cnLexyOPPOKVdDrs4SMi1nER2BuPFlsO9reL5y/3VGqQIaK74kJ1
py6Us3tQdLDudjQcuf7WXISZvc91Xdx4/HxO2BINI29ysVPYnXbg5UqD6mGk6sAFZVeIyLtq7Nlm
ryMRWVfcFU8VgcZuZJWI6YrbA36U7YVeyaLye25r/YqLdGenOXrsukjtZrYQ4WAvGLzVcNdBtHKm
5K7llD95o2jjzHFZcJz4Pra4WPA6cONbPC3sjy8VLSy662/Rgdvdd9ftemFHpHB3/zDbY9jpLHG9
ugGwt/zKlSu5hj2ijO/GEwud1bWFzsFJ0e5acC8E+j29UpRTD7nvGDGuFbciAM6chwduS866ex8+
fPgwb6L7fqDBQPL+zYLa3cN/n3WVFxIFn2U3nz33BlhdLvS8H9xwM26F/oTr17VXNj4iwzeKrdHd
3sMIP9cj9IpeuualCbP3o7JrqwWAo6NiRQF74WmA90e4QsBt3e6wsIQ2GSd62tnYLGIjfI6AY9FN
BP2ae+77gbvr/8JpsfTl4Cjtc4z+JYdHQBHk4bFVy7NNQBHj2T6/mp0IiIAIiIAIiIAIiMAYCeCo
DmoITZdMD7rfQY1f7QyPQLhFYng9zWbL3u+yszlBzUoERGD2CBCBCmcWRoopJ1JMBITIzlG2Gffs
OIvXuNAOe4Kz+E1e9XIYUaFBpIsoPnjQezM32iGygzl31T4fR29MqUxPfSKwS27z4anbFL1OKMyN
e9NFnB7suj2sLtJDO6EkEk0kcNNFKEO7buTNRT675b3T6KrDBJFiIlcEctlbTISTCDJ35w3b4fyh
DzlvBPcCZEFAGNncXC/40M4F6SKyrAAIy4kwsjeXciLCa6vFdbTpnpN9cFSEionsH7q9vMvdn6gL
kLaSwY7N9d4bDHKX9T2LJGfhwO3Nwh5e9M8KgTCiSDmR4mV3IlaWC2AP9ooQ+vl4qNEruT64znkD
WcTeP7ie4Nfl5SKQ5KlDpHjJhWjziOfCaeeE0CeGTi4RkXfX/bGLhPM+Ylxb7okAh8cFzzBSHDR7
IRtbNWFGXIdEZKm471ZGXNsu7omwd+CWJrjx7h0V1wUPKrDTwHvb2iBSTHvwC98PIT/eV+BiXOhZ
AcF5f+hWmlxaL643uCHpfydboWDHhrswDg7L9+NTZ5rlZz7/+51v+5ZvmOYp9Iwd57ipM91TWRkR
mDMC3X/HczZvTVcEREAEREAEREAEREAE5oKAOcg4ycOa8KTvMx7WvNXu7BBQxHh2zqVmIgIi4AgQ
cTpxoZ5wj7EfEbGoF88dph57LY9LQkXLWUTLgoll5UT2OCHcvZc87SMZD3nsLkgXob6wty+I2BK5
IzJJO2HECT13nyUSSKSNyDl7ileCSDF69hqHeRdo6jAO7vq97h5/R2SM57qGEU4iYkTmGG9XOh6c
Z/REysgTKSbfVPIkuXCPJxE8ItyHbqsle4vZW7viOiZSHPbb3evr9sJSfuQim3uHRWQxXAlxdTuL
8GXXLdcfKxbgSDuhtPZOsnO44VYYHLvNz8cnzSLFYYSW982abezODq5L5h/2T2SbemXX44EDbwFK
P1rc3RvsQqJEfrsc3R7j7uPO3Tec7iMBC5wdF7DtZE/fyw9WHJSNh3mwdz1ckcD1ubJcPJpxsVNE
ps8jxbTgzmfwBMf8Zt9Z0eWt3q9kvD+ozfuBfNl4D91CgzWac+8T9g4fu9vEX75URLR3qeAahkt4
/e2583Lm3mBLLDVhQJJTQcCcY0WPR3OqNrdXs6dQuJtKjKZL9dInAUWM+wSo6iIgAiIgAiIgAiIg
AiIwSgL9OLejiB6PkoX6EoFBEeD3xEG1p3ZEQAREYGgEyvYW02E34uv2KBJJXGAzqzP0I7NEr6yI
yNMmm/9KIsYLWWRq4Sz7XbGknPHQ9oXn/7rI1cPD4vbRKy5iyN7OMPJKe0R8iDCzZzAPX2PkSfYa
ogojTkQ8KUeCix2uRIQpR6I/sH3a2UGEij2yB2zudRWIHO+6PYobZbeLdvYIIsBI9NzF+cFuobm0
Wcg1t5m5e7dxtwf1fDi9e2FpjwgZdyFeCyK52BFBJtJI4Iy7UGO3e1AQJALHHm1+kS5rn/pEihnX
GpHG7Lo739/b6XCX9ps3b1K1Uu64u7RvbRRm4bjZA3ttuzAg8kmElsbhudQpIiJElPfdXl8i9Zub
xYlhRQD8aIf9tZzf7vvAwGZ7jI/dkgbXLNUyWSyVWHMXLP3bXcbzw62kYNwb665gnz2/hRnPo3a1
OnzOXL16NVdxPRApXnWbyh/sFUsF6P/ouNh7u+Kuv6Xs/u127B8U1xvtBAs8sgh+bnZhb3GhPf9b
9n7Fgsh99kmWq3bcHna31Tm7m7u7Xb2rwMoErk/asRUxdmys9tpTzucNXFkJ0C1XIkqAZcz9OLTR
hvtQDmNMtpz6ez/xsT5GpaoiMD4Cc+UYv/L8nfGRVs8iIAIiIAIiIAIiIAI5gQN3U7K1NX7JmA8w
k7iUeRLHNB9Xw/hnuea2NtlIbn7t/vgHNOYRzLJj7GIyYyas7kVABAZGgMhYWYNEiIPASOeyC8nY
XairDiIn7NEts7VI5Em2P5NIKXZh5MmP6mGTSxcyIiLoAsddEyKxXYVLEPFZdCHKJRdaC8fL82TR
l0V0iODRDxE3IkHokcynG2F08yDySaSYSBQRYuqzB7PjImvsdSTyWrZHlj2cyPP2in9hlzZ7z+t9
dzduInxde0LhKJy0iPNhFkXN9+5mun23l3LRRfzCCCfV4Rpeb0SGT1wkfcU9z3fThRbPXOhzt2zr
mfvvReSW64R+kSvu7uQ837iMH/bWzqrtL3YRSvZAE1lnjzR7kIkUc3dpIt20R0Q4vF5W3Inadc8B
5/nU1Lt0yT24GYWT4fm1PdR2zR+75z3z/tx3m4TXiaC7+sfugeHd65NvAe46PWHzsctzvXNPACKy
fM4QgQ8Xhhy6TeVEis+nUTTM3uBuxNZF5vO9xJkxEeLzekWKiHnIAbvw/YoeyR5vns/dbSd43jX2
4ecEevauk0fCP7xsef9iVyVxhqts5qFsGJHafrkN0jl+5PGt2uHsPQyvpNoqucFx+A+zWbXcatF9
RrSokps+uNu7yqRN/d0HafNkhVibvrD1nV10A5Z8ug642fE3N8uO8fjpagQiMAACr/3hvQG0oiZE
QAREYHgEer7EcbMn1kjXdHvibjZ2fOw8VmdvP8SsZs9wWsAxdj9sHDtHjx8caL77w43rd/+h+8HE
2S+4cR27/rLb7lG1Wro9CWeufpnxCb+IuP6OnQN/7JbkH7ubqR1H+l3Otm8suCX/Pc9uKuvM069u
FF/l1jaK+ZwEjvBayePXGK/9yNfmWOo+/6l5rWlziO0Ge2U/iDWfdb3lJDrI9aOut/i5D/5k50f/
4c/UG8pCBCaMgBzjCTshGo4IiEA5AfbshpHZsEYWZypU7otsGCned5G8dfeFlT2cZZG5cM+v7dG0
aCDPkWXv7r7bu8hzeRlX6B9sbhd38WWvntsam0XzCv29h8Wv0+7msZ0t94WXX54PXcHyYrGHlb3R
PJ/2Ls8ddXcfrovosBeZvZyM2+SqPeMUjs5wyz0n+dA9t5b6zHPVRTKPDgvHhL2PRLT89v30zs6O
n+2mzWmwY2OjkES0OC+dBecYZHu/7cv+qnMMzpyjteBCZ9xN99BFbI+cXM3qrdqdnl1IdNFF4jc3
iiWe3IX67t273TFZgvN94EKB+w/jjhbPtd3vFHtQGfdJGGqmdcd71d0FnMgzxeZ/mcN45sqJyBL5
ZLzYExlezq6HYzYGZ4V+GltfYsqsepxfq+82oRccs7tdu8g4e/h5fjjPVSai/corr/jdlG7Vt/e7
vZa5G7rt688OItrL7rxyPfD5wJ5+d5PqzoLbM8sKCjpfDPa4E5FljzERZOzPI9UFEfxgIqlra8Xz
oPfdEuFt974lMosTxOdNeG+BA/d44MubxfXM++s4eD40KxUYF3e95x4Lm+u9ji4rOe7tFO9H7j5/
31237F3nvNFuKGmflTmUlzmQ0+YMMx+Tz336CyN9ljHXRtv9x2ZPXX/8SouACKQRkGOcxk21WhAI
v0yFVQ/dDWpCfV3+KLGetXu437v0sq4vyrev1C8PwjaUqZHfx94WX3YYth/Ln7I2L1ZYo3tw2925
pcYuLH7tD3udh7C8Kn/pmltzGBhxc6NA3c3i+PDFuFtAAo/N5VliaPb2KBccjxMKqOckkSWWOGMf
mCkrAiIgAiLQkoA50PO2z7gMkTm5bZ3jsrZS9OPuP2XMqiMCgyQw847x3TfPv9yvcMvUBIIP7qTv
L3jimcsJPXY6X/vK7aR6VmnrsotItWzBohApR53zm9Km6ohASIClkkTqwnLyRD646zORLMqJrBLx
oZzIzp6LdHJ3XBxi+n/kkm1uXOgcuT2L7PGk/WvXrpHMJXejJQK35iKaRI6I2BweFXeTZTw9jWSZ
7p5TFwle7i5p7I0Qsfdyo+FNbVyAtwMPImC2wnLRXm686B+4H5b4SA1+dwiH3X2+7YWCQEHkPVB3
szxHddmNx61M7ZY/PLAfOU67kUvOW7ZRtWtjCQKFyy6kmEdwsygtKw1WXeR4/6A4H1Q+v0txYcB5
J/AbRu6pd0ESgu0d1rmZmx/nj72+RO7trumr2QZX9gYTQeS5tkQ+ya8Ee3G5DjdXiwKu4/MBFKlN
d4Lpp3s3dGd47JYKhNfrvd0ilPzYI6yF6G358uXif+KtW7d6C0pyRNw3Vh0wF1EnUhxWI4J6xNLk
4PxjTwQ5jMiGe4yxX3fvO/LwOHJLvU+Oi+tlgaUH3A3dRXz54S7c+56f12xqfA7w/HD6IeLO+QxX
gHD9dSO5DhOfgwdHxQ/B2+vFdRt+LnI9LBYLMrLRFxcoPzjSLpJxIcMVCugl0wgQAR6ng5w28t5a
Wk7dy0O56SDg/v1Px2A1ShEQAREQAREQARGYRALcDG8Sx6YxTR8Bc5Bxkqdv9BqxCEwngbTw4GTP
tew3+LGMOjVaPJbBqlMRmHAC4Z6/MNLDXaK5WyyRrDACcuQ2IVrA0MVG8pkTQSJSTESXdoj4HB5l
mwGtrguVhnuK79/vfeQBex65iy+YaZc8ESgiPeyF5rHK7K3sjppQtLt5DncPZg/h7sH5ihn6MElE
DB0360auuMiYRYptdXkYESZSvOTWuC+7kOSBu1sve6eJsMOJ/pDu5s/ZHtPeiDfloSRSzF7HTbcn
e++wWNHDBgnOdzdiHDYU5OG+524eeh7RK/6dcJ3xPF7yRDxZ6s9KBJrnLs/diKfjWrq32FXkObK7
+8X5O3YR0hX2FGcrGo6zn7XX3dJ/9tyzhxeeRODtcrVjPwuxn2T7qrnuyiLFhXWnw/uBmy2dAtgZ
bLrQO/yOXWT20mbxrjpyKyBoj/cJ40PPZUxEnOtnY20ji4wvZ+MtzsNtd5tnzg/vqzW3lKEsgkw/
oaQ+EVnKOb/kL8pifqtLxbi6d8F2EeID937ksoY37+v7u8X1zh7kfL72PnOfRodu8zZ3zaZ/zid5
9vZeCIgXw8tWQBTjo19WXDAetoSEn0vUO3Xz4P3khtcJP2cYj+RwCNQtb9Y+4+FwV6uNCBQfMo1M
p8NoFiLGnBTkdJDXKEVABERABERABERABESghsAoo8eTHqVeZq9LDTMVj5QAPhhypJ0PsrNpjRjX
ga8rHyRDtSUCIjAiAuydZE8ld+Gl+w0X6iXigZ78nnuuKhGT/G6tWTj08LAIqYWRTeyI4B27uxjn
EdQsKsOeZPpBhpHt9eLmxhR35aG7qy8RYSI7PJ82u+9vbtuN2LiQzZ7bDHzm7r696iK2m86eDohA
kUdy1132eqLvSrfH1QJPNlfuOk1kym1ZzEqLyNfSSbG3kj3ItAPPMPJOJJm7CnM+qXch7/Y+wut8
j3YRKfbbtxuocb7ZYgrXrp6OnDw/j8V1QPyaiDaR4pdffjmvQWT2sccey/Ps8Qya7UYA11d6/yVx
XpZdxJXILPV5jvJqN5RajIjn+dp5sV+1eX4w7wMisux9pj3kpa3lzml2N3Xbh23H3Z3iAry8VfxG
bnu07dgKHu8T7i2F9+XNot6uC4kvuaUFPP+Z84jkeoNf3ln2h8jqkbvAeJ9lu+o7J+6O42Ybvh/P
zorxl0WKuc5O3R5g9h53+yURSCKxqFkRQAT3oXv/ne85Ls6vrRCwPnmud3g3du6GTqTY7m5vB/kL
e/zdBVwWwQ4j3ZwXODF+JO8D8kT6991WelaaUB7aow/t0EsOnwBO67TsP9Y+4+FfE2Psofcf28WB
1JVfrDEBmmmLGBvkNqDb2E7A6dAQREAEREAERGB4BBbdI8qG14NaFoHZIPCZz//+xE5klBHkiYWg
gY2LQBvfqq3fNq45dfud1ohxdwJKiIAIzA8B7n7KHkXu/sxTlsKIIBGULbf0ir2JEDtye/mIbBIh
IZKCHRGp3YPi/wERE+7Wi12ZdI83vlBMpDgs4O6z6PddpJrfBTeC0OyZC7lxV2TmYZFFO8oiTuFe
6PXiMaxFpezvbhaQtWDnpY3iN9R9t+cQO5fNInnFvxKeu0qEmYbCCFZ3z63rj/Ex7zBPRJZIHO0i
ad+idXbumD/P7+U8Yx/K/DnX3qD5xZgVe0RkGR8RRVYwXGjPhZx5/u6Su0sx1yfn6eysWBHAigT2
gHJ6D1wEdc1FjlfdZlCLMNsNyYlg0j97UBkv+e5dx93th7lJ1OaGG6hbIRBGimk3lPAm0h0+D3xl
qWj31EWmeb9yvV2/fj1sMs8TKab90AhOvB9534Z25Cl3s8x49R7h3loi2eEefK4/IvTr7gRxV/Nj
90awlQD0aT3x3G6uR64HRkGk2MrzaDvPa8bASSLDXH8UszKAzz+4scKE6w175svzp9eWi7uSLwYr
TbrhB/cBwnOQeR/ll1FWxnVK+5KjJ2AOskWPtc949OzV42wS4P//pM6u7S8NxbfWYjZ+elLnp3GJ
gAiIgAiIgAiIgAiIQBKBYUSPWbKdNKCgki2n1jFzBHwfy0/XTdRs29jXtTfw8kmOGBs4Ah51E59o
yHWDV7kIiEAzAkTqsCZiQj6URFD4JFl0d/cNIyncDRc9keZufVePPZX37Tmt2afTZrB3mAhiOE63
9bI7vLKIDgaM4+794qPt8qWihJsCEyEisk0EaMM91/j+XhEjIyK1u7tL05WSoCnjXcsiuivZi7so
r7v22YtK5JhIMY1TnzySPZ9drq6AiBh27EnlbsuMq1vOCeU/hPsPYFtJic6ZLXtpu3crL1lGbBEw
a4IIMf2E/4KIwFIeRvDQn0fSigHuuL3ta6tFnj21Zy5SSwS0Wy+4CzXXw6l7Hi79EMHs5rnNslPs
7OzkKe42jt2Bu001EU+uf8q5K3RX78bZLQ8S7Cm+slVEIPfdXcIDs9IsW6nD6yKsAKdQH75feX9h
t+LeMEdu5QWRU8qRrFQgXyaJoB4eu3sTcD0GFYhwn7I5Pygna+/jE+8iZyVAeH7D64/6ZZJx8j7g
OuI53kT8Lwyf95VruLsyxum7kf31MAZfNhLpRUAEpoHAYvY/nrvRJ4y3jS/WxjZhKOlVJjFi3BSW
2TW1TSekmiIgAiIgAiIgAiIgAiIgAiIgAnUE2vhnE+fHTVLE2OAEv1PWsY+WTxzk6CilFAERaE2A
PcZEdoiIEZAhQsJeuPNIYdFVGFmySI196IQRzmUXWST6SMT0QXET5CyKGv+o4m7URDqZoBcMylVE
bojIdSPA7rc+xnn1crwfIsW0z2+E7KUkUkw5dwPmubtlkfaQQ76P1fv5FA7cjff8eab0VEjurtur
Nc6981nkdr+hocsTgQ+L4bfs6t/fK+5OfGV7pbOYbQjN9wxnleAU7k0mokg7Wy70fX+vuD3veSAs
/u+EPbNhBG/ZRdTZc8q4t90ebcaz4U54eF3AjecVUz+UFnm3F3e35v2AHe8T9syiJ2LPdY2eCDHX
XTdyG0SK3Rbl7K7Va3nVQ/ec4lN3d3Ly7F3lPLACoNtfkCCCHqjzu77bHcPv7xaR2e64QsMgz3nt
qt08yiLF8OJ64/x267sEkdwwUszzqveyzwd7NjD3ICCyeuxONM9H530P97CfpnlWLPD5Rz32sK9k
9y23o3te3XO0w29aXJcXrgvXIHq4rmULA+ydzPPgnZmECJQSmNq7U8f/BZTOM1bw9e9/PKau1X3x
X79ea1NmYJHf1GN1rdVKkAEQykc6qHZSp92tNwmOscHo/bbUHV5Pog6aX04a2dPQrGe2LhdfWmZ9
npqfCIiACIiACIjAaAjww4o9v+0s+JFrNCNQL6MkwI29BtXnMXt+XIMP7rhfmhM6eOKZywm1Op2d
u+7ZZEm1VckRwLdCmtpPx0DVlVOnqR32A5fjdowNQFOnuMyuDGKZfuAQ1aAIiMBoCNy+fTvviD2p
Dx486OmYSDGRY3vSqx1EPLgrdVmEBDsidtgR6aR+3qj3iRTeBZjIcTdSRijX7R3N69ufbkTOayxT
Exkj0nN5o9i72ekc5lXPI7VFPSJWRBBzo+wPevJIxld2d2Ds9rPuTrIu6P/wpIjcUW57kKsOIvbc
fbt7N2q3mZZIIxHs7e3tqua6ZURWO+52wUTo8v/NGdNuRLjL11V1/xWOXYSTBjl/55FiSuKSyGJY
GkaKKV9eL369d4HDDntPDw/dXandA3aXgz3Cew539/S7BldWljtLSwtZJLC4vnk/0N+F8XF5OXnc
BVgoWLGw4ngdufIFdzdtnpv9+PWtvItjt0eZu37T77ksQK8sFl8xeL4y5URoya+4C4TnVG+433bX
s8j0YjbPjRW3u77kv/qGi4TiuPG852UXomW6m6vF++jI7Q2m//CeAN33rTNYJNTrvjEtOy7UP7I3
SXZsZXhsPzcrGfj8INKMPZK92RaJZR+wlRVnFatzyfs2HN+ZCxlz92y20pNfd+OGD19hya+4Td5l
e7jZ68x1+2D/JF9lw+fU+QhnL2XXanh9zN4sNaNJJPC+P3qj00/UeMhzKvk05tMl2ntZndC4qV1Y
byD5cTvGKZMwYGXQyvQp/aiOCIjAEAi855tulLZ68+X70TIc02hhpux+MXSfADggfPE7cw4pjmJX
n9Xl0TXWdndpL98oTVlyHB2UfX29WAFHBL9yP2iffk8D/UHhB3f2a34/ZL5hEAf9xRH1asz5sANJ
6eLSWeco81aOnGNw7B6/wydwtmo0P86CVVtdM1fOUlmmx/k6/2GAHuOSfk+Oi3HiP3LTJvCYQ3yS
3WCJm4fwhb7bavc64JeKosRc6Xz5WNF817xpYnWj+Fe6utG0huxEQASmgcBzn/5C59u+5RumYagT
P8ZPfOinOh/9lZ+e+HFqgK0JlPlepi8ra93JqCpMqmNsIGNfUar0MJuqk8AXdAbvy0uPpH3LWt1o
tT/A77JzcpSG742X4g5NT+Mlma0raUu/+fJb0myl+j3f+ERleVnh156/U1ZUq+86A7WWvQY7d9OX
G115dLO3sRa5wxaOn99slePr26Wk2TPJ3mIijWFb3butugIik9gRGSaPxDFdWymuSZ5DSvkF6Rwt
9hSz548IZLhX8ch5qmvBx9uBew4qdw/mbs/rbi8zES4ioeHdsJkPESryXdn1IIsZsCc1jOTxecQP
EdZ/4cwGnwvu05nIFJFtIkjcXdkFQjsW4bRjebFwSHler/PHu89ZDsdTjPbi3yWe9xr8EnBwlMWC
ebhyVo15bKwWtw/fc3dL7kbW3fkz/meni501BhR0yXlkTzERJM73qvsI23Ce8d7hXtBCkaVf9mpD
9aELlRK5jVbOlEQ+F+2Xh2zsiy7CG0YQGW/YDtcD+mMXaSQgip5xHrlyIrJc19gh+SEkbIffS8II
cdl5JvLf3SN7dNhZtFuNlxzhnm7GveZAEoHmeuR9VNJcrXrP/VDVs3Ikq8XeZVspepqN99B9Fwx5
hB2wcmE9+7yx995BNl//IEKLjpUAZecXOySfB/tu9ejmWsGSH7QgaxFgOy65JRPsjQ5/uOI6vbxp
z83NrsdgaSz9Ss4OgUEvp54dMpqJI8C/Mcv6aR9QW71fd+TpSXOMDR6f1XUwzNaHHUuf+U5F6p4E
GwhfGOsGFZan1gvbUV4ERkng9RfvjbI79SUCIiACIiACIiACIjD5BPC3kDbiMO3n62bUxraurb7L
J80xDidksOxV5Sz7QMvSYbvKi4AITCEBImObm0UknHzZVHb3io+Edfe8YSJmYYQzvEsskeId9/jf
7l2ewz2rLv+Oq+/Jh/CvTj+fy/C5wUQCiVyF40XvtmR2i1n6zQcgd4XFgD28224TYVkEJ4wwEfEM
x7m5VqxSOTktNrceugf8hu0SiYInkeILXN1Aj7JIrn9w00sioJQRgSUfSgJU3B152+3d3XERr63s
QcQWYGQJtd3R2A4ixbR3vke70FhU/CwLmm24UPyO3V44O7ixZxjhJHKMPHQRubu7RaR4zf1nZSl7
N7DtrpdVN64TFyHk+dPhygbmW4wyG58LTR5na8lt/y/8w/E9fPiQKlG551YGrQQRctrj/C4TmXd7
almxwHVIpHjR2bElgO0J7FVmEPBiT3TZ+SZyb3terU/O43236ZoINnu6OZ+rboVF+L6hf+SqC/Ef
H/bumac8lLx/w0gx54cvHnZ6FrJrCT6HLtp98fnYRQ/w3M32TNiP6Fxv9M91Hb5/WfHBChrsu9IN
aMUt2Vhcdys1DouCy5vFBbp/UOip191j7D5wOJ+saNlwD0C2FTm2GoP3IfUlRUAE5oYAH3s24bJ0
DIbZ+vYxm7HqWOk07EHUQYiVh7ow74+5rKxM79dVWgREQAREQAREQAREQAREYIgEbJ+xjqknUOZb
leltwmFZmI/ZhKBidUKbvvOjiBjbRAh4pA7Yb8PSMTjoKEem9ql6IiACE0aAPaNEin/0Yz+cj/An
fvLHcomeYROhIqJGeRixwo56dZK7wz69/c7clC0TtE9EG7sPfeijuR2RHvpnjzSRW/ShHREj2md8
7N0kAow+tKM+48GOu1J/5Lv/Yq5iPOFe0lAf9kv7Yb/0QwTz0qVLuYpxcF6QnAfsef7yR777v8vr
sceS/mm/qWR8jJd5UR/uYZ56N2/ezIu27PbD2fH448XzKb/nv/2BPB/+oR79he1zvsN6zA8utBPa
0V7YTji+D3+w4FdmH7ZLf4ybcs4L/YURS+ypjx3XE5J5we/Df7oYH/2E7aAP5bVr13IVd6unnHHC
AX0o6QdJOZyefvrpXPUjf/Sv5pLzz7ywbyvD8XEdwgd+4bjoh3I+Z3j/Ul4maY/6ZXneZ3Ao4xi2
U9ZvE/3BwX5nbc0t7WlSQTYjI6B9xiNDPS0d4V8hbdyWDg+/3MpiNmGduvwg2qjsYxSOceUAIoU2
6TJH2i+zdAjIz1u6uKNEpBOpREAEREAEREAEREAExkdgcTH9ZqHjG7V6FoG5JmC+Vehv+UCsrKo8
tPXzY0+P0zE2aL4DHOabwomdANPZ5plmG4ia9iQ7ERCBsRIgMssgfve3fy9PEjm5c6e4azh3iQ7t
9/eLvaNEmojUEhkpiwSxF5KI5nn+X+X9E3khos34aPf111/PVUTKzusXXwqJoBKpCfuhvbAe+jJJ
JJkIJHb37xd3kb9161auQlKOZFzkmSfjQI8sGzflRNyojz3lSMoZJ5LyUIbjhGNoR4ST80A5/XHd
oOfu53X86L+sX+ZJRJD20ZNHlo0Te8Yb5qkPL84r7dE/9evGTXtI7Mu4hOMJ80RG7969mzfJ+488
4+K65X2NHkm7L7zwAkPrkZRzvVEY1g/15O/dK24+CMeXX345L6I+dvRDvkxiF9ZnnuH1RTvwDq8r
xgc3zjP1yvqjPJSMi3pheV2+bb1pc4Y/8/nf1yOb6i6CFuV6bFMLWJNpar6V+Vhl/lfKqK0t/wjz
ftlQ06PaYxxOom7Cfrmfpp06nZXbSXO3RKGapAiIgAiIgAiIgAiIwCgJmDPMa5T9qq/BEDh4qCdV
DIbkTLRivhWOMROq88tidrE62JmsK/dtB5YeVsTYJuNHg/0Bh2V+3k9bHfIm/Ze17efN1g50ls4d
43/xD//gh7/jg//e3zaFDhEQgekk8B/+iWfzgf/7Nz4wlRP4pV/6pakctwYtAiIgAqkEpi0ynDrP
eai3mj0JAud4bevKPExZc4wQ+Ee/+Ns/lKlxjM3C97v8vOnDvK9zxV0b8tiU5dGbDG39suT0qCPG
4STCvD+RqjLfztJm69uTt3D/75pzbEY6REAEREAEREAEREAEREAE0giYg4yTnNZCp6O7U6eSG1+9
zCn+kax3279mvhV+FgMK8+jLpO+zhTZhWZgP7QeaL4vq+p3EbHxdVZoyX1o69jInHT1pk2GavG3O
M3uT2CF9nUXF17KXPaDTbnlo6ZXsZTa+He3SBtL68MvCMZIPZVatOx/SMenrLB0e1q4OERABERAB
ERABERABERCB6SZQ5ej5ZaRj0tdZOvZiubOVkfalpXlhQ95usGUvc4ItQmw3aNlz6eNM+nakkdyc
C4nepN8PaZNhGp0vM7PcDmllHE3SMVt0XTnopdQ2sEE7crRpkpf1EdMzMexM2ok4dNJOrM05dIhx
gkNp/aCzNC8cZT+fFXfL0fs60ibtMBsOP226MI8dsq4cO0kREAEREAEREAEREAEREIHREzA/pOoI
y/18LG069KSR1g/OJ7pYHp3Jupc5t+YII6lL+1lRfpA3aYcvKfP1udGA/tDXQJobtGPcz6BsYjh8
pEMZth/CsLz/MnvL24m0E0saZ9ekOcnWL9IvMz15S/MyHWlsMlWPLpZH58swbXkOa1uHCIiACIiA
CIiACIiACIjAbBAwfyR2+HrSSLO3NK9YPnRcY3l0JnlZm0R4TaJHomMsjAFpY+HAhjwSfSitHB22
Y5PDdoxtom2cO9/eT/uATM/L2iaNLLO1cjvBYR3TmaPryyybH/7YLW0vbMnHbNCV2Vjj2IRpy/uH
b+frlRYBERABERABERABERABEZgeAuaPlB1+GWmk1bE0r1jefBnKkb7O0uTDtNlTRt0ynfXN4dta
2g5fV2h6/2KHbW9pdc6vW22ZUDoIx5gBtnXgrJ7VQTL8srzpY2Wm8w/sUqRdEOb4UtfatTR6y/tp
y9thurL5W33K/Pma3g50Ra74i73lsCsr9/VKi4AIiIAIiIAIiIAIiIAIjJ9A7Du8P6pYua8jXSWt
rOxl/gllfhqdyTK9b1OVDudjtv5BXdPFykLbmJ1vU5YO2y6zq9QPwjGu7KCk0AaPQ+hLzKvKrYwX
DiT5Kum3XWZnNn4ZeZN24ZjTbIelrW+caPRW1/SMizT6UGamPRcJ9cyOAx15k365r1daBERABERA
BERABERABERgMgnEvsNX6SjzZVna/BM7Qmc3zFv9pq+8wYb2MVtfZ2l/7JTF9Nj5NkNPD9Mxtgnh
1JWl/Qn6NqaP5ct0pq960V6ZDRcSjq7Zmc7ySGvD0jYnHGHyyKr5WptWbtIObP10rAxdXkl/REAE
REAEREAEREAEREAEpp5A+B3fz8fS6EyGaXS+NP8klo/pQ51fz9J2hLqyfGFd/MUm1FXlKaNfy5el
sR2IHKZjnDJAm7TvMFobgEBveV7ozK7qwL5MWl3K7MKww3eKTYczbGWWt75NZ/WQpuNlesbn6zJ1
rrdyO6yMdK5wOtIxSbuxMulEQAREQAREQAREQAREQATGSyD8fh+OJlbu68I0eV9amjw+jEn0SHS+
JI1NnQzHX5b328EGHXmk6SfmGIZjbBP0HTc/76fLIAAIh5G2TO/XJ99W2kUQHji2Vham0Zm0sdjL
bOxAh2R8jBl79FbHdJbnwNbypP1y7HyJna9TWgREQAREQAREQAREQAREYDII1H2fZ5S+nZ+2cvK+
rEpbGS/zT0ibJI/0daStzH/59duks2bygzp+3tKhnvJQmh2HnzZdmMcuWQ7DMS4bjA0+5tDV6Zk0
dS1PHdJNpJ1kO3B8wzpWThlpX1r/oUNsuvDF2ExPOkt25256//Dzftq3CdNN7cJ6youACIiACIiA
CIiACIiACAyfgPkBTQ7fzk9bXfIx6essXfYyf4Yy0kjT+2nskFZWVY6dL7Mq3f4sbQflpHNl8Mds
YkeZPmbbly7VMWaA/Thofht+2p+Q6f0+yJskbfbky6SdUJzemI1fTjqU1o/pbDx1L39s2JrODn8+
lkYfllm+7PDbKLORXgREQAREQAREQAREQAREYDwE/O/4VSMI7fx8mCbvS0s3eZkfY3ah9HVl7VCn
rNz0HNhY3tfH8uiw8+taWcpBW63rpjrGrTsKKtiAY85dOBEcx5i0JoFHW+RD6dv6ZXaS7cBptryl
fUnbJsMX9UJ9ZtqdH2Wms8Py/uHn/bRvE6ab2oX1lBcBERABERABERABERABERg+AfM5mhy+nZ+2
un7e0uR9iR5dmRPr60kjra6l/bzfblU6q5Yf2Ph5S5veDl9ii66wOP9bpj+3GEJqkI6xTaCJw9bU
zp8ucKhr0teV5U1vJxgHFjvT2YHez2Nv0uaDo2xpXqazg3rokVZmaTt8Hfm8wP3BDl2YR+/LJja+
vdIiIAIiIAIiIAIiIAIiIAKjI4CvUtVjaFOVx4+x9rBDh6TM8uanoEf6OtImSVPPz8fqoquS/ljM
ru3RtE5Tu9r+B+kY+53ZAM15Q/plYdqfTOjwUebr0dG2SV70Sd6kHX7eTjQOsen9vKXpy2ToFPsO
sZX7tuR9XWbSY+PnLW0H9kWu+BvT+eVKi4AIiIAIiIAIiIAIiIAITC8B/BR/BqGOfJW0Ml7WFmlk
6OSSR9bZUR6TYX+xvOnsoH6RO/+L3mTdgQ2yzr5V+bAc43AQNnhz9pBWzoR8JxCdldtBGXokbVne
T1Nu0l52wquc4Ky46/xa2trCGUais3Jrz/L+y/R+3tJ2lEm/LDf0bMn7knZ8ndIiIAIiIAIiIAIi
IAIiIALTRQBfJTbqsMzPk45J0/GydkmH0neEScckOqvvp2N5vw+/bz+NjensII8stMXfUGd5O5BF
bkh/R+UYpw7fh2AOouVDiY3JqrSdWJzkWBqdL60vHFPSocxMehxj8lXSL7M0B32RD2VdeWivvAiI
gAiIgAiIgAiIgAiIwPgI4J+UjSBW7utIV0kr88vJ+9J8nFgePdJsytJ+/bK0zdPK7PAl9kXJBP4d
hWNsEMyhQxoGP215O0wXHr4jSB3sYtLX+Wk7uaFTbDo7iAwj6dMkL7MjHcqwjHxM+rowbXkO60OH
CIiACIiACIiACIiACIjAbBLAVwln5+tjaXS+tHQsj96k7+yGecpM+mnqoyPfVNrczNY/YnX9ckv7
dUgjQ9uB5QftGNuAcer8tD/gUM8kqRfakrdy35Y07Zn0dXYCcYatDStDh0RH3yZ9BzmWNx2vLNlN
m86OsAxdXuj+YIsuzKM3WVXm2yktAiIgAiIgAiIgAiIgAiIwuQTwVWIjDMvK8uhNhulYHjuToYNL
HokteST6WBums8O38fN+GlvT+Qd1Q52fJ+234acpT5b9OsY2mH4ct6r6YRkTt/7CNPmYtBOKsxtK
A2ftoWcuJnlhQx4Z06OrklZmh7UTHjFdaGP5pnaxutKJgAiIgAiIgAiIgAiIgAgMlwB+SV0vMbtQ
R75KWhkv65O0L0NH18+TrpN+e2Ha7zdMW94Oq1N2VJWV1fH1fdXv1zH2B9I2bQP3HbxwIlZWpfPL
sauTdqJxgkNp7aEjTXuW919ZtidvZXbUSd8mr+DVIR+z8cuUFgEREAEREAEREAEREAERmG4C+Bn+
LEKdnyddJa2Ml7VLGmm+kB04v6aPpdEhqd9EWvvY+ek6ndnaYXZjOUblGNsEzWkMpU2ayeNUms4O
bItc8RdbyilDj7STiJPrS7OPlVnf2FmasZg0e3S+vkyXmffUt7wd1A3TeaH749v4+jDd1C6sp7wI
iIAIiIAIiIAIiIAIiMDwCeCX1PVUZufrY2l0JsN0lc7KQofXz5NG+vbokPRTJcP5m214UB89NqGk
fChyGI6xTQDHzU83nQAArA3Sfl2/bfTYIU1P2k4cTq9JO3ydtUe5pWN59FaXNNLXkfaln7Y64dFU
F9ZTXgREQAREQAREQAREQAREYDoJ4Kv4o6/S+WWkfRmmLV+mM33o3Pr5WNrX0XaZZE6xcitDj11T
afU4/DS6vmQTx9g6jTlvbTumHaTVD9Omi/UVszNbO8zeyu1AWtpOHo4wetOZve8I+2kro3/SyKwo
LyMf2lFeJa3MDuoWufO/ZfpziyLV1C6sp7wIiIAIiIAIiIAIiIAIiMDwCeB/1PVUZhfqyVdJv8zS
vGwMpJExR9fX+WnqmCzTx/ownR1WL3bQLmW+HWkkNqmytp0mjrF1TkMxh6yqjLpl9dBbG6SpY5LD
yugHHdLX24nCGbZyykxvbVDm21Fm5byyZDddpvNtYmnT2WH1Ofx0la5JGTaSIiACIiACIiACIiAC
IiAC00EA/yQ22liZr4ulTYc+lg7LsDEfiHQo/TI/XWUXlvl5m6uft7R/+Hk/XWbj6y1dVqeurKed
po5xT6UGGRtczAmMVfVtmZRfF11YF5uw3M/bicQZtvqWt3qxKHHMzmzphzQyK7pQ5uv8NG2Yzo4w
X2jL9ZRLioAIiIAIiIAIiIAIiIAIzA4B33fxZxXqySPNlrRJP00Zer/M15GOOb9NdbRBH7G+sbEy
jlDn18emTLaxLWvjgn5YjvGFjpzCJmFOYSitGB1pk3aUOZFlQEK97wwXLZ47yNY2DjF2pgtfVs/X
+XnSVdLK7LA2wiOm823qyn1bpUVABERABERABERABERABCaTQOinhKOMlYc68lXSL7N0LI/elzFn
2MrL9H5dPx3Oi3zMxnQcpENJ+VDlMB1jm1BTp8639dM2ecA0BWEnDmfXr+M7vn65r7fxhi9rw9f5
+VjadHb4cy9LF5bnf327c61SIiACIiACIiACIiACIiACs0igytfxy+rSVo5NLB2WYVMm65zhuvJY
u/75Yzym89O+TSzdxjZWv1Q3SMfYBlnm2PllpENpg0RH2iRtWlnTw06U7/yG9eqcYeuTl9UlzVjI
UxaTvi5MW94O2ity8b9NbOI1pRUBERABERABERABERABEZgUAk38mZiNr4ul0fkyTMfypkt5tXWK
4U9ffj5M++MMy8j7Entfl5QepGNcNwAbdJWTRzmTM1vS1rZf19dbWeyIOb9lzjJ9Wx/hy9r2deSb
SN/G0nb48yg053+rys6tlBIBERABERABERABERABEZgFAlV+TVjm50k3kWbj25H3pbH086TbOsHU
888NOpN2kCedK0v+UKekeHDqYTvGNpGYs4e+TNoMKSNtkoM2zabNEXOWrS3as7boF71JdFaOnnRM
+rowbXk7/D4LTfxvU7t4bWlFQAREQAREQAREQAREQAQmgUBT3yVm5+tiaXS+9NM2f8v7r5jOL09J
W5t2hHULbaEP02ZrRygL7flfys81A0wN2jG2wVY5crHyKh2Tp03yIDB9qKOsiaRva8d/hXprizFg
F+osbwd2YTqWN50dfp1Co78iIAIiIAIiIAIiIAIiIALzQqDMpwn1fj6WRmfSTxtHdL7e11XpQ7tY
PuyD9nw9aZP+4duij+koM1lX7tvWpgftGMc6tAHHHL9QTz6U1qbp7LB2SOcKp7N0qKccSbvWhv+y
8liZrzMb5kBdX+ensTOdHXX5wqr3b1int1Q5ERABERABERABERABERCBaSZQ57vY3EKbsryvJ23S
T9Oer8OmTEe5XxedL63cDl9naTvQFbn4mCjD3s+Tpj3yA5dtHWMGVOW4mU3bcuqE0ibs6yxP26Zv
clCfen6dsMzPmz15q0N9k37ayuxAF6Zj+TKd6Zscfl9N7GUjAiIgAiIgAiIgAiIgAiIwOgLmR6Qe
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
7JrqbLgxW6ZRVYaNL9va+3Ur06NwsNr2UWdfVh7TN9UZpJhtld4HW1bXt0lND7Pt1DGpngiIgAiI
gAiIgAiIgAiIQDsCQ3PqsmE0abvMpo0+ZhvTGZkyPdTqyrFDtrWnXiM5KqcrpZ+qOm3LyuzL9Aav
qqxJeaMT4Izq+mrTlmxFQAREQAREQAREQAREQASmi8Agnb66tqrKy8pi+pgO6qll1A9lVXuhbVJ+
lA5ZSl91darKy8rK9AawqqxJedVJqGu7qq7KREAEREAEREAEREAEREAE5pNAP05hXd2q8rKyMr2d
naqyJuWxM1zXZqxOa92onbXU/urqVZWnlgGzqj42vmxr79dVWgREQAREQAREQAREQAREQASaEGjr
MDaxr7JJLbO5VNWtmmtqvao2o2XjcuJS+m1Sp86m33IfYl1bvq3SIiACIiACIiACIiACIiACIjAK
Am2cyTrbfsttvnVtxJik1Im101g3Tucute8m9QZlYyCbtNUY+BDaa9O3bEVABERABERABERABERA
BKaDwKCdw6btNbEblE3sTDRpO1avL92gnb62g+mn/6Z1B20XzrFp+2E95UVABERABERABERABERA
BERgUARSHcqm9QZtF5t30z5idfvSTYJT1+8Y2tRvY2tg29r3dTK8yuPq1xuCkiIgAiIgAiIgAiIg
AiIgAkMiMC4HsG2/bezb2Maw9ls/1mZj3SQ5YP2OJaV+Sh0fbr/1/baUFgEREAEREAEREAEREAER
EIF+CPTrXKbUT6njz7Hf+n5byelJc+wGMZ5+2uinbupJGEefqWNVPREQAREQAREQAREQAREQgeEQ
GIeD2E+f/dSF4CDaoK2+5KQ6ZYMa16S109fJUmUREAEREAEREAEREAEREAERSCAwKAd00tpJQBGv
MijHMd56f9phjG0YbTLLYbZNH5IiIAIiIAIiIAIiIAIiIAIi4BMYlLPqt0l6GG0Po03GmyynwZkb
1hiH1W7yyVBFERABERABERABERABERABERgzgWE5rsNqdyC4psk5HMVYR9HHQE6cGhEBERABERAB
ERABERABERCBPgmMwlkdRR99Yhjf44j6Hfg4HNhx9NkvJ9UXAREQAREQAREQAREQARGYbwLjcEzH
0WdfZ3nanb1pGP80jLGvi0iVRUAEREAEREAEREAEREAEhk5gGpzNaRhj9ETNktM2S3OJniwpRUAE
REAEREAEREAEREAERGDCCEytM+xznFVnclbn5Z87pUVABERABERABERABERABERgHARmwhn2wc2L
Azkv8/TPrdIiIAIiIAIiIAIiIAIiIAIiMAgCM+cIh1Dm2WGc57mH14HyIiACIiACIiACIiACIiAC
ImAEZt4Jjp1mOYcxKoVObMrZqEQEREAEREAEREAEREAERGA6Ccyl41t3quT81RFqXy6m7ZmphgiI
gAiIgAiIgAiIgAiIQDsCcnDb8ZK1CIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiA
CIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiA
CIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIiACIjA3BP4/wGh7Ce6vUChNAAAAABJ
RU5ErkJggg==
"
>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[8]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">Image</span><span class="p">(</span><span class="s2">&quot;images/diamond.png&quot;</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt output_prompt">Out[8]:</div>


<div class="output_png output_subarea output_execute_result">
<img src="data:image/png;base64,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
Mx0xM/O1AUm2HYAuwnxfPqsAE2SBnE+Yuf25K1W54F/0F7K6BfrcwVW0AAABnWlUWHRYTUw6Y29t
LmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0
az0iWE1QIENvcmUgNS40LjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMu
b3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJk
ZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczpleGlmPSJodHRwOi8vbnMuYWRvYmUuY29tL2V4
aWYvMS4wLyI+CiAgICAgICAgIDxleGlmOlBpeGVsWERpbWVuc2lvbj45NjY8L2V4aWY6UGl4ZWxY
RGltZW5zaW9uPgogICAgICAgICA8ZXhpZjpQaXhlbFlEaW1lbnNpb24+NjE0PC9leGlmOlBpeGVs
WURpbWVuc2lvbj4KICAgICAgPC9yZGY6RGVzY3JpcHRpb24+CiAgIDwvcmRmOlJERj4KPC94Onht
cG1ldGE+CngtFjsAAEAASURBVHgB7N15mCVpXeD7N/PkyX2prC1r6apeqC66sWlpmn0HtUEarwwK
F0XUe4WZcQaZAR0u+Oj84Yb4OOL2XL0X5lEcdRgRvSrgACqgAsNmQ7N0U93QXV1d+5L7erYbv5P5
ZkVGxomI93e2OBHfeDo7It5410+czDq/98SJMIYFAQQQQAABBBBAAAEEEEAAAQQQQAABBBBAAAEE
EEAAAQQQQAABBBBAAAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQAABBBBA
AAEEEEAAAQQQQAABBBBAAAEEEEAAAQQQQCD7An3ZH2LHR4hpx8lpEAEEEEAAAQQQQACB3AnUcjfi
Ng6YIK4xLjaNbTiCAAIIIIAAAggggAACvSlAQB1y3vIc/OV57CEvBZIQQAABBBBAAAEEEEAAAZPL
wDkvwWFexsnvMQIIIIAAAggggAACCCDQaoHMB8tZDRizOq5Wv8CpDwEEEEAAAQQQQAABBBBwFchc
oJylADJLY3F9YZIfAQQQQAABBBBAAAEEEOiGQCaC5F4PJnuh/73Qx278AtEmAggggAACCCCAAAII
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
jLr7a59jXKq5T9RIH4t9nXtnoG2rVIt7dyMj2b1o25svu7+2dreeLGVU+dxqrYkZGk7WMV+ufu/N
uiyFgtvs79R+90nHaxc3f799zSfanJh2H5dUfPW8+wS/lJs5Pikrp+Xy47q/P6NeIKJZDt80ZU4/
eFVTNJNlrpxbNL3w6M9M4ndjUHH/bIT80zd/bdVM7XX8BKMbY2txmwTGLQalOgQQQAABBBBAAIF0
Cdx42z7nDn3zXy44l9FeeXhFceWhdK7hXYdjen5BcfVhJ688jOl+w8ML19yuFLUVDRTdJrtsuT37
3YPHsckhW9xp7XoVrFQedx+AqCv+LiknsJwGlbLMuldBygZBdxBAAAEEEEAAAQQQQAABBDYFmgmK
82pIYNyCM39FeflRC5puexXlDd0liW3vGA0ggAACCCCAAAIIIICAs0DUJ8XOlWWoAIFxhk4mQ0EA
AQQQQAABBBBAAIF8C0R9WkxQ3Pi1QWDc2IYjHRbgF7XD4DSHAAIIIIAAAggg0FGB5YX1trc3NBJ+
Gynea0fTh6tFl+EoAgg4Cmge1eTYRNey80e2a/Q0jAACCCCAAAIIhArY4HilVx4pFTqKzibyibHP
W3snQV8VbCKAQIYENI9qytDwGQoCCCCAAALbAmvLpe1tNhDIogCBcRbPasiYtLfYD6mKJAQQSJHA
fXd9f4p6Q1cQQACBfAucf3Qu3wCMHoEeFiAw7uGTR9cRQAABBBBAAIFeEzhww2SvdZn+IoBADgQI
jHNwkhkiAggggAACCCCAAAII9K7AxPRw73a+R3pOYNwjJ4puIoAAAggggEB+BAaKhfwMlpEi0CKB
/5+9Nw+SLbvrO7OWzKysqlf1tn7v9fJ6V2tBNJIlmWG8KTz2BHiIifH8McbCkm0hGc+AQAYLDNgQ
gAGDZxwYDRNhYU/MwIDHMRETMTMOYxurLbCEEEIICa2tVm+vu1/3W2uvyq1q7u/e8806+atz7nIq
l5uZ3/Mi3znnd35n+9x7s/J3f/ecu7RcHVBLbGYWCdAwnsWjzjkHE6jVuZF7MDxWJAESIAESIAES
IAESIIGSEpj6X/lnzjdyo9+8vZ9b11bstLp2Nnf6vkfP5taF4ktfu4NkobjVDBsjtnov1JkoB3R3
2D0s3I1UCJ3b/Y+dK9zf4WHYGG++tFO4L6mwt70bVO/xt1wOqtfcK77j5O3rYXO7eN+ZoDGurteD
6t24tl243tXXFT9HpJPXXizel9Q7d2lZol5oB3639BpgggRIgARIgATGTGCxNl/ptMJ+P4156Ox+
xghMvWE8Y8eT0yWBYAIhRnFwZ6yYi0C1lv4o5cJi+EM/zx6E3Qhs149yjV0rfTWgv7WF9PnrPpC/
Ugu7edI+Gt0Pt+X5sLlV5+YwzZHEnaPix3sxcIztwBuPwSAWiv8EOjA3D7c3Dgp1e/lq2GZTN14q
1o8MKvSG9krgTceXv363EAsohzzy2g68yf/atS10WyheK+BcsRsOcbSE3gj1OVluvRJ209qeB9Mk
MGsEiv9VmDVCnC8JkAAJkMCpCDxSz//kzqk6YmUSIAESmFACjdVaZX+nNbDRX7xvNbWtaxPwBOJh
t/iNOZn02vnim1Tt7xR/Yk76Cr2hcRRw01H629lqSlQ4LEfnV9FwdDh7ZmK4u6EoXeqTAAmQAAmQ
AAmQAAmQAAmQAAmQQAkJ0DAe00F58A0XxtQzuyWB2SMQsr549ihxxiRAAiRAAiQwmwQaq9zNejaP
fP+saRj382BuRghceWh9RmbKaZIACZAACZAACZAACZAACWQRoGGcRYjlJEACJEACJEACJEACYydQ
rYdtWjf2gXMAJDCBBObmR7vZYxkQ0TAuw1HgGEiABEiABEiABEiABEiABEiABMZGgIbxKdEPcgfB
Uw6F1UkgJhD6DmPiIwESIAESIAESIAESIIFZJUDDeFaPPOdNAiRAAiRAAiRAAiRAAiQQTKDTOgyu
y4rlI0DDuHzHhCMqQKDV7BbQpioJkAAJkAAJkAAJTA+BF75ye3omw5mQwJgJ0DAe8wEoc/f1xuy9
2LvMx4NjIwESIAESIAESIIFZITC/MHubP83KsS3rPGkYmyPTbfNRiLKepBwXCZAACZAACZAACZAA
CZAACQyTAA3jYdJl2yRAAgMlcHR0NND22BgJkAAJTBuBjZv70zYlzocEpo7A5m1ep2U8qNP/rGzO
H9KhP7hD3/G1u9UMOh/uuf9MUL1XX9gsXC/0UerNW2EX+6UHi88ttK/QL6RqNexeUgjLdrR+ut6o
Fj5uL3z5VuE6UmH5TD2oXusgbJ13yDXQaYX1tbJWC5rb7eu7QfXmwk6TStHrdCv+wxrdLMj5PWdP
ZqvVsrO501uLxf9s/MHuVu72ofj2lTUkGZMACZAACZAACZDA0AkU/4Uz9CGxg0ETKPpje9D952kv
xCjO0y51SIAEJpOAGNPrCwtBg79QLX5DSTpqB9xgCBpgVGlxbjLWzo2Syf5h2JKmaiDL5YDz6/zl
lfiQP/jE+UKH/tb1nUL6UO52w5hs3TlAE7njxkrYdRNy41cG1dxr5x6brRiy6eZB1NdSwPwWA2+G
T4KzZZSOFjl+rvOkud+xDy3TJDB2AjSMx34IOAASIAESIAESIAESIAESGB2BbuewsrAY+HjTgIbp
MpZ10/s7xW+gHB6GLbsKvRFVD3iSSuZ549q2nm5m/p77VjN1XAo7G2FPqoYycY1hEmTjvSImgRDH
SAIkQAIkQAIkQAIkQAIkQAIkMNUEaBhP9eHl5EiABEhgcASuLi8PrrEpaemLe2Hr0Kdk+pwGCZAA
CZDACAmE7n0ywiFOdFc0jCfo8C2O+ZGXCULFoZLA1BO4/pzZUO+/+tapnysnSAIkQAIkQAIkQALD
JkDDeNiE2f7MEwjZKGTaoa1fbEz7FDk/EphZAqPcsGtmIXPiJEACJEACAydAw3jgSNkgCZAACRQn
cLBbfIOR4r2wBgmQAAmQAAmQAAmQgIsADWMXFcpIgARIgARIgARIgARIgAT6CFx5aL0vX8ZMyE7W
ZZzHIMe0erY+yOamti0axmM4tOevJO9BHEPX7JIESIAESIAESIAESCAHgU477D3SOZqmCgmQQAkJ
0DAu4UGZ5CFt3tqf5OFz7CRAAiRAAiTgJfCp1/0lb9mkF+xzOcekH0KOnwRI4JQEaBifEiCrzw6B
apWXy+wcbc6UBEiABEiABEiABGabwMLCbP32na3Zzva5zdmTAAmQAAmQAAmQAAmQAAmQAAk4CEy9
YTw3N1fJ8zl7z7IDT7qoud9JV2ApCUw5gd3N5pTPkNMjARIgARIgARI4LYGNm3unbWLo9ZfP1Ibe
BzsoN4HFcg9vtKMrahyHGsaRrR4UQr9U7n3kbFB/C4vF75uEvp/22tN3g8bYaXWD6i2tVAvXO3dP
2Lt3u52jwn1JhXbg3FoHYTdsDg+Lj3N5LeyPyP5OK4hJdJcrqF7otRq68UrI+XXl4WI353a3DMNu
2PEOAbnZCetrP+DckvE92zwIGWbliaX0a/VCtfj1HzQQViIBEiABEiABEpgYAjSMJ+ZQcaAkQAIk
QAKDIHC77X5ndHW++M3A24E3C5YD+pK5L88vDAJB7jbaR2G78lbnio9zM/Amz/pC2E+ZtcXi9fai
43b71d3K81+5nZuhKF66/0whfSjfeW0XyULx8mrYTcuNgA00z15MvxHlG3joZl9veNsVX5Opcjlu
IeFgz/19kdZWtbZQWV0v/nqc0Ju4lbB7xpVQh8t9I3S48NVLaWcaywZNoPhfhUGPoATtrQR8eZVg
2BxCIIEQb15gV6w2gwR4fs3gQeeUSYAESIAEhkKg3ggzVar14jfnZAKdO8VvBobe0Lj84FoQs2tP
3wmqd+XhsHdQhz6dGTTIMVcqfnt8zANm9yRAAiRAAiRAAiRAAiRAAiRQBgKhhnEZxs4x9BOgYdzP
gzlDIGR9MeGRAAmQAAmQAAmQAAmQAAmQwCQSoGE8iUeNYyaBARMI2XhrwENgcyRAAiRAAiRAAiRA
AiQwNgI0jMeGnh2flsAsrXk4LSvWJwESIAESIIFhEAjZsGsY42CbJEACJHBaAjSMT0uQ9UmABEiA
BEiABEiABEjglARCN5o6ZbesPiYCt67vjKlndusjQMPYR2ZK5Ocur0zJTDgNEiABEiABEiABEiCB
WSKwfiHsdWCzxIhzHRwBGsaDY8mWSIAESIAESIAESIAESIAESIAEJpAADeMJPGjTNuRrT9+dtimN
bT6tg87Y+p62jjvt4u8ynDYGnA8JkAAJkAAJkEC5CFx94ny5BjRFo6FhPCEHc/vOwYSMlMMkARIg
ARIgARIgARIgARIggckisDhZw+VoSYAESIAESIAESIAESMBP4J0Xvr3y5//sN1e67f3KT/7rn/Ur
TknJYeeoMr84NyWz4TRIYHwEpt4wnpvP/qLY2255j8DymZq3jAUkQAIkQAIkQAIkQALlICAGMcJT
v/Opyp/7licrP/HtPxqLvu+f/xiKGJMACZCAk8DUG8bOWRcQphnNB3vtAi0lqheuhO0SvbJeL9yX
VNi4tRdUbz/lZkFag0sr1bRiZ9liNeyJ/tDXGoSuzbj+3IZz/FnC0Jsr1fpCVtMnyu/e2D0hyyOY
z3EDydXO6tkllzhTtr9T/NqRRtfOh/V3dHiUOSatEMJf2tjd8t9o033Y+eZesfXhvfd4d4vVi/tc
KH5u2WMtmm4fha3XfrXdLNpVrP9cs9jSk0fqYedV0OBYiQRIICawdm6psnW32LWahs42il16v/S+
n4nFNJBddCibBQKvPr9ZufLw+ixMNXiONIyD0bEiCQyPQJ4nHYbXO1smgdkiAEP6gVrxG5CvtsNu
hCzPh90QbC8Uv8kjR3N9ofx/7re63aATL5RldS77iTI9oIWozsp6rVL0JnfoZn5vfPu9egi58k9/
9rVcelrpoTdc0KJc+XYr7Nh1O8Vvmr38bP9N6u98x1/LNUYowUD+zp/+fohS49XIgA8Ju4EOhmaA
00XGdz7A8bI6YqdLmrMpjfHaeb6yKY0PywZHoPx/KQc3V7ZEAiRAAiRAAiRAAiQwJQSKGsX2tH/9
H/zTSl7j2K7H9OgJ3P/o2cKdvvDVO4XrSIVGwJOPUq/3FJdkCoTXXtwqoH2seu5y2BOoITexdjfD
nt46Hu3kpGgYBx6rkMeoA7tiNRIggVMQCHmM+hTdsSoJkAAJkMCQCZzGILaHJsaxhFk1kGuNxUpr
P2A5jg2R6aknIMs5Z8U4DnuWa+pPAU4whEDI+uKQfliHBEiABEiABEhgNgkMyii26YmBDCPZljNN
AiQwWwToMZ6t483ZjphA6MZbIx4muyMBEiABEiCBUhN419uLrSUOmQyM41n1IIcwK2udh15/vhL6
OHVZ58RxDZ8APcbDZ8weSIAESIAESk4gZOOtkk+JwyOBqSEQahT/9ic/H8QABnJQZVYiARKYWAL0
GE/soePASYAESIAESIAESGB6Cbzrbd9RqcyN56cqjOPv/p9/eHoBB85sebVW2dsJ25E/sEtWI4GR
EKDHeCSY2QkJkAAJkAAJkAAJkEBeArFRLMpH490c6p99789X/pe/9VN5h029CSdwFPZGvAmfNYcP
AuO5DYfeGZPAhBC4/lz/exMnZNhTNcy182HvkpwqCJwMCZAACUw5gZ5BXLJ5wjj+Hz7y4yUbGYdD
AiQwKAL0GA+KJNshARIgARIgARIgARIIJlBWo9iekBjIMJJtOdMkQAKTT4CG8eQfw4HPYH+b60YG
DpUNksAQCPzRN/2lIbTKJkmABEhgtATEIJ4Eo9imQuPYppEvPc1v6lisLeSDQK1SE6BhXOrDw8GR
AAmQAAmQwGwQeLTO5RKzcaT7ZzlpBrE9enqPbRpMk8DkE5j6NcaXr67FR+m1a1uTf7Q4g1MTuPrE
+VO3wQZIgARIgARIgAROR+C/fuy/OV0DOWsvVBuVbns/p3aYGrzHXH8cxo+1SKAsBKbeMAZoGMjI
I/7a515DslB878PrhfShfOuVHSQLxbWl4oeq0+oW6gPKF+87g2SheHerWUgfyjsbB0gWiq++/lwh
fVF+4Su3C9eRCkeHYdsUtpthx6DWKH68ZZzn7lmRqHAIfe3C1p3iPzaWVmqVpZVq8TGO+BH/w8Bj
HnrzpegGb/EZeXhYqXQDdmy9c6swf6mwVa0F1avMzQXVe65ArUeuPlxAm6okQALjJDAqo1jm+NTv
fKry577lyVNNd6FWr3Rb2b9xaCCfCvNMVpY/j9wJuzyHPuzXd3nGz5GQAAmQAAmQQOW5a8/3KDxX
CzDgG8u9+oUSOX4su9r75GLxm0NxO/OBK6DmAuu5Bp9HFnLDJk+7g9SRG0tFw95uZX+rVdm4sVeo
ZiN672tICL2Zu7Qcdn4d7LZDhllpHuS7Qfcdb/nvgtqftEpiIL/7H30oaNhXRux4qQc4XmRih90w
h0Go8yUIJiuRQEECNIwLAqN6OQiEeIvLMXKOggRIgARIYNYI7O+0KqHG8bSwmhWjGMfr1/7eP46T
oQby3/uzf7Xyj37nX6K5mY5fCXxlZrUetiHW0nKYeXT9+c2g43TloeJPoYY+FVr0ph4mNCvfX2FH
HpQYj4RAyGPUIxkYOyEBEiABEiABEiCBFAKzZhBrFKEGMo1iTZJ5m4Dsgh1qHNvtMN1PYMTPVvV3
zhwJkAAJkAAJkAAJkMB0Eph1o9g+qmIg/8Y/+EVbxDQJkEDJCNAwHuEBCd14a4RDHHlXm7eKb940
8kGyQyeB5n7YWjRnYxSSAAmQwCQQ+Na/EI/y2tN3JmG0YxujGMQDNYqP8q1hHuaEZQOuQQQxjmkg
D4Ik2yCBwROgYTx4pmyRBEiABEiABEiABGaSwEAN4ikmSOM4/8Gt1rnyMz+tdM31i410hRkv5ZkW
cAKEvqopoCtWIQESIAESIAESIIHSEyizQfzbn/z8qV/ZNIwDAOP4XT/9wWE0zzZJgAQKEqDHuCAw
qpMACZAACZAACZAACRwTGLpRPDcdfpxu270EiY9XH59LTJWTgOysPwthOr5pZuFIcY4kMCQCezPy
ZTckfGyWBEiABGaWwF9+w387/LlPiVGcBxQ8yD/waz+RR506JEACAyYw0x7jr33utQHjZHMkQAIk
QAJjJVCrjbV7dk4CJDAgAmIQz5BRbFP7J+/+yUrzczP9E93GwTQJjIwAr7qRoWZHJEACJEACJEAC
JJCfwNJyNb/yNGmW1CAe1M7UeQ7VL/+PP1ERA5mBBEhgdARoGI+O9VT3tLvVnOr5TcLkqtWFSRgm
x0gCJEACJEACbgIz4CX2rTN2A6nExjENZB8dyklgsASmfo3x9ec3vMTWzodtWd5pHXrbTCuYm59L
K64cHR6llrOQBEiABEiABEiABKaOQEk9xGXiDOOY64/LdFQ4lmkjMPWG8SQdMJ/h3G6Gvdi+HvgI
1ubtvcLYQt8xt35P2M2J5dV64TFKhZsv7QTVW1oJe5xtsVr8oYzDzlFFPkVDfT3scr57s/jxlrHN
LxSfW1xvLv0GkW/eC4th/dUbYVxWzy75hpIqf/oPX00t9xVevO+Mr8gp37ixV3noo/935eKX/72z
PE3Y3HfvjJpWR8pCj0HozcTVs8Wv883b+1nTcJZfeqAYfzSycTNff59/y7ehShIvBD7hEXj9VELr
9Y86f+4w7AZy/g4GoHlU/HtWer0TXXvnLy0PYABsIiYwIqO4rK9sKnoWiIEsXucP/Z//sGhV6pMA
CWQQCPvFmNEoi0mABEiABPITKGoUS8vf/K2PVr7++Rv5O6HmWAk8+Ue/2df/3ELYDaKwWtEeRhlP
LPUNzsosBt6Q2t8Lu/lSCTBWq7WwmwytcmleowAAQABJREFUZteaaf5k7eqZysNvupi/gtG89+H1
wnWkwsvP+p988zXY3A+7oV74RukbfCPIIR+RQZxjJBOp8o+/4+9XvusXf6Q39vnoGp8LuAEWehP4
xa/e7vVdJBF6g7XdCrtezwbcxLr96m6RKcW6F66sFK7DCuUjQMO4fMeEIyIBEiCBXAQeffM9ufS0
0s7mgRblyocaIKE/0i/et5prXLbSqy9s2tnc6cefvJRb11YMMVqkfuiPw1DDOPQJj9pS2M+ErTv5
POk2S0kfBRjGUi9kk6rQ93I2VrnzuTA/VRiHUXwUdrNAz1M24Oq2xruvykK1GnuN/8UHfy4enm0g
6/Gm5X/l+36y8qF/+fNpKjNZdj4ycu8UNI7FmH7dWy4H8br29J2geqE3Nc6cD3sirrEy/d99Yc8m
Bh0+ViKB2SIQ8hj1bBHibEmABEiABGaOwAQbxYM6VkU34MrqVwxkGMlZunb5+3+J70u2eTBNAjSM
eQ6QAAmQAAmQAAmQwBQRCN1bYYoQJFMRL/GAPMWTwOaff//PVuTDMB4CL3wl7PHy8YyWvboI0DB2
UZlhWeijZTOMjFMnARIgARIgARIoE4EZM4g1ejGOl1/NtxRlI3ADTt0n8yQwDQRoGE/DUeQchkog
dEfqoQ6KjZeSwEtfC1snVMrJcFAkQAIkMGkEZsgglnXGaeGXfu5H6T1OA8QyEnAQoGHsgEIRCZAA
CZDAeAmEbLw13hGzdxIggbESmLBHpuN1xnPD/xk+rMerH3z9hbEe7mnq/OoT56dpOhM9l+FfkRON
Z3IHH/oO48mdcfbIufYjmxE1SIAESIAESGCiCBTwEv/27/7hQKYmO1MPLIhxPMEG8sA4sCESKAEB
GsYlOAipQwh8dUVqmywkARIgARIgARIggXEQGJRnt4BBPI5pFu6TBnJhZLNeYWcj7NWLs84tbf40
jNPosKyUBK48uF7KcXFQ00Mg9N2A00OAMyEBEiCBbALt5pje5zso4zp7iqPXKOA9zlpnnDb4ce1e
zc2+0o4Ky8ZNYHHcAxh2/1/9zKveLubm5rxlaQULi8XvJzT3Q18sf5Q2FG/ZQnXBW5ZW0Gl104q9
ZfMLxZkkjRWf3/VnN73jSCvYuLWXVuwtWwxkOb8Qdn4dHRZnIoMPfT3HzmbYD5vQ6yf0/c6hXBaq
xc/N2lLYV+PW7X3veZRW8NqL22nF/rLAJ0pazbDvo9DrvNs+9M/BU3L9ubDrfGcz7A765q2wY7d1
N6y/+fmw7wcPrkxx6PUa8vdOBjPqv3kh39PtwL931VrY39eXn9nIPE4uhdBzrNspft25+k+T/cTn
frny1gefTFNxlxUw/voaODr9nH7/s1/saxKZD33Pu5Ecfww+A5hv2mTEOH7fP/3RNBWWTSEB+Vt+
2D39tTSFaCrFfzFOIwXOaUwEwgzAMQ2W3ZIACZAACZAACYyDgBiIQzYSxzGtbivjxvSIHq8ex9zZ
5+QR2N9tTd6gC444zC1SsJMyqX/509fj4bzxHfdWqvXid31DvYC7W25P7LNfuBmP59E33+PEdOFK
vvfQ6cr7u+0+0Rc++VKcf+OfvK9PXpYMPPuvf9uVQkP6zFPPO/Xf9ucfdsoHJfzqZ5Lz6PVvuzdX
k1/+/VdivbLyzzWJMSp95Q8S3r4hvP5P9J83X/3D5EkRLffVn3T5F37v5XgKb/7P7p/0qUzl+EO/
36YSBidFAkUIlNgYlg24Mg3bInNN003xIMvj1PEO12n1WUYCJJCLwMwZxqAS+qgk6k9qvJDxyPPi
cthDBNsBjxO6jkGev4GbOR5XdemsroXtIqlvMtjHPu3x3iPHk5Jp+mg3+OZL4CPRjZUaui4Ud9ru
mz1ZjYTOL63djueRQXlUMuRxydBHJUNutsm8WgdhjzbrpQ972/nu5oaOczFgGYnMrx7waPr+Tr65
SPt2qC2lv9vT1rXTO5th/XVa+R9Hs3VrS8VvzNrjZfr0BOQ6D/l+OH3PbCEXgTw/CHI1NDylkRrH
Mg0xkAfMRR6n/ru/8Q+HB4ktk8AEEZhZw/jcwmPxYbrb/XopDteDF78hHseLt9xrXwY1yIv1x+Om
bjWfGVSTA23nvvU3xO29svmV1Haf+dxrcfnj33Q5jh8498Y+fV3eVzjATN7xvuHtiWf5yurr495f
3fnqAEcxO029853vdE7265+/Ecsfe/JSXzyq68o5qDEIH7zHfI/cHO73SJGpha5RLdLHpOhevfCm
eKjXbn9p5EMOvRkSeiPL95RU1sRDn5I6UE9JZfWD8oWAm8Gha3c3ctzUxbjsuBbwdJvUh5PRbitP
OnQ9ep62c+kM2PDTfb5w7Xrloav5nvbSdV15vLqpDN5j1/jyyFzOhDz1zpxbyqN2QucoYH+MxmrY
TfzQ0+me+8+cGHcewe3rO3nUTuhcurp2QpZHUPS77zBwH5s8Y5kGnZk1jKfh4HEOJEACJEACJEAC
JDAVBEItmJJMPtRAFoMadQtNBXc+JpxboTlT+dQEsPHj9p3mqduaxgZoGOc8qp/7T9ecmm9954NO
+Wc/9qJT7ltLrJWx9vgdf+ERXZSa//R/eK6v/M3f8kBfXmew9ljLv/E/76/3x7/7Uqyi5aj3/Jdv
xcmH33gxjpFHuY6hp+VF8/AM++rBk/zS3S/7VPrkn/u4+zhD6Ym39q9lhfzpz/bvfq71sEYWnmPk
UV/Hb/rm/rXgX/pUskZZy1EP5Y8bjynkvvgZ42H1lfvOG9/5gnmhPcxPy1GO8frmAz1ffO2O2+N2
9XzikfvYxz4WV9XXG64r3a7W09f7N/2Zq3EVyJHX7WAtqZbrtfM+PdTT5w/k+jx79BvcexNAPyvG
Wmytp9dmQw9rmLGmGfUgRx7lkOvr6pv+dMIT+oi1HuRPvCV5MgR5xE//UfLkCPKI3/iO/uvny59O
rh/IkffpQ671IEc7yCP++h8nTy4g/9g3Jk8wIM+YBEjAQWDKDLtxPF592j5/5QM/U3n/h3/McXDK
I2pHb1Oo1mm2lOeITOdIwhaUTicLzooESIAESIAESIAESGBUBKbMKAY2MVSDvMBoICAedX8BQ2QV
Eig9Ad56yThE2kOEtcmoBs8wPMc6v155FKpxDI+V9lBBSZdjjeTu4gtQccbwFMPDvNJ5KNbzefgg
h2cQa4/RuM9DfKH2eKxyu+Veo/zw5TejiTj2rQmFR9nnGetrJCXjax8ew5SqfUXwVMGTdW4xWYPe
pxRlsKYYcvSDeaAcnj3tMcUaY9T3jd/nUb3UeCKuemP/aTTRFz9gPKYveTyqfcpRxte/Pj90Xp8v
Pg8x5utbU501Hz3eonlcP1i7j+sOcrSnrzvIwUd/D/jy8AzfeyZZK4924CFGOeRoH3nEOH9wXuk8
zrNnv5jsao96RWN4hu9dU+P17OqtPcEXl14Xd6nlGAfk+rrS15vO6+sPnmHtOUb+vrP9ewzA06s9
u1p+eSW5nrRc56GHeelyeIrhIcZaYshRjzEJkIAhMKUGsT6+MFZHtf541P3p+TJPApNOgB7jST+C
JRh/yI7UJRg2hzAGAqEb+YxhqOySBEiABEhg0ARkXSzWxg667RK3JwYrjFbXMAdtOGf15xoDZSRA
ApUKPcY5zwJ4ijcrzzpraM8w8tDfvLXfV097rOB51B6tLE9xX6NRBp5i7DoNjzA8flofnj/oz6lX
DMFDrOv5PMpaD/nnX/sCkn0xPF99woBM3jXEvqbh0YLnSuvBc6fl8PhhHno3bXhMdT2dtz2qtvEI
j6rWH3Qex1+3i/MDct95hHLffOFRDl1TjPZPG8Mz7GtHX5daD98DkOs8PMXXt927qqMc9RHr8wZy
nFc6D32sMQ71HGPtMNrXsfYk43yHp/jWwdf6qkAOIfThAb7b6X8LAOTQ911/KIdn+JWNZM8AeJJR
rmPt6cV4IH9tN3nyAp5lyNEOPMPI6zjWXzmWwlOMXafhQabn+JgRUzNKoGTG8FG3U5lbGP1PYDFY
B20Ep51RMMbz9DkJ64zT5soyEhgEgdF/Kwxi1GyDBEiABEiABEiABEig/ARKZBR3Oq0eLzGOJYza
QC5irPYGe8rEOPo85ZBZnQTGQoCG8Viwn+wUngx4tOA5Dn2n48kehiMRj/IF94axhTqER1Z7yAo1
MgBleI61J0uv8dRdwYOn5YPKw9OKtceDardoOzhPi9aD/qg84OgPsb6utGcYT2xAX8fYhVp7iLXe
pOThKfatMfbx8Mmx+7T2GPv0fddZ3vMLnmLfGmNfvzg+8BQjj1jL844H9RmTAAlYBEpqEMsIn33x
5cqjD94fD3ac3mMZQB5vbjzQAfw3ao/1AIbMJkhgpAS4xnikuNkZCZAACZAACZAACUwxATGIS2IU
i4fY9hL7qItxPEoD1R6HGKvw6NryYaXT+pPHqacttA6SJwOmbV6cz3AIzKzHOMujAA8RYuxCqw8D
dqPGmmLksTu11ocnWHusoIdyeLiwyzTKfTH0Pv2x/vcY+/Sz1h7jfcVYY4w81haj3SyO0MuKszyy
WfVPW561trEsHm14jrXndVDHwccx63xBPezCjRhri1F+2nH66j9m3t+M9xijP8T6uoK8aHy3279G
FvWzviewG7VvjTHa8cU4/3Cd+PTyyuEphuc4bz2fBxWeYr3m2KePJzKw5hge5Mzr0LzPGJ5ieI7z
jj+vHtYcZ60xFj350cW1xHnJUm/qCZTIIA5hDeN4lIaqPU7pf1R9ox/M2R4H05VKp31YWazSfzhr
58LMGsazdqA5XxIgARIQAtX6AkGQAAmQwGAJTLhBrGHAWITxqMuHmR+lcSzzwBwx52HOjW2TQNkJ
qD2IncN16dgyVxoyifGRxpFGLLdidBoyifERHUnLLzrIEENmx5JuRJ/Lb3j7lV+P4hPh8srrT8hc
Au0h8q0xxO7Tug14krUc71WFHB5knzx0d2q0r2O9C7HefRj6vvcVw5MMPR1jF2q81xh5W6+2tNh7
LzDW6GKNMfK2PtKHh0dIVh44l7y/1LcrtV2+cqbWq+dLwJPlK9fjShuv7C6NXZqx63RWXvp17Urt
85RinI8bj2nR9xhDX58PaBfnhS6HHHo6xnwhx7yR17HvvczQa+4nj0L5PMLQu6be3wx933WFejrG
dY/rHXmtp8sP9tqxis8zrHerhp4+r9CP7/yCHHo6fvHmF7Wol3cZxnr36Z6ySeD8gwdYe4a1Pt5f
DH14hrWeL595HZpdqVEfu1Ujr2OsHcau08hrPV8e9Xzl2IUa5didGnkdi35tSf5MjS7I921IsL+P
itTXb2LIWzd0X42D3eTay9tPT09+XRQM3c5hwRqJerd7/LerSAO1wJtZ3W7YOOf06ykyBvvmK9+Y
oeEoHvB7jPM8Lq1HgTXGkP/g334Xkn0xDMc+4ZAy2jgdZd8yJfT//g//WK4ZHgaeY6HfK9V62PdY
6PdfqMd4f+d4k7dcICOl1bNLeVX79EK/+zZv7fW1kzfz7/6PL35npPta9JHX7XTNR75sJG3HksYH
ZfIlCJnEyNuxTktePhKQtvOQxwpGx5VOk6Fs+l/X1G7KsXAE6xUbjtKeqN1S9cXcdoSt2wcOaaWy
fsEpjn4UuS9un/zWK9vuhhzSM+cblRV38z3tvF9K3ov7fK8pZ2L9Qj8onZdKB8bYkfTcfP+vE50X
HYRDfUyigsOMHypSfrCf44fTGfTijn0/NNxyuXeThEP1g8iXb6xUUaVQ3FjtN/p1Pqsx7w+9elLz
RLmR+9pd1jch8BXmqdBpyfejP/SfHcX1iv7B2d9JzpVz60lfyOuedXmWsVOtuY2hrOsxq1yPa01d
f3b5kXVjyZYXSbeaxdZsua+PlB4zvr9SarKIBEhgEgiIh3kAxnGIQVwUD4zFURupMs5R9z2OORY9
HtOqv7NxEGwcTyuTccwrz+9Nl44tc6UhkxgfmR/SiMVy0GnIJMZHdCQNrzDktgxlEstHLLPLf/Fd
b3J6jM+cC7szE3oXfGU9w5KIBqtD6N2c+x87p5vKlb/5cn7j227w0gNrdjZ3evN2/7ud81bc3Wzm
Ve3TW17vNx77ClMyzb1iRgCaCrnLf+5S+h2blz6Vfh5deVuxO4Chczt3OX2cYKDj117Y1KJc+RM3
qHLVqlTuuT/jToennY2bxTiimZDrXOrCI4528sZnUwxgXxsnbnL4FJX8zo3dyt7zyZ2+5Ydvq1J3
FvqX37rrVkiRdjsZd1M8dZcaYVb1zlbY98pSI+xm1vkrYdfQM5+/4Zl5unjUf/NWA/7myQxG/Xfv
RsDfvYv3rabD9pTubISdY/uB3vBQb9fCgvy0yh/+xp/+6/mVbc2jsL+t0kRzv/h3it21pP+LP/Mn
tShXftjGI4xh12CG3Tf6/Cs//gEkU2PXE0ipFUzh1ScyvCueRq4/t+EpScT1Zff3sc/plNpYVBh6
DXmdShkdFr2Jj+ZCvMah37X0GIM642ACoT+WgztkxbETCDGKxz5oDoAESIAESIAEZoTAR//T7wcZ
xzBcR2Wk2odD+h5Fv//qpz5cyWsc2+Mbd7ppljPpcVx+MMyBozcQ1e368qGGuO/pNF8/kDdW3TcE
UO6KxTYJdXK42psWWdit9WmZfcF5hHqLC3ZDdRLwEnjgm90eh05HPfLvbYEFJBBOIK+nGD2Ifqin
Em0wJgESIIEyEhiVkarnPk7DXI+FeRKYNgLFnpeZktnzh9qUHMgRTCP0UeMRDI1dkAAJkAAJkAAJ
jJGAGKkwVEc9jHH2Peq5sj8SGBWBmTSMRwWX/ZSHQOj64vLMgCMhARIgARIgARIoI4FxGqnj7LuM
x4JjIoHTEKBhfBp6rDtyAqEbb418oOyQBEiABEiABEhgpggMwnscuoZ4EH3bB0vWGTOQwKwRoGE8
a0e8JPMN3ZG6JMPnMEiABEiABEiABMZEoN4I29V9FMMdpwd31H17X4k6CtDsgwSGQICG8RCgskkS
IAESIAESIAESIIHZJTBqI9UmPc6+7XH40teevuMropwExkqAhvFY8bNzEiABEiABEiABEiCBaSUw
TiP1tH3zceppPSs5Lx8BGsY+MpSTAAmQAAmQAAmQAAkMlsBRp1KRTwmCvMt4VEGM1LwhdJ2xr/0i
ffvaoJwEZoEA32M8C0eZcyQBEiABEiABEiCBcRIoiTE8TgQwUAdt+OaZ0zj7zjM+6pBAGQjQY1yG
o8AxkAAJkAAJkAAJkMA0EiiRh7gseMVIhaE66jEV7ZuPU4/6CLG/cRKgYTxO+uybBEiABAIJnL3Q
CKzJaiRAAiQwIgL0EqeCLmqkpjZWsHCcfRccKtVJYGQEpv5R6vmFuRMwO63uCVkewfrFsB+iB7vt
PM2f0KkthR2e/Z3WibbyCB58w4U8an0615/brNy9udcny5N5+I3F+5J2n/vSrTzNn9BZmA+7B3Tv
w+sn2sojeOmZu3nUTuhUNw9OyPIIjg7zaJ3UaTXD1nndemX7ZGM5JIvVhRxaJ1UuPxR2HHa38q/p
sns9c37JzjrT23fCjpWzMQpJgARIYJoITJBBfHTUrszNVcdKX4zUcTxeLZMeZ99jhc7OScBBIMzy
cjREEQmQAAnMEgGX8VythRn+23eLG9nbG8XryPHZCLiRJfWuBN6c6HbC7tqEjrPeCPuztlgNu3kW
ehxuvhx2c6m2FHaOTcoN4WrgDeG9wBvCDwXcEH7m8zfkkigcGsthxlfoOR1aL/SajYFMkEFsH0Ax
jiWM00AWA1UCDGSJIYsLhvgf+kHfuit5nPqv/PgHtHjk+XsfOVu5/tzGyPtlh7NDIOwXxOzw4UxJ
gARIgARIgARIoEfg8ScvVUKN414j05aYUINYH4ayeI9lXD4jVY95kPk0A3llvebsav3CslOeJXzh
K7ezVJzlIU9Tfu2zrznbyhKuXwybW+iNSNcN96wxSvn83MmnY/PUe+3FrTxqM6UTdot8phBxsiRA
AiRAAiRAAiRAAk4CE24UP/Xxz/ZNS4xjeJD7CkacgZE64m7j7qTvcfY/jjmzTxIQAjSMeR6QAAmQ
AAmQAAmQAAlMFIF6Y2Wo4y2LgTzUSWY0TuM4AxCLp44ADeOpO6ScEAmQAAmQAAmQAAmQwCAIlMF7
PIh5hLYB7/H/+oP/U2gTrEcCE0OAhvHEHKp8A11dr+dTVFrn711VEmZJgARIgARIgARIgAToPU52
r57UM6EeuPHdpM6X4w4nQMM4nF2umqGvamoHvlIq16CoRAIkQAIkQAIkQAIkUIgADeRCuCZeeSfg
jREy6cXAN1RMPLApmMDMGcb1wFdB8CSfgrOdUyABEiABEiABEpgOAoetsc1jVg3kX/nAz46N+Sx0
vH0n7DWMh0dHQXjWzi0F1ZvmSnxd0zQfXc6NBEiABEiABEiABKaJwBgNYo1RDORxvvtYj4d5EiCB
0xGgYXw6fqxNAiRAAiRAAiRAAiQwbAJDNIgPD6PXtAQ+QynGsQQayMM+Adg+CQyfQODXwPAHxh5I
gARIYBYI3HplZxamyTmSAAmQQBgBMYiHaBTLoD72u/3vMg4Z6Kw8Xs3HqUPODtaZFAL0GE/KkeI4
SYAESk2gys02Sn18ODgSIIEJIzBkY3hYNOhBHhZZtksCwydAw3j4jNkDCZDAGAjsbjWDep2bC6rG
SiRAAiRAAqclMKHG8GmnzfokQALlIDD1hnG9Ue0j3dxL1oL0CXNkFhbDnjo/cz5sx7fNW/s5RnVS
ZfVs2HuMX3r6zsnGckjmA7m88uxGjtZPqtxz/5mTwhySnY3Anf66YTv91Qruft466OSYRTlUqvWF
oIHMVcIszgv38R3bQcBZiQRIgAQmhQAN4kk5UvE45XHq93/4RydqzBwsCeQhMPWGcR4I1CEBF4HG
Ss0lzpTdul58zagY0peuhhn9r724lTkml0JjtVYJeen9mcCbLzdfLs5Fxv3iV267hp8pm5sPM8TP
3rOc2bZLYevOrkucKbsYaPjfeTWsv/mFsJt8N1/ZzpyLS+GBx8+5xJmykOtIGg097nOBjwrUG6P9
Mxr6yP7BiG8KrwXeFN4Y8U3ha4E3ha88tJ55DmuFjRt7WpQrf/He5OZg6DWRq5NxKZ3SIK7Xq5Vm
M8zhMa4ps18SIIHyEhjtX/TycuDIRkgg9F3SaxcaQaMM9RYHdcZKJEACJEACJDAEAjCQ8zYdetM0
9CZt3nHFeqc0iAv1NSblaX+VU3MvedLtbjfsJm1jpf+JzryHafVs2JOYSw+u5e2iTy/05tn6xbDf
rK39sCcIdzfDlo9V6zQF7QNOGjYNpkmABEiABEiABEiABIZDYAYM4uGAY6skQAKjIBD2TN0oRsY+
SIAESIAESIAESIAEJp+AGMQlN4qf+vjpX9k0+Qcq/wx+9Yd/Ib8yNUlgQgjQYzwhB4rDJAESIAES
IAESIIGJIlByY3iiWHKwJEACQydAj/HQEbMDEiABEiABEiABEphOAu2mWtsI7zCN4uk84JwVCUwx
AXqMp/jgcmokMC0EPvqvvjzRU/m2v/GNEz1+Dp4ESIAEMgnQED6BaNo34JLHqd/z8z9UCXmNY7dz
WAl9FeoJ0BSQwIAI0GM8IJCz2EzoO4xnkRXnTAIkQAIkQALTSODfvvybpV8/PI3cOScSIIHBE6DH
ePBM2SIJkMCACVx58Gzc4vUX7sbx4eFhHDfNI3xzC8k7i1/ZfyGWP7T2eBx/9cYX4hj/Qb9WS95R
jXfXVqvJayPa7f73YS4sLMRVu91uHB8cHMTx0lL66yL+4Pc/E+u99y//rTj+zf/tj+OY/5EACZDA
NBL41conT0zr//rIT5+QUUACJEACZSZAj3GZjw7HRgIkQAIkQAIkQAIkMDQC9Xq1gs/QOpnihrk7
9RQf3BmcGj3GM3jQOWUSmFQC8Nz++r/5351TaLWiV4JEoVb7hLP86Ogolq+trcXxrVu34rher8fx
3buJR/r8+fNxHh5ilMPjjHysFP3XaDTi5P7+fhx/9N8/FcdPPvlkHL/3ve+NY/5HAiRAAtNK4Omn
n46n9uEPf3gipijGsA7y3Y7veV3GPAmQwPQTmCmPcXOv/zHJvId3+Uzy2GVefejVGmH3HTZvJT+u
0Q5jEiABEiABEiABEiCBkwRcBu5JrUQCz7CvzlMfT5bB+OqXQS4beslnVsPORrKkaVbnz3kPl0CY
5TbcMbH1QAL33L8aVPPGte2geqxEAqMm0O72/xj42Ed/Ox6CXnMMjy48yFhDjDXFetx6LTH0sOZ4
cTH5qkQ/8/P99xS/7du/NW4SeqgPD/QnP5msv0M/un/tcUY5POSohxhy6CGGJ3xrawuiOL7vvvvi
+ObNm3H8wAMPxPFzzz0Xx/gPnDBvjKvT6UAljlEOfcTwtGB8kEO/rxErc+HChTh3+/btOH7kkUfi
WI8PVdA+eECuY5RDX5djvDhffOPV43vsscfipuAh0/0gr/vD8cF54dPDeH3lepx6fFn80C76wTh1
O5DrGPXQji7X+eXl5ViEJzYuXboU55999tk4ztuO7ldz0P3mzet5Z/HT7epx6XKdx3WFJ0z0PNAe
9kJADP2rV6/GTeKJF8h1PzoPzjjfUb63t4dkX6zH1VdoZcAP14NVVJqkzxAexQAHvTP13Fw1Noxh
HEt+3OFffPDnKt/1iz8y7mGwfxI4NYGpN4wPu8kmPULqvseSDXyKUnv5meTxyqL16sv5vqzwY6Fo
+9QnARIgARIgARIgARI4SWCcxvDJ0QxPMmjDe3gjZctlJNBudqLXbU29OZgbPUnkRjU8RXiX0ENj
JZ9BDX3EB7v9Xh3Is+LVs+k77PrqH4Q+mr4W9mi6vPMuJLSayY7CRetub4R50qvVfm9i3n6rtWQH
5Lz60At9D+DBTrIeF+0MO754b9gTDZu393vvOlyq9Z+r8OD+2//nX58cvllPfLLgpKRqTsl2hESO
w7z5ZjzMeUn9wA9/MG70j/7wc32N46bXf/zdfxPLa8lS5kqreazWaYed1wsLJ8+zBTPurhn33FzS
z3f/zWR8Ps/tf/id/y9WnDNNHqkhSbuH3aOK2Zz7ePAmhX40ctnUe25+LqqbKOpy1Hv/X/++WMHn
+fp3//H/PdGnT2C/TzPqOg6HydJyX5VY3trvfxrBVv7v3/d34iw82jjvsDv5Rz/RP77WQfaJcxgN
ailZml5pmicDNR97DEgLTwQk3/eehJ/v+P5WdHzl+EFf84Acl9eBtZpnwez4jj7tWJ9vdtm8Ve+7
/toH4qJnnnkmjq9cuRLH8GA+9Ynk+pXzQa4Hs+l8r7ma+ZPY8h+iSm3J//2J+el5Swetg27lb7/3
++O+cHx7HZuE6/yT7wmcv77j5uLTbuX/e4T6739PMj48QQEPMp7k+Ngnk+8XPW7JN6NzEQ+4aK5a
H5yjUyXmeWSG6uJm133vu77Xzo49PSsGsQ26TN5je1xMFycg3/FHWRedo9mV9Xpld9P6ceHQoSib
AA3jbEbUIAESIAESIIHcBGpL2X9axWDBjYie4ZLDgMfNFhlMDvV4zFKnHu150etH3fiAHDdu7Hab
KTcMAMR1w2QeVh2UUmPL2I8MahicqDJvbN4FNW6USyyGvy8cmeZdBmyeG4sunfiHq+dGEsaBG0yI
Re5qC/o6zosw7Sa1HHfwdM3f7tO8ta4yH3Fu7Xd7Nyiy6tltjCs9i8awi/U4DWR5nPq7f/nHXMPy
yopcD3Yj8v1ZNEidlYA9g+59eL2yF+hI6KTcCFsMdIYUnTf1ixHI/utdrD1qkwAJkMDQCHzptcQj
u7Ky4uzjXLKZdKURe4CPf2zv7Sc/mpcb+IWcxNXF5Bd3u2NcI3NHlcVqVGZ+Se8cJL/EV1HP2Wul
cu7cub4SrOGDR6xiftBfuZi4pu210t328Tj7GnFkDs0v1GrkihWPMfJ7zaSDJXi+TX9141XG2mdH
k32iK5f8Y7G9TfOVRO8QphlsEkd1+VGOH9ZN4/Grmr88ZpiRwZZYGFjrCI9s3+CizH2JozGad1IC
T2DVrAFvR2uhq5FXft88DFE1BpU5zLq5yp7x1C5HDyI09x2Dh0V1omYiwK7lKL73StLGkeESmXhx
EVb0zM8nA29G4xMvcaOWlHfOJC3MR+efhHljyewdJPnlpUQv9hRGot2DxCuwYPST2pUK1pavr6/H
IqwRRTmOb9MYkXXLqys66PdwPelXZAcOLhhXVa6VKIAzjsN29DSRPIWRXIfReHd3Y73e9RDnTv53
LlpqLueZHtdJTS1JjOlFc77vm6eL8PAOHsoww60sGL5dOU44OaMmfePDjYMrydLoXufHlBJRQuP4
hgXyvQqeBM5nFNdryQXSbic//rEWHuW4PvQTAmbpdgUPk8jU6tFTCV1zHi+qh0x6xxsMzITmowur
3YyeEDEWfd3cMWmaR13qcpFFodmmdwrHpGzxOA3ksrEo63jSjObmfnHDX+b5wOvMj6CCk757073P
QMFmpkJdfU1OxZw4CRIgARIgARIgARIgARIoBQEYqoMaTN4Ntwbd76DGz3ZIoKwE6DEu65HhuEiA
BLwE4IHSCvBQaTk8xfCwwtPY7i3GTWpIefKoauI6WVtO7h2inm4XnuXt7f716HjcFZ4d1IOnGOV6
fwH0A08O6iGGfCF6xjL2GLcTF+wSXGHGU7lsPE7be8ldZ+zOjXZ0jEd64QmEh1Lr9TxvxvPZK8/p
GoOnGB4trArF2mJ4OOFBxu68vX5MAscPcs1Znwdt80CA9mwuL2XclTceWTwBgP4Qw8OIR5AhF4+w
hHotOY+WzXuym7KIPQri2Z8/jKAZD92xJy8BiScZlpf616PKcZRz58B4kleXE33wihuP/sMTAtqj
iHJ4ZOFhrS4mjxps7ycu9OPxoEZ/jPMD53G0kjxWEI+9HXaNRx78erxqSX/Io448gd7tzlUwLqyz
68KjCUUTR6t841Ts+Y28wB3zWIOs346DOVFWzCOLLfNkSKxv2sgT2U9L2PpJ773D2Cs6ME9GnF9N
9kTYxyJyGW80tP12Mj5cD5o3PMVoEPz09aD54boCLsEg3uJe+wYL+G5H66slnDHrs/H9IzG8xVK+
Y55QaJiGOh0zQSmcwvCJT3+h8qfe8eapmRmM47zG9NRMnBMhgQAC9BgHQGMVEiABEiABEiABEiAB
EpgUAmIgw0ge1pj/2ff8zLCaZrskMBIC9BiPBDM7IQESGCWBxWi3Hlnn2TWuHr3GGJ4RjAme2MW5
aO1utKAQeXigoId40Sw69JVrD63szmwHeIqj/a8jp/NRb60w+rV1+9LG49OKPI+xxxGFcF2ZPDx3
WHMMNe1xghybA8ETCA8gfGFYk1lVnmK91ljn91uyE/Jc7CGVvoyDu7JkXmUHzxje66o9nPCIaQ8x
xg2PPY4z5HAYIg9PMfJ5Y2yEr9d4woMHDzd2Gcfa4iWzdrhqOoanWPfbW+u72H8AseZd+EnAWmTU
P7uanFA4//DEAjhCT8fwVDbMEwYds/i5083nKe7z0EaN4zzWa05l/sYp3DcEeLZRz3c+Ns2jCfCA
ohGch/Agw/MrHOdkbbLhiAdBKua6673RwFw/xmFbwRpkPHHgGw/6x9p1/UQCjl51Mdk+e76SeGKP
PcVoIRpApKzro921lf6fZLg+UBvXA/K+8WK/H3kDS+zkNfOWtcMScN6sLSf97aGCaRhcDsyTD/ge
6a3dNmu0F/CoianHaDIIiHFM7/FkHCuOcvQE6DEePXP2SAIkQAIkQAIkQAIkQALBBE5j3I7Cexw8
MVYkgTES6L89OcaBsGsSIAESyCLgW1uMeuIpliDvAZR/8CRGjuC+4PPMNiMPmqxxXMZrFDyLC+ew
my+2Ve5r/Thz7Bk7lsUps0vsbrT4Vd7bWjWeLqwF1J5X1IbHp+fxxq7Jandi6GOtIfLa4wSPJ8oR
AxdWuIqHrrcDNZSiGLJmJ3FJiYdKAtbI7rf615zC87RnXkjb8G0XnTTT+x8eYMQowC7O22ZDzTPL
SUndLN5sY3GxWczby1b6x4X24KHFLsTwQKIcMTzI8DTCcYZdqKG3Z96hDg8c1mjLHWnxRvvaR314
ijGuujgko2MBjx/0sEv7jRs3IEqNd8wu7SvmPcp63PAsn19tVOa6ixV4PrvqPAPPhUriWoRH+UB2
vY7mVzO33peXkwODJwLAD4M0Dsh4t3Hxui8YzyY8xB3zSMPJNzIlHtB6dMLKNY/+ZZdxO8Cz3Fgy
BQdm8bNRwvuoUQffM2fPno1FOB/g6a1Fi8ql5639ZFdm6V9C26y9rZrzT54IkXDQTM43aUeuSTO9
uEz+Q7vaQ9xTMAnf9Qo9eO6j/aJj0U70Pup21CF21e99b5gKeDIB5yfakSdiDqPPUs3zBWfOA3DF
kwCoz9hNAI8xn8agdbccLh3GmORx6qKvbQqfAWuSwGAJmD9bg22UrZEACZAACZAACZAACZCAj0Az
2pRMPrMWYIyWad5lHFOZ+HAss0Ngmj3GZlXN7BzMSZjp+kXjopiEwXKMpSMAz5hvYJ3DxMc5fySu
mWOttUay9q+3C/VxUV9KloSK1xZrdPsKrQw8kVgjiiLteTretRcaJjYeF1mL2Y3cZS3lmIEnVtXq
W4s8H7kpF4yLWY8X75OF3OfRgQcP/cDjBk8Q5Igxn56HMXHY9Tyf8BTDEyUeT3gDpQ2swYzc5HGT
OF7wvPrWyMLDhhjjwTzPLPd7gLfMbtzwxPX04QqHwMTicW5FXlSs3T0wi4uj1eaxhvZwojq4Yo02
5PAMd40nvWrWHC8b1+KRuD6jY4cnGlCvF5tzF55beI6l3Dqto/cHJ3/C4/cbR2U+fmgXa4sryeVQ
wRponM9YIw098RQfRN79veidthKO16AnLWLttj5fqtGBqkUHftfsno33Uye1ol2Qz5gXN0NgYjm+
0WrhnhSe4o7s4B0FeDYPzCLhJTMPVIA+ntTowTJNdrtmN2WTl/P9SK6/aLfvuP1q0iC+Z+CB1w+O
tPA+3xPnU9IwPL/isZUQOd7jsC/dRyj1eZmURk52c3D1eY5yfb1CjhjvFcb7uaWd2Ntt5gs9xLh+
8D0BuTyRoJ9KkDLwhx5iXL/Ip8WzaAi7eMAQLZv3uEzjcXGjrDQE7D9FpRnUIAZCj/EgKLKNoRPo
/dAp2NPmbfPLpGA9qpMACZAACZAACQyGwKR5h7HB3mBm729FDGQYyX6tySvh7tSTd8w44oTANHuM
eYxJIJhAc7/fAxXcECsOlABukGjPrO7kEC48swZXe4oPjCdvyaztxRpO2zNnt6nX/GKNJtbuYe3u
gVm7iPfyog3baxrL1NpgrMWsVZP3u27uJmsE4alaWep3+bQij+NCtIgT8zRLGCPPbdIj3l+MNb15
PTra84fxx1vpytpWM26swYZnGJ5k5LWnDmsf4dE6brc/tbOz0y8wOXjSZMdwCfC0YrdhrHWtR9sY
y79GNbmZjeOGNcA4LVpmN2bUa9Qjz1o0N3jJcCu8brZWxo/kjY0NM6IkwvFG+yiEZw2eYsjhmY09
lZgUCh2x73yERzpaqRzXgkcWnk+M19FknwjjgbD3JIARSD/CqNp7TzY0k7hrFqG3zeJf7MYtS/Bl
Hf/KUkIS71WGR/vll1/ua0jW3boCxrPY2w09Of54b/eiWeuP3bXx/WAOb7TGObluZP2xBLzHGH3J
Exd21/DIYo2xXtOL3aPh8cVxwPHG+XJgPMrwFGPNcXQFxWuM0Y5+j3HTOLTXsGs7nqxQ74fGkwrH
80hS2GPBfv91PfruwJMcmzvJ+QLP/9Ze0iE87+CHdnXs243f90TFJHuHn/r4Z0b6LmMYx0U9tqKP
uvp4MU8CJFCcAD3GxZmxBgmQAAmQAAmQAAmQwAAITLIBPYDp9zUxbiN33P33wWCGBMZAYOo9xvaa
1o2bYY/VVuGGKXiAtu+GbSpx+cG1gj0l6i997U5QvZW1yF0SEGpLxU8f7KpbtLuW2d21aL12YL3W
QZjH+PzllaJD7Olff36zly6SuOd+93q9rDYOc3isXG1s3wm7jq4/3+9tc7Xtkp05H+2Ma27hwTMJ
Tx304ZGFxwO7Tu82k8W72vPWMJ5ivM8UHiBZs7kY7ZSM3ZTNEt7e7svo/9yZZC0i1uZhjSfGc/78
eSTj2Dg6Y++bCKoLiZ/qIHpPbScaRLzbcCSX9xNL0OONhdF/tmdb2oSHqLKI/aMTTbTXqKvtedGQ
is1S1Yr2gMHzNj8vq56PojWGiedtx1wf2FUZ3FWzvWyWpxiK8Lwjr+MDM0C83xYeXujtRou1q9HJ
gOPZW6ut1nBjM2zE4mU+ioBGPvi4KXgA95uJ5x7tH+9SnJyQOO7wRGPNeR27lqOijgWjfGx3pa2T
YI7mkRy//Zb5WyL6kWf72GOffE/Bg4j32sLziXwtOl3lg4DjvFxLvsNxHqMcsayJno+8wcee5f4B
d4yrF55i1Nvci45DdPLcc9a9p8TaWvI37vbt26iSGsOTumSeBEjgRf5ynKCqNs6P3hMQnu+62IMs
T0Ioj6xeY4zmcV4hj2bBs2I8xfB04wBjzXF82KP/dDt4H3cd81O7f8PjjuOpnwAxWytETzyY7wHz
ZId8D8pTE612cp6sNpLzVn8vYvx4MEDqyI7a+N7FdYYY80ec9wkF6DNOJwDjtKj3OL3V0Zdyd+rR
M2ePpydQ3LI5fZ9jaWFv2zyjVLD3UAOpYDeTpw5LZPJGXsoRH5hH2ko5uBkYFAw7eeRSHs/FI7r4
YQgEMIy7c4kBBT2Uh8TLZ2o9wxgGva+duciQliCG8952q2fIHZpHWVEPmyhpOcp1jEdZMb/jfKIp
hp/cCMNlf2TuGxm7SjcXG2+xMPqBH3pzym60ZjatqppHyhfxuhhjAMBcm4sekY+PnzHg7TbS0vIy
qsXoLoiyn6MqxkJNqxyVHewmf18OzOuijjIMYznOwlq/Pkd3011Q51k039rSQmXRPHt/pN9Dphsw
+cVolywxbjvtZD4dYz91IuNHQgfPRBt9RHNRf3Izs3dDU+HA9dErNxVF3o36y3t9dMwz7Z2OzO/k
z5KOOd69R9PNca9YBmTod+gCrGhM2hWbC+II/UY6MreOWZKB+YMHDF17fGh2Ea+Cg8CKgRdx74Kz
dFzJeiNhVm+YmuaCkPMsHifu3JhiHJeuuU5w+M3b7qL7NdExj85hzMuatqt7yoZEYFoM5CHhYbMk
MBQCJ/8CDaWbkTaK30gj7ZSdkcA4CIR6i8cx1kH0qdf8aU9P7326sWFyFBuQ0u/xWtPkl2Hb/BI8
tl+M3HiO4Cm2PbTSDgzoVjsxhJDXa4q3trZEvRfwwxO7+KJAPG11s2OxyGAowUDGWmj8lu55kuNf
qpFfCq5o4znbM7sAYw3hXtPt3YdHDOPoGkMXMdaU4j3BYhDDKJY6eIhmwVgCi2Y336bxmMEgEHtC
DEBwQn+IzebPFe0BQ7mOYRBjrfFyNXnaBR5VM43e8e55jHVDKg/uWPt57NFL/pzgPMP7eJGHxxMG
kfYU4wbFgbkvi92eu5GhchS5G31csJZz7yA5fljbXZW1ttGxwPuRl4xhgzX3WMMLnvDAy+kq56A+
n9vYpVnxQFY8yfJkCYzHLlykRmHZuNzBr2PKzyyb66nd73HHdYLxoR+cxrFBKee2MXgb9cTj3Kgl
x+GO2eYZxwfXVT1y8Qszn0cT/eg4rh91B48synF8kT8ZR5WicdbMkx/aQyzvQ5eAPQJw3cp1Le9m
Fo+6BOxRgPsvaAdrobFLfKwc/YfjiTzW9qrDEp8joiPnv3zwfbJvLjiMB+3o7yVcN10zj8hETlTN
cdHfM2iH8XAIiIGc5j0u8zrjtBtBQqujX8mQE6HrNmaeqtsbYU9yyo3okICbS0Xr1s0+A0Xr3Xip
/7dH3vrrF81d3bwVjvWSL+fj/MSnzLfdRM8DBwXxRE8m9DHqiZ40Bz9yAqGPUY98oOyQBEiABEiA
BGacgBjH8CAPG8Wo+hn2PNj+SAnABkM80s4H2dmkeoyzwGeVD5JhKdoKXV9cisFzECSQkwDWTmJN
JXbhRfWGcfXC4wE58vsHiacGHhPs1to0a/DgWUE96MGD1zGPLMN7it1moY9Ye7aXPEt95QnSuegD
jzD6x/tpseswPN7wDO1HiwLlI/4gCTXjsV02uxRjHPBAIY8Yu+5irSfkvdh4hhK/n3h9kw/6N7gi
9aT/hW7iGcTaXLQjnMQrqj2VeGR70Xg8cTxR70TevC+2ZR4BrpvxwVNsty+Ph+J4R4DiAK49OToy
Md7nGu3BHEuSWUX0TQKe4mvXrsXl8Mzec889cR5PqprmehH4H6+NTYpiecQG/eo1vniPcq3nSk0G
Iu/zlaercUcba2hxHcAji7XPvYGYBHY7xqO0GzsJ0LWVpEWsPdW7oGMXcLQH3mvLSb094xIXb6gE
vP8ZTzTgeOJ8Az+0B89qOzrB5qIPrrPIxw2VONbX49FRMn7xFLu8xTjPDs17kBfUe4eFKs5xuyN4
YiHDEwHw4O5G114n+mA80dURq6I/rL3Xu7HLbvLyDmt4ivXu9lGTccB1hOPr82BrTzeOy/G4MIMk
xnUAKTz9B8axjydNUH78REP/TyqtB33GwycAozXNgzz8UeTv4Zff/1OV7/mVH/dWkGUhoV5jb6Ms
GBWB/i+Gk71mlZ+sUQIJ/r6WYCi5hiCQi4AuoptrANOmFLrx1rRx4HzyEQjdeCtf69QiARIgARIg
gXIQ+MSnv1COgThGMUoPsqN7iqaMwOatvSIzKmJbFbXbioxjKLqT6jEeCgw2SgIkUG4C2P0UaxSx
+zMca9ojCA/KitmsCGsTMUu8dxeeFMTwpEAP3qi9ZvL3AB6TNlyYUPTE5vXGJ0plbR+8xXYhdp+F
7MB4qqHbiFxKR3ArRUpHxuWGXZExD3jDfB4nvRYa7z1Gv3tmOZbsZite8wOz5hB6Jht5zpI/JS2z
RtvsVRR5i5OWtAert+Y2eW1zb1dgzBvjRR4eWXjiMD7EaF88dnLsMP+qWTyJ4wx9Hcfvucago0Lc
Mcb7peGRxXjgUcQTDCfaM54/vH9XdviVgPNTjpOsMcYTAXgiAWtAcWibxkVfNyd4LZpPLWINDzM8
mHHj0X9Yg4rxIt/bddwcH3iqlxtmoMYDrz3FaFfH4I1x6PeBV82mYYfG5Y7rFefbhQsXdJNxXjzF
sgs22tdK4ITr8dijqTWTPMrNLKOdlvuDnB723lvwZOs1+Dj/4MFdig6Q+KrxxINvPNiNHeejnA92
f/Acw9MevUy7f4AmB88wzj8o4ckA8+BFj1vvCRPlRzCXQ+SRT1pomK3KI58dmkzieBjRxWvOCzwZ
g921tWe7vzJzoyQgBrJ4j8u8zniUPGa9r/noC+YQf5hnHUbg/PH3P7D60KvJ17P7L4W7a1vXTru1
KSUBEhgJgdBXl41kcOyEBEiABEiABCaUwDC8x3hkexBI5HFqhqkjYNtYdjproqJbRD+rvYGXl9lj
LODg8MiaeKkhZw2e5SRAAvkIwFMHbXhMkNdxz/NkvknmzXtH4Lnr6ZtvEMjhae7VN/WwpnJrL3G5
LKu1w/Ag6nHCc4r+4EHsmjW6kCPGODa2koGt9V5VnUxEPETygWe75wEy7qit/cRHBo/U3l6+x6Tg
NMV468ajexi5zLoRgyXTPtaiwnMMTzHGj/rII8YazB5XUwCPGPSwJhW7LWNcvXL8aTDHFX9mZSkp
vHOii7W0vd3Kzfur0Q5iWestpOEhhlz/CYIHFuXagwc5PL6ov2PWtmMHcnHwixcSPOBx7NUz51u8
C3XUKM6Hw8jjO2c59+DBRL96PDs7O3GR7DaOHZxF0DS7qi9iW3bTH9qBpzDZJTqSGs9hr1wlsKZ4
fSV5WfJB9N5lHBql6sziiQ85L2rWLu1aGZy0XK7XZvTB+5ThSQcfvH+7bZ68gOdUt4MnFbRc52Vv
AvHK6t3ptR483FmbHXbVCa7Hj3b1+Qe5L8Y4cR3gPML7u+MnJaSyPlhx/vhnVe/JGKOH11Q1oleH
MZDAOAgcRq9Km/d8n49jPIPusxm9wjN0Z+pBj6VAe8dfGtmViuhmtzZAjTJ6jPPCEr28ugNExqZI
gARGReDM+eR1LaPqj/24CVTNe4TdpZSSAAmQAAmQAAloAlk3xbT+lOSL2Gels+PK5DEWOPq+Zcg5
UjrIIZNgHRIggZMEsMYYnh14xLCrrV4Ld+wpTNrSnmB4XG0vo2gumjvRkMt7ZyVsmzW3VY9XC7tR
w9MZV4r+Uw6haH1i0h7e24o1gvDoYJxn19xfiaKHsSd9JF97ptXerrfoH7sB4727Pk+79vTa6yGl
LXBYqibjOn6fKXpKYt8aRKz5hPY8tvuFQMXwwCtxz4O6aOpv7Sce/PXVarRM87ACTxgY6bXJeg3m
inF9b+0n2/MeO8Lcf06wZlZ78BYNsI5a4yVrtCVgPI3ogOtzQsqPubn7FR0J8DRj12tcD0lp9J7p
evJ+Z6yZhRz947yGHB5hnHc9j754ii1vsXjWJawsJe23zHuKD835jHx9MfEc4zjgCYCk9sn/cf3q
EqyF3oq8JxJ649KKKg9PcU+MtbIeByd44XzD8e3VNwl4cluddqUbHSyczzge5vSpYA8C7K7dMQcb
70fv3dJ3X966W28eTwiYpeg9Pew1UI2+acRb3Duu5rrVv7S854Vp8fj7KREsJYc3us7MCdHrmQkS
cBPI2p3aXas80uUztUrou4zLM4uhjCT9j1X+LgfVTv4ePZpl8BjnhZGlZ5cjjdgzfYpJgARIgARI
gARIgARIgARsAoNcZ2y3y/TEE4BthVgmZKddE8wqR528etAfeDxuj7EAyHPPNE3PB9EnHzhENkgC
JDAaAnfu3Ik7wprU7e3tvo6xayreTxz5OONyeMiwK7XPQwK93tpO4+mBZwj1+zqNMnoXYHiOe54y
uHKxlhNeuJ5Hrv9rEJ4xeHrWGv0euN39o8r+wVHPMxXtcRwPCR5EjA9y5BFjfL7dgaF30EpSK8tJ
/61u4rlDOdYgI6/jZrS2tR2tBcNu2r3dqM1iWnga4cFeXV3VTTjz8KzGC3UjDXjo4r/NEdOeRxic
0Yr5q9CBx97IcfyOPcWo4I7hWdSl2lOMcpxvOB4LkadbhgI51qLKamI74PjjfECZ7Ewt4aCZnN+4
HlDuGx/Ke7E5H3HeN2pJ/xhXvHY4Gqi8M1vC+kqyqL5j1ij32lEJeIrjJyKiMrxfGWrw0CKPeC86
rzsRmUbikK4sLiTnXaNmLayGshULn7mOeOGTAyzve5aAtcTwdC8bbr3xmTb0ngC969aUI4InWq4z
fCdIWcdwbNST/sETT4D4lkLCA412dT/II8Z16xtfT095xvX5Az3EVfOCZ/2+apT35mEWg28fJOdd
VruoP8mxnKv6/Jjk+XDsJDAgAsmX3cnGfHLRTCuzW8qrZ9cZWLoMHuOikxFgPmg+edE+qE8CJEAC
JEACJEACJDDDBJ76+GdmePaDnTp3px4szxK15rO90uy1Eg2/fyjj9hj3j+Y4JzD7XShJWZoctfsO
0LxZHLOzYRYHQitnfPnBtZya/Wq4c90vzc6F1jtzLmyTolpD3VrOHmKs0W33Yc6s1dvVMlOTCiTg
J4A1k1hbDE+jrqHfWwsPGPTg0UEeMfTq1WQ75mbbuEyhoGPjKcKaYqz5gwdSr1Vsm8WA8GShObyn
uGt2zYUnRt5XLAEeLnhC5zoty0sqX5bJ1yU8ksgj1h4mrEnVnjyse8VaY+w6ba8zjQdkPLHY1Bie
Zehjd+V25KqT9b1YK7own3ge940Lb8F8P/vGE/fl+G8RnmAM1Oi02p3oncjHXlcc50Yt8XTuR7sl
SwBH3GKN3yscyX0eYxxHrCmGBwnH2zQfeTpNP0333xscDznP5Lse3/e75n3Y+HsVD9Lxnzhu56LP
gpnjvJSUEzYAACUzSURBVOGgjy/Gq5sAD8g75nxcXOj/Poee7OIsm8fgfMQaYtRHjF3Rsdsx5GhH
e4j1eQf95Ua0K/XSXAV7A1TNGmaU6xieduxWPWfeF43jCE8srjdcR7qdvPkD83cPa+xRD+c7PNW4
jntriqEo3xfWr5iO2btgqZa4yPX3DeaH6ngSwHd8oYdYzjP5HCRL5yvL9eR7ApcIjteO8QCvGnDd
eI18pIvrzDSI83TN7D6OJ3TQH+PpI4D3JE/fzDijARGw/3jYabv5onK77sjTZTOMrT8ZmSxE14bt
StuyzAapMDwCVfMs5WsvbgV1srJunq0rWDv0RedPvPVywZ4S9ZeeuRtU70jvnpKzldAbPusXl3P2
0K/WMo9u9kuzc0/8iSvZSg6NG9eS88V+bNGhFj3WmEgRh+4EuWB+yc6bTZTmzSOZrj5jmTGMveWm
oGMeRe1Gj3tKMPZhnD44bPc2XZLX6kg4fiWPmZj5qsNrcRKtk/9Hv4HjAA4nNdySeWPhzpv7ZJo3
bmzZRqfdUjt6VY6ERXU/E+c1DMDjfFIb+STn/x/9gh9uYMDwQs3YELA2vjoyIJIf+vLKomOjOa5j
jp/Ia0uLlQVY+mgwZyx1JSDuAqSuj/MlMjhk8yb8gTo0exhhk6NeNfNMl9nLKn5yvO/Y4vToVfAk
Ij3pr9PurwADST3B3WtEyuvR3GD4oUBueDCQAAmQAAnMJAH86UIsEHTazmdBKqKb1dapy8tmGOsJ
CSz59P8179eygfrS/TWYIwESmEgC8IwtLyeGPfK+yciaRQlL5n3DMKROrN2EwWIaahpP1Y55/S/e
B6w9KMg/cvaJuObvHX4qjvV7g2HwaAPDdNczPObVN/KxBzjRxJpc1INnbdUYZtpTDj3tYYLHU49z
uZ48edKNjHUJLWMA6Xa1YQqP4gmuZgDas4S3P5n7BUZLDNd0gwueSdhlq0uJ5QiP10r0ImK5l9Hz
FC4mQOEpRkd6N+34ncJR1w3zYuqd/cTji125tYcTnmPELeOR29jbj7uom+N44kaF8cDVonHJOmdw
aZiO9PHFfDHuRuT6lJsYWAvaO5/3k36ht7u7i6Qz3jeez6q6EYD2cHwX548qC9FHfOwSjJ1eqRoX
LAzrejW5zrBLuNxgEgluqMSVo//AC2uicbxx43RRdk2OKtbNuLBmG08cbO2b3anN7sool+PZ6cxH
70BOesKKZLy/GP0jrhkPbafVjnlC7osXzYW7Yj+YdTRfwfxxu6VudmvGLQ94kO33Y3ejNff43kB/
27v95xvk8NDq6xdPWOAJGtxgMg7o3k9U2SVdlgXP1ZMR7rWSeM3sGdCO3ostATeuOtb1Jzdg8GQF
drlumBuHOG9xHWK8jEkgi8D23ZNP04Q+mbmzYb54szodUPnjT14Kaukrn3k1qB5u0BetXMMf2IIV
Czquki/9pA9f2jUC0bX1XTpjleHv3LAHkQXBVa5lOm+P2Vfmk9t1mSYBEiABEiABEiABEiABEhgi
gV/9oV8YYutsekQEfLaVTy7D0mU679LR03HV0Tqnziv/xKnbczUgE0nz+LrqaJndhqRdcCBDOeLK
qy+EPb6rB8E8CZDAeAngEV94iv/uj/xAPKAf/vsfimPIMUp4qODxQ7n2WEEP9bJi7A57dfXRWBUe
F7QPjzb03vOeD8Z68PSgf6yRhucWcq0HjxHax/iwdhMeYMi1HupjPNDDrtTve/cHYhHGgzXS0NNy
3S/a1/2iPjyYZ86ciUUYB44LYhwH6OP9y+979/fG9bDGEv2j/bwxxofxYl6oD+46j3o3btyIi1ZW
VuL40qXEg/A3/+r3oEpfjHroT7eP491XKcpgfuCCdrQe2tPt6PG9910JP5++bhf9Ydwox3FBf/BY
ohz6qA89nE+IMS/we+93JuPztQO5js+fPx+LsFs9yjFOcIBcxxgvYpSD09WrV2PRD77tx+MYxx/z
gn7RWI8P5yH4gJ8eF/pBOb5ncP2i3BejPdT35XGdgYOPo27H128eeTNal183a/Tz6FNndAS4znh0
rCekJ9hXiGXYktbBLpcyl46uk5UfRBupfYzCME4dgKNQJu0zpO0ySWtAdl7S6c/lOTqnaHgE7t5I
f7xveD2zZRIgARIgARIggbIRmPetxy/bQDkeEiABEBDbSttbKJNYytLKta6dH3t6nIaxQLMNYJ3P
C8d1AEQmi2n6X7qZt0WjF7ruoWA3VM8gELrxVkazLJ5AAvDMYuif++zn4yQ8J3fvJpufYZdorX9w
kKxvgqcJnlp4RnyeIKyFhEfzOP97cf/wvMCjjfGh3VdfTdYYwVN2XD/Z7QoeVHhqdD9oT9eD3BfD
kwwPJPS2tpKnaG7fvh2LEKMcMcaFPOaJcUCO2DdulMPjhvrQRzlilGOciFGuYz1OcNR68HDiOKAc
/eG8gRy7n2fxQ/++fjFPeATRPuTII/aNE/oYr86jPnjhuKI99I/6WeNGe4ih7+Oix6Pz8IxubGzE
TeL6Qx7jwnmL6xpyxGj3ueeew9D6YpTjfEOhrq/lyG9ubsZJcLx27VqcR33ooR/kfTH0dH3MU59f
aAe89XmF8YEbjjPq+fpDuY4xLtTT5Vn5ovUmzRj+xKe/UPlT73hzFgaW5yQgj1O/5xd+KKc21UpI
QGwrsbF89lfIkKUtO+i8XTbU9KjWGOtJZE3YLrfTaCdLJuVy0Ea7Mt+MTv8Yx6AZkwAJkAAJkAAJ
kMCsERBjGJ9Zm/s0zLe5m9wsmoa5cA6nJiC2FQxjNJZll7n0XHWgJ3FWua07sPSwPMYyGdsbbA9Y
l9l5Oy11kJfY/kjbdl50JUAm6dgw/rWf+70f+IvvetM/EQHDbBHY3RzLfZHZgjyi2b7jv3wo7ukb
rrxlRD0OtpuPfOQjg22QrZEACZBAyQlMmme45DjHOrxa9CYIGMf1lfWxjoWdj4/Ab/36F/9O1DsM
YxmIbXfZeZHrvC0zxT0d5KHjy0Musda1y4LTo/YY60novD2RtDJbT9Kia+sjL+7+z/3Wb3wp2aFH
NEsc8A7MEg8xHlrXvOqj7OPk+EiABEiABEiABEiABAZHQAxkGMmhrXJ36lBy46sXGcU/GPUu69fE
toKdhQHpPOS+2LbZtI4u03mtP9C8z6trd+LSsWVpaZTZsaRdHzHSIUdaYp1GXhbnib7E0ENsy8Qr
Xo8+8gZCeZuppOVtg6Jj66FdtIFY+rDL9BiR13FUrTcfpF2xLZO0DtIuAwmQAAmQAAmQAAmQAAmQ
wGQTSDP07DKkXbEtk7Trg8edpQxpO5Y0PtBBXjbYko8YweIhlg1a9k1aXoBu6yGNGJtzIYZcYrsf
pCXWacjsOFKL9RBLGUKetEsXsl486EepZWCDNuTQpsT4SB8uOSYGPYnlQLRMLAdW5qwNYhjBOpZ+
IJM0PjCU7XxU3CuH3JYhLbEE0UGw0yLTeeghziqHHmMSIAESIAESIAESIAESIIHRExA7JC3ocjvv
SosMcqQRSz8wPiFz5SGTOOsjxq0YwohRF+1HRXFAXmIJdowyWx4rDeg/9DWQ5gZtGJ9mUDIxGHxI
61i3r2FI3v6IvuTlQMqBRRrGrsRiJEu/iO0ykSMvaXxEhjR0IlGfzJWHzI51WvII0jYDCZAACZAA
CZAACZAACZDAdBAQe8QVbDnSiEVf0vi48tpwdeUhkxgfaRMeXokhRwwZxoIxIJaxIEAHecSQ61jK
IYPu2OJhG8Yy0SLGna1vp21AIsdH2kYasU9XyuUA6zoiE0PXjqNsHOyxS1o+0EXepQOZT0cah45O
S94Otp4tZ5oESIAESIAESIAESIAESGByCIg94gt2GdKIpY6k8XHlxZZBOWJbJmnkdVr0UYa6Ppn0
jWDrSlqCLUsk/f9DD7r9pek5u266ZkDpIAxjDLCoASf1pA5iDN+XF7mrTGR2gF5ILCeEGL6oK+1K
GnLJ22nJSxCZb/5SH2X2fEUuAbIkl/wPfclBz1duy5kmARIgARIgARIgARIgARIYPwHXb3h7VK5y
W4Z0Wixlvo/YJyiz05BJ7JPbOmlpPR/RtQPqisxVpnVderaOL63b9umlygdhGKd24CmUwcMgtGOo
p5VLGT4wIJFPi+22fXqiY5chL7GcOGI0S5C09A0jGnKpK3KMC2nIdRyp9p0kqCd6CJAhL7FdbsuZ
JgESIAESIAESIAESIAESKCcB12/4NBnK7NiXFvtEgjZ2dV7q5/3EDebUd+naMknbY0eZSw49W2fo
6WEaxjIhGHW+tD1BW0fkrrxPJvK0D9rz6eBEgqEreiKTPGJpQ9IyJxjCyCNOm6+0KeUSS4CunXaV
QRZX4n8kQAIkQAIkQAIkQAIkQAITT0D/xrfzrjRkEus0ZHYs9okr75JrmV1P0hK0zJdPtJP/oaNl
aXmUoV/J+9LQHUg8TMM4ZIAyadtglDYAAnLJ4wOZ6KUF6PtiqYsyOTEk2EaxyGAMS5nkpW+RST3E
IsNH5BifLYvEsVzKJUgZ0rHAyJB2xWjXVUYZCZAACZAACZAACZAACZDAeAno3/d6NK5yW6bTyNux
pJGHDSMx5Ighs2OkoZMV6/H78nY70IEMecQiL00YhmEsE7QNNztvp30QAAgGI9oSuV0f+aKxnAQ6
wLCVMp2GTGIZi3xERwJkiDE+jBn6kEsdkUkeAbqSR9ouh54dQ8+WMU0CJEACJEACJEACJEACJFAO
Alm/5zFKW89OSznydpyWljJ8xD5BWmLkEdsypKXM/tj1i6SjZuKAOnZe0lqOch2LHoKdFpnOQy84
HoZh7BuMDN5l0GXJMWnUlTzqIJ0nloMsAYavriPlKEPajqV/bRCLTH8wNpEjHSV7cxe5Hey8nbZ1
dDqvnq7HPAmQAAmQAAmQAAmQAAmQwPAJiB2QJ9h6dlrqIu+KbZmkfR+xZ1CGNGKR22noIZaytHLo
2XFUpdefpCWgHOlYqP4THVfwyV26p5KFGsYY4GkMNLsNO21PSOR2H8hLjLToI++L5YDC6HXp2OVI
61j6EZmMJ+tjjw26IpNgz0fSkOsyyfuC3YZPh3ISIAESIAESIAESIAESIIHxELB/46eNQOvZeZ1G
3o4lnecjdozo6diW+dpBHV+5yBGgI3lb7spDBj27rpSFBLRVuG6oYVy4I1VBBuwy7vREYDi6YmkS
8NAW8jq2de0yOcgSYDRLXtJ2jLYl1h/U0/JItTc/lIlMguTtYOfttK2j03n1dD3mSYAESIAESIAE
SIAESIAEhk9AbI48wdaz01LXzksaeTuGHDKfEWvLkUYsdSVt5+1209JRtThAx85LWuQS7Bi6kCUa
x//75McaQ0gN0jCWCeQx2PLq2dMFHNSV2Jb58iKXAwwDFnoikwC5nYe+xDIfGMqSxkdkElAPcsRS
JmkJtgz5uMD8Bz3IdB5yO86jY+szTQIkQAIkQAIkQAIkQAIkMDoCsFXSetQ6aXnYMdIe9CBDjDLJ
i50COWJbhrTESKOenXfVhSwttsciekVD3jp59TL7H6RhbHcmAxTjDbFdptP2ZLTBhzJbDhnalhgf
9Im8xBLsvBxoGMQit/OSRl8Sa6PYNoil3NZF3pZFKn06dl7SEqCf5JL/XTK7nGkSIAESIAESIAES
IAESIIHJJQA7xZ6BliGfFksZPtIW0oi1kYs84iw9lLti3Z8rLzIJqJ/kjv+HXOKsAB3EWfqFyodl
GOtByODF2EMs5ZiQbQRCJuUSUAY5YrQleTuNconlIwc8zQiOinvGr6SlLRjDiCGTcmlP8vZH5HZe
0hJ8sV0WK1q6yNsx2rFlTJMACZAACZAACZAACZAACUwWAdgqrlHrMjuPtCsWGT7SLtI6tg1hpF0x
ZFLfTrvydh9233YaOiKTgDziRJr8r2WSl4A4yQ3p/1EZxqHDtyGIgSh5HUNH4rS0HFgYya40ZHYs
fcEwRVrHkUqfYYx8WmyXSRoBfSGv46xyrc88CZAACZAACZAACZAACZDA+AjAPvGNwFVuy5BOi6XM
LkfejsXGceUhRyw6vrRd35eWeUqZBDuGflJSwv9HYRgLBDHoEAsGOy15CSLTwTYEUQd6rtiW2Wk5
uNooFpkEeIYRo0+J8RE9pHWsy5B3xbZMpyWPIH0wkAAJkAAJkAAJkAAJkAAJTCcB2Cp6drbclYbM
jiXtykMusW3s6jzKJLbTqA8Z8nljmZvo2sFV1y6XtF0HacRad2D5QRvGMmAYdXbaHrCWY5Kop3WR
l3JbF2m0J7EtkwMIY1jakDLIEEOGviW2DWRXXmT4RMleWmQSdBlkcaH5D7qQ6TzkEqeV2XpMkwAJ
kAAJkAAJkAAJkAAJlJcAbBXXCHWZLw+5xDrtykNPYm3gIo8YusgjhtzVhsgk2Dp23k5DV2R2QF0t
s/NI223YaZQHx6c1jGUwpzHc0urrMkxc+tNp5F2xHFAYuzoWcNIe5JiLxPhAB3nELjlkabGUSZB2
dHDJtI7k8+q56lJGAiRAAiRAAiRAAiRAAiQwXAKwS7J6celpGfJpsZThI30ibcfa0LXzSGfFdns6
bfer05KXIHV8Ia3MV8eWn6r+aQ1jeyBF0zJw28DTE5GyNJldDr2sWA40jGAdS3uQIY32JG9/omxf
XsokZMW2TlzBqoO8S8cuY5oESIAESIAESIAESIAESGCyCcDOsGehZXYe6bRYyvCRdpFGLLaQBBi/
InelIUOM+nliaR96djpLJroSRG8sYVSGsUxQjEYdy6QxeRiVIpMA3SSX/A9dlKMMcsRyEGHk2rHo
u8qkb+hJGmORWPQhs+U+WaTeV1/yElBXp+NC85+tY8t1Oq+ersc8CZAACZAACZAACZAACZDA8AnA
Lsnqyadny11pyCTW6TSZlGmD184jjdjWhwwx+kmL9fxFVwfUhxw6Okb5UOJhGMYyARhudjrvBABA
2kDarmu3DTn0EIscaTlwMHollmDLpD2US9qVh1zqIo3YliFtx3Za6uiQV6brMU8CJEACJEACJEAC
JEACJDCZBGCr2KNPk9llSNuxTkveJxO5Nm7tvCtty9C2L8acXOVSBjn08sZSD8FOQ3aqOI9hLJ26
jLeiHaMdxFJfp0Xm6sulJ7oSRF/KJSCWtBw8GMKQi0z0bUPYTksZ+kcacVQUlyGv9VCeFkuZBNRN
csf/++THGkkqr56uxzwJkAAJkAAJkAAJkAAJkMDwCcD+yOrJp6flyKfFdpmk8ZExII3YZejaMjuN
OhL75K4+RCZB6rkC2kWZrYc0YuiExpnt5DGMpXM05DLI0spQ11cPcmkDadSRGEHK0A9kiG25HCgY
w1KOMpFLGyiz9VAm5fhEyV7aJ7N1XGmRSZD6CHY6TZanDDqMSYAESIAESIAESIAESIAEJoMA7BPX
aF1ltsyVFhnkrrQug47YQEjr2C6z02l6uszOy1ztvKTtYOfttE/HlkvaVyerrK+dvIZxX6UcGRmc
ywh0VbV1MSm7LmS6LnR0uZ2XAwljWOpLXuq5vMQuPdFFP0gjjopOlNkyO402RCZB5xOpX45yxiRA
AiRAAiRAAiRAAiRAAtNDwLZd7FlpOfKIRRdpie00yiC3y2wZ0i7jN68MbaAPV9/QkTIELbPrQ8cX
F9H1tXFCPizD+ERHRiCTEKNQx1IMGdISS/AZkT4gWm4bw0mLxwaytA2DGHoi0x+pZ8vsPNJpsZRJ
kDZ0cMlsnaxyW5dpEiABEiABEiABEiABEiCBchLQdooepatcy5BPi+0ySbvykNuxyxiWcp/crmun
9byQd+mIDAFpHaN8qPEwDWOZUF6jzta10zJ5gMkLQg4cjF27jm342uW2XMarP9KGLbPzrrTIJNhz
96UTzeP/bb1jKVMkQAIkQAIkQAIkQAIkQALTSCDN1rHLstJSDh1XWpdBxxdnGcNZ5a527eOH8YjM
Tts6rnQRXVd9r2yQhrEM0mfY2WVI61gGCRnSEqNNKcsb5EDZxq+ul2UMS5/4SF2kMRbkUeaKbZlO
S14C2kty7v/z6LhrUkoCJEACJEACJEACJEACJFAWAnnsGZeOLXOlIbNjnXblRRbyKWoUgz/6svM6
bY9TlyFvx9C3ZUHpQRrGWQOQQacZeSjH5EQXaWnbrmvLpcwVXMavz1hG39KH/kjbtgz5PLGtI2kJ
9jwSyfH/aWXHWkyRAAmQAAmQAAmQAAmQAAlMA4E0u0aX2Xmk88SiY+shb8fC0s4jXdQIRj372EAm
sQTkkY6Fnv9Qx1M8OPGwDWOZiMvYg9wXywxRhrTECGhTdIoEl7EsbaE9aQv9Qi4xZFIOOdKu2Jbp
tOQl2H0mEvf/efXctSklARIgARIgARIgARIgARIoA4G8totLz5a50pDZsZ2W+Uve/rhkdnlIWtqU
oOsm0kSu06IrQceJ9Ph/lB9LBpgatGEsg00z5FzlaTJMHm0iDwQi1zKU5YnRt7Rjf7Rc2sIYoKdl
kpcAPZ125UUmwa6TSPg/CZAACZAACZAACZAACZDArBDw2TRabuddacgkttPCETJbbsvS5FrPldd9
oD1bjrTEdrB1IXfJUCZxVrmtm5ketGHs6lAG7DL8tBx5HUubIpMg7SAdC4xM0lqOcsRoV9qwP1Lu
KrNlooM5oK4ts9PQE5mErHyi1f+/rtNfyhwJkAAJkAAJkAAJkAAJkMAkE8iyXWRuWseXt+VIS2yn
0Z4tg45PhnK7LmR2LOUSbJmkJUCW5NxjQhn07TzSaA/5gcdFDWMMKM1wE52i5aijY5mwLZM82hZ5
noD6qGfX0WV2XvSRlzqoL7GdljIJkOm0K++TiTxPsPvKo08dEiABEiABEiABEiABEiCB0REQOyI0
uOpqmZ13pUUGuSvW5b485HYbtswlx7yhJ3no2WnIEKOerWPL7LSrTpFyWzdOFzWMTzSQUyADdxlz
LjlkmKzUg0y603KRSYBekkv/H+1hTHbeTqNdtG3H6AFtIEYdlLvyectsPaZJgARIgARIgARIgARI
gASmlwDsHNcMdZmdRxqx1EfajvOmtZ7k88rQN/SRRww5YpEjuGRS5pOj3kDiYRnGMnjbUJTB2jJX
2pbZk4NcYgkwTpNc+v+oCy3kMTZf3pYjLW2gHmKfzJZLWoJdJ5Gc/D+PzslalJAACZAACZAACZAA
CZAACUwiAbE1soLW8eVtOdKu2Cez5ZI+TV7mpNtwzdPuA+WQoQ3IEdvlkJ06HpZhnGdgMiFtCEKW
FkvbUs/WEZkEyJNc///Qh9TOI436diz6kpfgiqWuBJQluZN5lw50dazb0uXMkwAJkAAJkAAJkAAJ
kAAJTC4B2BBZM3DpaZmdR7pIbOvqtM7LeEWm5XbepQOZKxYZAtpBfmTxaQywPHVdOrYsK41yV5wl
s8vzpAW66Nm6kNmxnYauLZO0BLsskbhlKPPFrnZ8upSTAAmQAAmQAAmQAAmQAAmUk0CI0eeqo2V2
HmnEQgJpV5wls8vzpNGfrQuZK7ZlaWkpk4B2k5z7/zw6J2qe1ujKqu8q1zI770pDlha7ymyZnRYI
ks8rg77EElAvLa3LJC/BrptIsv8PqZPdKjVIgARIgARIgARIgARIgARGSSDEYHPV0TI7n5VGuR3b
aeEh+SxZVjnaSYvtMp125X0ykSNgXMjnjk9rdOWp79LRMjvvSkOWJ3bpuGQCSeRpZQCpdVBXl/vy
WXKUu2L07SqjjARIgARIgARIgARIgARIYDIIhBhtvjpabudd6TQZyiS200LVzttplLlkKEuL7TKd
duV9MpHbAeOxZbnSpzW68tZ36WmZnUcasUwG6ZA4pI7dZ9601pO8BPSf5LL/L6qf3SI1SIAESIAE
SIAESIAESIAEykKgqAHn0tcyO5+VRnmRuIiucNb6WTIcG9RD3q5ny1xpV12X3gnZIAywPG34dGy5
nZaBIo84rwz6EttpV31d7tLxyWy5pCWgvSSX/O+S2eV2uoiuXY9pEiABEiABEiABEiABEiCBySNQ
xJBz6WqZL2/LkUYs1JDOE2fpuNrzyWy5TkseAX0i74rz6LjqxbJBGGJ523DpaVlaHmWIZQJIF43z
1LV10tK6TPISMKYkd/L/rPKTNSghARIgARIgARIgARIgARKYdgJZBp6rXMvsfFYa5ToWzlqWN++q
a8skLQHtJbmTeZcOdHWs29LlqflBGWd523HpaVlaHmWIZXJII3bJUIY4TccuS0vrMldeZAh235Ax
JgESIAESIAESIAESIAESIIE0AmkGny5Ly9tlrjRkiGVMSPtil06WTMoloM0kdzLv0oGujnVbujwz
P0hjLU9bPh0tT8vbZUgjlgkjjfi0Mru+Tktegt1XIkn+98ltHTtdVN+uyzQJkAAJkAAJkAAJkAAJ
kMBkEShq0Pn0XXJbZqeFEPKIhymz25a0BLtfVz5WcuhBbse6Lbssd3qQhljetnx6Wp6Wt8tcaZdM
oECO2JblTYueBLuNROKWocxXxy5nmgRIgARIgARIgARIgARIgARAIMvoc5VnyezyrPRpy2Uedht5
8nnnXlQP+s7YZdw5FXMK87bn09PytLyvzJYPKi3Tt9sCDpfMp4s6abGvvbQ6LCMBEiABEiABEiAB
EiABEphMAtpozDsLXz2XXMvs/CDSdhsyfjtvp3WZKy8yCbpeIj35f169kzWVZBiGWN42fXouuZbZ
+dOkBYevvi5z5X0ykSPY7UPGmARIgARIgARIgARIgARIgASKEMgyAl3lWpaWz1tm6+VJyxxtPczZ
JfPpoo4d++rbOrnTwzDairTp03XJtSwtb5fZaQFj5+20LnPli8hE1xV0ny4dykiABEiABEiABEiA
BEiABGabQBHDz6WbR6Z17LydliNh531prefK+2RpcinTwR6DLiucH5aRVqRdn65LrmWnyRetC7i6
XpYc5b7Y155Pn3ISIAESIAESIAESIAESIIHpIxBq6Pnq5ZVrPTtvp4X4afOuNnAkdduQu+L/v707
yWEbBwIA+P9fzxAJAULhvkiWXTlEMnshVcylTxnJzdX/s3ZyKBvpXcvNxa5ru38HqGvPiFdar9XE
2t5nbY/eHvIIECBAgAABAgQIEPhMgV2DXa1PKZZbv67t/h1u4dozvZlaLM1r9bnmdv8+PYCN9K/l
5mI9a7tyImiuX4yFZyue5o68n+o7cga5BAgQIECAAAECBAjMCYwMfiM7tPqW4rn169r1dzjXde36
O5dTWgvr4U+ux5/Iv3+P5P5bXVk5PXCN9q/ll2K59Z61XE6gGl2PvKW6GN/5vHOvnefWiwABAgQI
ECBAgMAvCBwb4DJ4rb1K8d71XF7vWjhuLjd+Ri0Wc9LnaH5aW32/Y8Aa3aOVX4rn1nvXAlIut7ae
wpZq05zZ95O9Z8+kjgABAgQIECBAgACBMYFjQ93/x+jpXcoZWc/l5taCTGk9qrXiMS8+R/NjXdfz
rqFrZp9azWislF9aD3i1WE+86wL+JrX2GukllwABAgQIECBAgACBdwnsHPpavWrxUiy3nluL6rOx
WH991vpdc6d+3zmQzezVqqnFS7HSegCsxXritUto9a7VihEgQIAAAQIECBAg8JsCK0Nhq7YWL8VK
6+F2arGeeO6GWz1zNcNrdw9rs/u16mrx2VjErNXHnPQ5mp/WeidAgAABAgQIECBAgECPwOjA2JNf
y5mNhW+p1da+dbau1jMbe2qIm9m3p6aVsxpPEVu90lzvBAgQIECAAAECBAgQuENgZJhs5a7Gw/e2
euRMZmpyfbrXnhzuZvfuqduVEyB7enWDH+g3srdcAgQIECBAgAABAgTeIbB7OOzt15O3Kyd3Ez29
c3VLa7uHvtHDrOzfW7s77/qNvf2vdX4TIECAAAECBAgQIEBgl8DsQNlbtzsv9929e+Rql9Y+Yahb
PcNI/UhugB3NX7qMpPipfZMjeCVAgAABAgQIECBA4JDAUwPg6L4j+SO5OdbV+lzP7rVPGsBWzzJT
P1OT4q7Wp728EyBAgAABAgQIECBAYEVgdbicqZ+pSb9xtT7tNf3+aYPdjvOs9Fipnb2EJ/acPas6
AgQIECBAgAABAgTOCDwxIK7suVIbBXf0iL2Wnp86lO0616f1WbosxQQIECBAgAABAgQIEJgQ2DWA
flqfCYp8ya7BMd99bfXE2U70jF95snfcw5MAAQIECBAgQIAAAQKpwK5hNe0Z30/0PtEznnf6+YZh
7tQZT/WdvgyFBAgQIECAAAECBAgQeFjg1OB6qu8WrjcNh3ec9Y49tlycJgQIECBAgAABAgQIEFgU
uGNYvWOPRYbn/jui1YM/McA+seeqk3oCBAgQIECAAAECBH5b4InB9Ik9l2757cPeG87/hjMu/SNS
TIAAAQIECBAgQIDAcYE3DJtvOGP2or5paPumb8lelkUCBAgQIECAAAECBAh8mMBrh+HU8VuHyW/9
rvTuvBMgQIAAAQIECBAgQOAJga8YhlO4Xxkgf+U707v1ToAAAQIECBAgQIAAgR0CXzcIX1F+eWD8
5W+//jvwmwABAgQIECBAgAABAkHg64fg3DUbDnMqf9bYlG1ECBAgQIAAAQIECBB4p8BPDr6tqzL8
tYTG40zHzVQQIECAAAECBAgQIDAmYMAd85JNgAABAgQIECBAgAABAgQIECBAgAABAgQIECBAgAAB
AgQIECBAgAABAgQIECBAgAABAgQIECBAgAABAgQIECBAgAABAgQIECBAgAABAgQIECBAgAABAgQI
ECBAgAABAgQIECDw8wL/AdGTj8jLOCkKAAAAAElFTkSuQmCC
"
>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="6.-Surround-your-player-with-diamonds!">6. Surround your player with diamonds!<a class="anchor-link" href="#6.-Surround-your-player-with-diamonds!">&#182;</a></h3><p>We can place as many Diamond blocks as we desire, not only underneath the player. Let's build a Diamond flooring around the player.</p>
<p>First, let's obtain the player's coordinates again in case we have moved:</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[9]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">position</span> <span class="o">=</span> <span class="n">mc</span><span class="o">.</span><span class="n">player</span><span class="o">.</span><span class="n">getPos</span><span class="p">()</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered">
<div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>We will use 9 Diamond blocks in total, creating a 3x3 square in the ground just below us. In this case, we will subtract 1 from the <strong>height</strong> coordinate directly when placing the blocks, and we will also move the <strong>other two</strong> coordinates to complete the square:</p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[10]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
<span class="n">mc</span><span class="o">.</span><span class="n">setBlock</span><span class="p">(</span><span class="n">position</span><span class="o">.</span><span class="n">x</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">y</span> <span class="o">-</span> <span class="mi">1</span><span class="p">,</span> <span class="n">position</span><span class="o">.</span><span class="n">z</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="n">block</span><span class="o">.</span><span class="n">DIAMOND_BLOCK</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[11]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">Image</span><span class="p">(</span><span class="s2">&quot;images/diamond_floor.png&quot;</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area"><div class="prompt output_prompt">Out[11]:</div>


<div class="output_png output_subarea output_execute_result">
<img src="data:image/png;base64,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
Mx0xM/O1AUm2HYAuwnxfPqsAE2SBnE+Yuf25K1W54F/0F7K6BfrcwVW0AAABnWlUWHRYTUw6Y29t
LmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0
az0iWE1QIENvcmUgNS40LjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMu
b3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJk
ZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczpleGlmPSJodHRwOi8vbnMuYWRvYmUuY29tL2V4
aWYvMS4wLyI+CiAgICAgICAgIDxleGlmOlBpeGVsWERpbWVuc2lvbj45NjY8L2V4aWY6UGl4ZWxY
RGltZW5zaW9uPgogICAgICAgICA8ZXhpZjpQaXhlbFlEaW1lbnNpb24+NjE0PC9leGlmOlBpeGVs
WURpbWVuc2lvbj4KICAgICAgPC9yZGY6RGVzY3JpcHRpb24+CiAgIDwvcmRmOlJERj4KPC94Onht
cG1ldGE+CngtFjsAAEAASURBVHgB7L15vGVJVecbN2/O8zxnzaMUJVhUCTJrWyCF7/FQeSiivid0
t91It2jzxA/2H06IH1ucPq3vQX8UW22eij4VsAFtQAVaKIQqhiqyqqgxsyqzsnKeb+a9L757n985
66wbezjnnnvzZmaszHMjYsWKYa+9d0T8YkXEDiFT1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDW
QNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA
1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDW
QNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1kDWQNZA1sClr4GxS/8S5/wKs07nXOW5wKyBrIGs
gayBrIGsgayBrIGsgctOA1OX3RXP4gVnEFet3Kybat3kmKyBrIGsgayBrIGsgayBrIGsgayBi1MD
GVAn7tvlDP4u52tPPAqZlTWQNZA1kDWQNZA1kDWQNZA1kDWQNRAuS+B8uYDDy+U683ucNZA1kDWQ
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
DLm4ZN7RLRbY8id941XPzu7t4pKZGXHXzGtqrXj8tW9u7D95ZDT5bU6u5dPLc1+p2V+1YhCUVZzd
wDWdrR17u+SGt+W7VAxDeXo3cWFZuGwTBi9Vl9Wl+ub98Tc+8ZvbyycPi+EKLOS3xrywLaMw4n2x
Lpub62+zaST1XbaT3vS8X/a1ucnK0l5N1be+m4HPG/jty+Zltg01eSv8/JO7bnQfPCveSvrBfGK7
29nHvMr02ednmdGMV4Iyrc5tXxnbePUJb9P0Pa/1GY8wYff2fOldmkm4/zsfe/6SroUZ/5t1xWi9
7bts7fvil4oX+RtfLkOHr90sFwgfamd57n1iGNVO3rhd3uZp32Pqmhr0kPCN37a52xY+8x233CsM
jXHOG0PNCdEeeh//7v2yLYd1hL689wU7f6DrE8m37tk5UzpZVk6sieu3yjZJJD/68uIcDw2PpV55
zKG//Y35Bbq9uMUN1+PD0we2ymIM3/jt+ZZKj6rHHbm2L4BmLrE30744z3iDWpvtvx3vm7Xbh9TS
N/voJVDJZ8No7Qb02TrsmTLHwsOwWTx6b9s2Ts/q3NOYjyHCrdf4bh1poDmpjx7NMSKv5sJdu1F+
e/ZY7UVyzvOS6crl8mBHNwi8XIph2/SYOiGPneb9yZOiOZDkKSWV3O0qwPIcH/GU8faIjy4miv2t
0rwlqkee41szbEvLWS2aoH1H7Z7vQb/9krI26kCKUWO1r7c6cFR9ZivXv7T3STdr/fLESkdzZpVu
4+d1SLqeoeW50qra5dWb/c4ul9/HjRvD87Ni2fJIb/u1FhyqtOIpz95BXVF+lrfirBEA4r94/mJj
26aPzDzFEgzE8iy24tZTLLmOA/cJwiVfvV9SPIkyuhZ9ncKrvr+dZdg1jz2Hdq/u/67fgxSG2oec
hbL2dS3QeVfPnys2RYBAPy7ZCA39PjgPCNfq6sh71bNOv/ZslFQblE9TD7S/svTkoVVaMcVum8eE
d6rcjm7a+cB1Z2fz2cwjhK6ut8rHPtHcH2Tg7df9ntnnm6Dz5Zq9LMXIa8/jdk2AI7/bWhFHR/eq
yvJo33Bk2sHVeh5qJINGWNjTuOezS8tC4Dx9aaMddq7ai21zZ3MdJagfC8qW0O92qH3Sbz3j8rQP
GRg79d49NNxTZ6VGRDByhgW2dZ1SvW9izLnanh9vYj/PU5+YF9wax1Pbh4GMJ5k1YTSFSTth7NQ1
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
"
>
</div>

</div>

</div>
</div>

</div>
    </div>
  </div>
</body>
</html>

