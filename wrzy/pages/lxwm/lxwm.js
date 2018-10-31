Page({
  data: {
    latitude: 43.9193496364,
    longitude: 125.3164315224,
    markers: [{
      latitude: 43.9193496364,
      longitude: 125.3164315224,
      name: '万瑞置业'
    }]

  },
  click: function (e) {
    wx.openLocation({
      latitude: 43.9193496364,
      longitude: 125.3164315224,
      scale: 18,
      name: '台北明珠大厦',
      address: '万瑞置业'
    })
  }

})
