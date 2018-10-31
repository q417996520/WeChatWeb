Page({
  data: {
    inputValue: '',
    focus: true,
    rangeIndex: 0,
    imgUrls: [
      '../images/sybxtj.jpg',
      '../images/wkc.jpg',
      '../images/zxxgt.jpg'
    ],
    indicatorDots: true, 
    autoplay: true,    
    vertical: true,    
    circular: true,   
    interval: 5000,  
    duration: 1000,
    bar1: {
      text: '长春各区在售房源价格表买过的 来瞅瞅跌了还是涨了  没买的瞅瞅自己想买的楼盘价格啥样了？',
      scrollable: true,
      delay: 1000
    }  
  },

  searchChange(e) {
    this.setData({
      inputValue: e.detail.value
    });
  },

  searchDone(e) {
    console.error('search', e.detail.value)
  },

  handleCancel() {
    console.error('cancel')
  },

  pickerChange(e) {
    this.setData({
      //rangeIndex: e.detail.value
    })
  }


});
