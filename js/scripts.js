// Execute the function markWeek when document is ready
// Dependencies: jQuery
$(onDocumentReady);

function onDocumentReady(jQuery) {
  // Linkify
  $('p').linkify();
  
  // Markera veckor
  markWeek();
  
}

function markWeek(jQuery) {
  var date = new Date();
  var currentWeek = date.getWeek();

  //var startWeek2016 = $("h3:contains(2016) + table tbody td:first").text(); // 2

 var startWeek2016 = $("h3:contains(2016) + table tbody td:first").text(); // 2
  var currentWeekTableRow = currentWeek- startWeek2016 -17; //hårdkodat för att kompensera för veckorna under sommaren


  // Style weeks in the past in 2016
  $("h3:contains(2016) + table tbody tr:lt(" + currentWeekTableRow + ")").toggleClass("past-week");

  // Style current week in 2016
  $("h3:contains(2016) + table tbody tr:eq(" + currentWeekTableRow + ")").toggleClass("active-week");

}

// Source: http://weeknumber.net/how-to/javascript
// Returns the ISO week of the date.
Date.prototype.getWeek = function() {
  var date = new Date(this.getTime());
  date.setHours(0, 0, 0, 0);
  // Thursday in current week decides the year.
  date.setDate(date.getDate() + 3 - (date.getDay() + 6) % 7);
  // January 4 is always in week 1.
  var week1 = new Date(date.getFullYear(), 0, 4);
  // Adjust to Thursday in week 1 and count number of weeks from date to week1.
  return 1 + Math.round(((date.getTime() - week1.getTime()) / 86400000 - 3 + (week1.getDay() + 6) % 7) / 7);
}
