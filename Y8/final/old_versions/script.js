function loadchart() {

    userCountry = document.getElementById('demo-auto').value
    userCountry2 = document.getElementById('demo2-auto').value
    document.getElementById("demo-auto").value = '';
    document.getElementById("demo2-auto").value = '';
    var obj = data
    var needle = userCountry;
    var needle2 = userCountry2;
    var year1 = '2017'
    var year2 = '2016'
    var year3 = '2015'
    var year4 = '2014'
    var year5 = '2013'
    var year6 = '2012'
    var year7 = '2011'
    var year8 = '2010'

    // iterate over each element in the array
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year1  && (obj[i].dims.GHO == theGHO))) {
         value1 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle && (obj[i].dims.YEAR == year2  && (obj[i].dims.GHO == theGHO))) {
         value2 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year3  && (obj[i].dims.GHO == theGHO))) {
         value3 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year4  && (obj[i].dims.GHO == theGHO))) {
         value4 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year5  && (obj[i].dims.GHO == theGHO))) {
         value5 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year6  && (obj[i].dims.GHO == theGHO))) {
         value6 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year7  && (obj[i].dims.GHO == theGHO))) {
         value7 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle  && (obj[i].dims.YEAR == year8  && (obj[i].dims.GHO == theGHO))) {
         value8 = obj[i].Value
        // obj[i].name is the matched result
      }
    }

    // iterate over each element in the array
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year1  && (obj[i].dims.GHO == theGHO))) {
         value21 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2 && (obj[i].dims.YEAR == year2  && (obj[i].dims.GHO == theGHO))) {
         value22 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year3  && (obj[i].dims.GHO == theGHO))) {
         value23 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year4  && (obj[i].dims.GHO == theGHO))) {
         value24 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year5  && (obj[i].dims.GHO == theGHO))) {
         value25 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year6  && (obj[i].dims.GHO == theGHO))) {
         value26 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year7  && (obj[i].dims.GHO == theGHO))) {
         value27 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
    for (var i = 0; i < obj.length; i++){
      // look for the entry with a matching `code` value
      if (obj[i].dims.COUNTRY == needle2  && (obj[i].dims.YEAR == year8  && (obj[i].dims.GHO == theGHO))) {
         value28 = obj[i].Value
        // obj[i].name is the matched result
      }
    }
     value1 = parseInt(value1, 10);
     value2 = parseInt(value2, 10);
     value3 = parseInt(value3, 10);
     value4 = parseInt(value4, 10);
     value5 = parseInt(value5, 10);
     value6 = parseInt(value6, 10);
     value7 = parseInt(value7, 10);
     value8 = parseInt(value8, 10);
     value21 = parseInt(value21, 10);
     value22 = parseInt(value22, 10);
     value23 = parseInt(value23, 10);
     value24 = parseInt(value24, 10); //NOTE TO SELF - ROHIN, SECOND NUMBER (10) IS RADIX (BASE 10 # SYSTEM)
     value25 = parseInt(value25, 10);
     value26 = parseInt(value26, 10);
     value27 = parseInt(value27, 10);
     value28 = parseInt(value28, 10);



window.chartColors = {
  red: 'rgb(255, 99, 132)',
  orange: 'rgb(255, 159, 64)',
  yellow: 'rgb(255, 205, 86)',
  green: 'rgb(75, 192, 192)',
  blue: 'rgb(54, 162, 235)',
  purple: 'rgb(153, 102, 255)',
  grey: 'rgb(231,233,237)'
};

var randomScalingFactor = function() {
  return (Math.random() > 0.5 ? 1.0 : 1.0) * Math.round(Math.random() * 100);
};

var line1 = [value8, value7, value6, value5, value4, value3, value2, value1, ];

var line2 = [value28, value27, value26, value25, value24, value23, value22, value21, ];
var MONTHS = ["2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"];
var config = {
  type: 'line',
  data: {
    labels: MONTHS,
    datasets: [{
      label: userCountry,
      backgroundColor: window.chartColors.red,
      borderColor: window.chartColors.red,
      data: line1,
      fill: false,
    }, {
      label: userCountry2,
      fill: false,
      backgroundColor: window.chartColors.blue,
      borderColor: window.chartColors.blue,
      data: line2,
    }]
  },
  options: {
    responsive: true,
    title:{
      display:true,
      text:'Chart.js Line Chart'
    },
    tooltips: {
      mode: 'index',
      intersect: false,
    },
   hover: {
      mode: 'nearest',
      intersect: true
    },
    scales: {
      xAxes: [{
        display: true,
        scaleLabel: {
          display: true,
          labelString: 'Month'
        }
      }],
      yAxes: [{
        display: true,
        scaleLabel: {
          display: true,
        },
      }]
    }
  }
};
var ctx = document.getElementById("canvas").getContext("2d");
var myLine = new Chart(ctx, config);
}
