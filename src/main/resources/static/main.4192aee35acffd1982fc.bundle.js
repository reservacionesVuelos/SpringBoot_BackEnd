webpackJsonp([1,4],{152:function(t,e,n){"use strict";var r=n(0);n.d(e,"a",function(){return a});var o=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},i=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},a=function(){function t(){this.config="https://reservacionesvuelos.herokuapp.com"}return Object.defineProperty(t.prototype,"apiURL",{get:function(){return this.config},enumerable:!0,configurable:!0}),t=o([n.i(r.c)(),i("design:paramtypes",[])],t)}()},218:function(t,e,n){"use strict";var r=n(0),o=n(146),i=n(152),a=n(9),c=(n.n(a),n(689)),s=(n.n(c),n(688)),l=(n.n(s),n(687));n.n(l);n.d(e,"a",function(){return p});var f=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},u=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},p=function(){function t(t,e){this.config=t,this.http=e}return t.prototype.get=function(t){return this.http.get(this.config.apiURL+"/"+t,this.getRequestOptions()).map(this.extractData).catch(this.handleError)},t.prototype.post=function(t,e){return this.http.post(this.config.apiURL+"/"+t,e,this.getRequestOptions()).map(this.extractData).catch(this.handleError)},t.prototype.getRequestOptions=function(){var t=new o.c({"Content-Type":"application/json"});return new o.d({headers:t})},t.prototype.extractData=function(t){return t.json()},t.prototype.handleError=function(t){return a.Observable.throw(t._body)},t=f([n.i(r.c)(),u("design:paramtypes",["function"==typeof(e=void 0!==i.a&&i.a)&&e||Object,"function"==typeof(c=void 0!==o.b&&o.b)&&c||Object])],t);var e,c}()},219:function(t,e,n){"use strict";var r=n(0),o=n(218),i=n(146),a=n(152);n.d(e,"a",function(){return f});var c=this&&this.__extends||function(t,e){function n(){this.constructor=t}for(var r in e)e.hasOwnProperty(r)&&(t[r]=e[r]);t.prototype=null===e?Object.create(e):(n.prototype=e.prototype,new n)},s=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},l=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},f=function(t){function e(e,n){t.call(this,e,n),this.config=e,this.http=n,this.resourceUrl="user"}return c(e,t),e.prototype.joinFlight=function(t,e){return this.post(this.resourceUrl+"/"+t+"/joinFlight",e)},e.prototype.obtainReservedFlights=function(t){return this.get(this.resourceUrl+"/"+t+"/reservedFlights")},e=s([n.i(r.c)(),l("design:paramtypes",["function"==typeof(o=void 0!==a.a&&a.a)&&o||Object,"function"==typeof(f=void 0!==i.b&&i.b)&&f||Object])],e);var o,f}(o.a)},335:function(t,e,n){"use strict";var r=n(0),o=n(218),i=n(146),a=n(152);n.d(e,"a",function(){return f});var c=this&&this.__extends||function(t,e){function n(){this.constructor=t}for(var r in e)e.hasOwnProperty(r)&&(t[r]=e[r]);t.prototype=null===e?Object.create(e):(n.prototype=e.prototype,new n)},s=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},l=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},f=function(t){function e(e,n){t.call(this,e,n),this.config=e,this.http=n,this.resourceUrl="flight"}return c(e,t),e.prototype.getAllFlights=function(){return this.get(this.resourceUrl+"/")},e=s([n.i(r.c)(),l("design:paramtypes",["function"==typeof(o=void 0!==a.a&&a.a)&&o||Object,"function"==typeof(f=void 0!==i.b&&i.b)&&f||Object])],e);var o,f}(o.a)},395:function(t,e){function n(t){throw new Error("Cannot find module '"+t+"'.")}n.keys=function(){return[]},n.resolve=n,t.exports=n,n.id=395},396:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(483),o=n(0),i=n(518),a=n(514);i.a.production&&n.i(o.a)(),n.i(r.a)().bootstrapModule(a.a)},513:function(t,e,n){"use strict";var r=n(0),o=n(329);n.d(e,"a",function(){return c});var i=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},a=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},c=function(){function t(t){this.router=t}return t=i([n.i(r._6)({selector:"app-root",template:n(680),styles:[n(676)]}),a("design:paramtypes",["function"==typeof(e=void 0!==o.b&&o.b)&&e||Object])],t);var e}()},514:function(t,e,n){"use strict";var r=n(102),o=n(0),i=n(474),a=n(146),c=n(329),s=n(513),l=n(374),f=n(516),u=n(517),p=n(218),d=n(219),h=n(335),v=n(152),g=n(515);n.d(e,"a",function(){return R});var y=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},b=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},m=[{path:"",component:f.a},{path:"consult-reservation",component:g.a},{path:"**",component:u.a}],R=function(){function t(){}return t=y([n.i(o.b)({exports:[],declarations:[s.a,f.a,u.a,g.a],imports:[l.a.forRoot(),r.a,i.a,a.a,c.a.forRoot(m)],providers:[p.a,d.a,h.a,v.a],bootstrap:[s.a]}),b("design:paramtypes",[])],t)}()},515:function(t,e,n){"use strict";var r=n(0),o=n(219);n.d(e,"a",function(){return c});var i=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},a=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},c=function(){function t(t){this.userService=t,this.reservationTitle="Find reservations for a persson",this.flights=[]}return t.prototype.ngOnInit=function(){},t.prototype.consultReservations=function(){var t=this;null!=this.selectedCedule&&this.userService.obtainReservedFlights(this.selectedCedule).subscribe(function(e){t.flights=e},function(e){t.flights=[],alert(e)})},t.prototype.cleanPage=function(){this.selectedCedule=null,this.flights=[]},t=i([n.i(r._6)({selector:"app-home-page",template:n(681),styles:[n(677)]}),a("design:paramtypes",["function"==typeof(e=void 0!==o.a&&o.a)&&e||Object])],t);var e}()},516:function(t,e,n){"use strict";var r=n(0),o=n(374),i=n(335),a=n(219);n.d(e,"a",function(){return l});var c=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},s=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},l=function(){function t(t,e,n){this.popup=t,this.flightService=e,this.userService=n,this.airlines=[],this.typeFlights="Flights",this.isAdult=!1}return t.prototype.ngOnInit=function(){var t=this;this.flightService.getAllFlights().subscribe(function(e){t.airlines=e})},t.prototype.reservate=function(t){this.selectedFlight=t,this.popup.options={header:"Make a reservation",color:"#5cb85c",widthProsentage:40,animationDuration:1,showButtons:!0,confirmBtnContent:"Reservate",cancleBtnContent:"Cancel",confirmBtnClass:"",cancleBtnClass:"",animation:"fadeInDown"},this.popup.show(this.popup.options)},t.prototype.confirmReservation=function(){var t=this;this.isAdult?null!=this.cedule?this.userService.joinFlight(this.cedule,this.selectedFlight).subscribe(function(e){e?alert("Success, you have reserved the flight successfully "):alert("Yoy cant reserve this flight, probably is because you already have a reserve for that day"),t.popup.hide()}):alert("You need to specify the cedule number."):alert("You need to be adult to confirm the reservation.")},t.prototype.cancelReservation=function(){},t=c([n.i(r._6)({selector:"app-home-page",template:n(682),styles:[n(678)]}),s("design:paramtypes",["function"==typeof(e=void 0!==o.b&&o.b)&&e||Object,"function"==typeof(l=void 0!==i.a&&i.a)&&l||Object,"function"==typeof(f=void 0!==a.a&&a.a)&&f||Object])],t);var e,l,f}()},517:function(t,e,n){"use strict";var r=n(0);n.d(e,"a",function(){return a});var o=this&&this.__decorate||function(t,e,n,r){var o,i=arguments.length,a=i<3?e:null===r?r=Object.getOwnPropertyDescriptor(e,n):r;if("object"==typeof Reflect&&"function"==typeof Reflect.decorate)a=Reflect.decorate(t,e,n,r);else for(var c=t.length-1;c>=0;c--)(o=t[c])&&(a=(i<3?o(a):i>3?o(e,n,a):o(e,n))||a);return i>3&&a&&Object.defineProperty(e,n,a),a},i=this&&this.__metadata||function(t,e){if("object"==typeof Reflect&&"function"==typeof Reflect.metadata)return Reflect.metadata(t,e)},a=function(){function t(){}return t.prototype.ngOnInit=function(){},t=o([n.i(r._6)({selector:"app-page-not-found",template:n(683),styles:[n(679)]}),i("design:paramtypes",[])],t)}()},518:function(t,e,n){"use strict";n.d(e,"a",function(){return r});var r={production:!0}},676:function(t,e){t.exports="body{margin:0;font-family:Arial,Helvetica,sans-serif}.topnav{overflow:hidden;background-color:#803a3a}.topnav a{float:left;color:#f2f2f2;text-align:center;padding:14px 16px;text-decoration:none;font-size:17px}.topnav a:hover{background-color:#ddd;color:#000}.topnav a.active{background-color:#4caf50;color:#fff}"},677:function(t,e){t.exports="h1{font-size:45px;line-height:48px;margin:0}h1,h2{color:#7c795d;font-family:Trocchi,serif;font-weight:400}h2{font-size:28px;line-height:32px}.subheader,h2{margin:0 0 24px}.subheader{font-size:26px;font-weight:300;color:#fc6}p{font-family:Source Sans Pro,sans-serif;font-size:18px;line-height:32px;margin:0 0 24px}a,button,p{color:#4c4a37}a,button{background:#cfce9a;text-decoration:none}a:hover,button:hover{color:#fc6}.centerForm{display:initial!important}.bottonPadding{padding-bottom:10px}"},678:function(t,e){t.exports="#centerImage,#wrapper{display:-ms-flexbox;display:flex;-ms-flex-align:center;align-items:center;-ms-flex-pack:center;justify-content:center}h1{font-size:45px;line-height:48px;margin:0}h1,h2{color:#7c795d;font-family:Trocchi,serif;font-weight:400}h2{font-size:28px;line-height:32px}.subheader,h2{margin:0 0 24px}.subheader{font-size:26px;font-weight:300;color:#fc6}p{color:#4c4a37;font-family:Source Sans Pro,sans-serif;font-size:18px;line-height:32px;margin:0 0 24px}a{color:#f90;background:#cfce9a;text-decoration:none}a:hover{color:#fc6}.center{margin:auto;padding:0 100px}"},679:function(t,e){t.exports=""},680:function(t,e){t.exports='<nav class="navbar navbar-expand-sm navbar-dark" style="background-color:#803a3a">\n    <ul class="navbar-nav">\n      <li class="nav-item active">\n          <a class="nav-link" routerLinkActive="/" routerLink="/">Home</a>\n          \n      </li>\n      <li class="nav-item">\n          <a class="nav-link" routerLinkActive="/consult-reservation" routerLink="/consult-reservation">Consult reservations</a>\n      </li>\n    </ul>\n  </nav>\n\n<div class="container-fluid">\n  <router-outlet></router-outlet>\n</div>\n'},681:function(t,e){t.exports='<h1 class="text-center jumbotron">\r\n    {{reservationTitle}}\r\n</h1>\r\n<br>\r\n\r\n<div align="center">\r\n    <form>\r\n        <div class="form-row align-items-center centerForm">\r\n            <div class="col-auto my-1">\r\n                <label class="mr-sm-2" for="inlineFormCustomSelect">Enter the cedule number: </label>\r\n                <input type="number" [(ngModel)]="selectedCedule" required [ngModelOptions]="{standalone: true}">\r\n            </div>\r\n            <div class="col-auto my-1">\r\n                <div class="bottonPadding">\r\n                    <button (click)="consultReservations()" class="btn btn-primary">Find reservations</button>\r\n                </div>\r\n                <div>\r\n                    <a (click)="cleanPage()" class="btn btn-primary">Clean</a>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </form>\r\n</div>\r\n\r\n<br>\r\n<br>\r\n<div *ngIf="flights.length>0">\r\n    <div class="row card-group">\r\n        <div class="col-5" *ngFor="let flight of flights; let i = index">\r\n            <div class="card w-100 ">\r\n                <div class="container">\r\n                    <div class="row">\r\n                        <div class="col-sm" id="centerImage">\r\n                            <img class="center-block" src="{{flight.flightImageUrl}}" style="width:100%">\r\n                        </div>\r\n                        <div class="col-sm bottom-align-text">\r\n\r\n                            <h4>{{flight.origin}} - {{flight.destiny}}</h4>\r\n                            <h5>{{flight.flightDay | date : "medium"}}</h5>\r\n                            <h6>${{flight.cost}} COP</h6>\r\n\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n\r\n        <br>\r\n        <br>\r\n    </div>\r\n</div>'},682:function(t,e){t.exports='\r\n\r\n<h1 class="text-center jumbotron">\r\n    {{typeFlights}}\r\n</h1>\r\n<div *ngFor="let airline of airlines" class="center">\r\n    <h1>{{airline.name}}</h1>\r\n    <div class="row card-group">\r\n        <div class="col-5" *ngFor="let flight of airline.flightList; let i = index">\r\n            <div class="card w-100 ">\r\n                <div class="container">\r\n                    <div class="row">\r\n                        <div class="col-sm" id="centerImage">\r\n                            <img class="center-block" src="{{flight.flightImageUrl}}" style="width:100%">\r\n                        </div>\r\n                        <div class="col-sm bottom-align-text">\r\n\r\n                            <h4>{{flight.origin}} - {{flight.destiny}}</h4>\r\n                            <h5>{{flight.flightDay | date : "medium"}}</h5>\r\n                            <h6>${{flight.cost}} COP</h6>\r\n\r\n                        </div>\r\n                        <div class="col-sm" id="wrapper">\r\n                            <a (click)="reservate(flight)" class="btn btn-primary">Reserve</a>\r\n\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <br>\r\n    <br>\r\n</div>\r\n\r\n\r\n<popup (confirmClick)="confirmReservation()" (cancelClick)="cancelReservation()">\r\n    <label>Are you of legal age? (more than 18 years) :\r\n        <input type="checkbox" [checked]="isAdult" (change)="isAdult = !isAdult">\r\n    </label>\r\n    <br/>\r\n    <br/>\r\n    <br/>\r\n    <label *ngIf="isAdult">Enter your cedule:\r\n        <input type="number" [(ngModel)]="cedule" required>\r\n    </label>\r\n\r\n    <br/>\r\n    <br/>\r\n\r\n\r\n</popup>'},683:function(t,e){t.exports='<p>\r\n    The page you were looking for was not found\r\n</p>\r\n<p>\r\n    <a routerLink="/">Back to Home</a>\r\n</p>'},720:function(t,e,n){t.exports=n(396)}},[720]);