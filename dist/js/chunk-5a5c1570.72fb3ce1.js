(window["webpackJsonp"] = window["webpackJsonp"] || []).push(
    [["chunk-5a5c1570"], {
      "26ca": function (t, i, s) {
      }, "4b8e": function (t, i, s) {
        "use strict";
        var a = s("f807"), e = s.n(a);
        e.a
      }, "9f26": function (t, i, s) {
        "use strict";
        var a = function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("div",
                  {staticClass: "nav-bar", class: {is_fixed: t.isFixed}},
                  [s("div", {staticClass: "container"},
                      [s("div", {staticClass: "pro-title"},
                          [t._v(" " + t._s(t.title) + " ")]),
                        s("div", {staticClass: "pro-param"},
                            [s("a", {attrs: {href: "javascript:;"}}, [t._v("概述")]),
                              s("span", [t._v("|")]),
                              s("a", {attrs: {href: "javascript:;"}}, [t._v("参数")]),
                              s("span", [t._v("|")]),
                              s("a", {attrs: {href: "javascript:;"}},
                                  [t._v("用户评价")]), t._t("buy")], 2)])])
            }, e = [], c = {
              name: "nav-bar", props: {title: String}, data: function () {
                return {isFixed: !1}
              }, mounted: function () {
                window.addEventListener("scroll", this.initHeight)
              }, methods: {
                initHeight: function () {
                  var t = window.pageYOffset || document.documentElement.scrollTop
                      || document.body.scrollTop;
                  this.isFixed = t > 152
                }
              }, destroyed: function () {
                window.removeEventListener("scroll", this.initHeight, !1)
              }
            }, n = c, r = (s("4b8e"), s("ebb3")),
            o = Object(r["a"])(n, a, e, !1, null, null, null);
        i["a"] = o.exports
      }, afa2: function (t, i, s) {
        "use strict";
        s.r(i);
        var a = function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("div", {staticClass: "detail"},
                  [s("product-param", {attrs: {title: t.product.name}}),
                    s("div", {staticClass: "wrapper"},
                        [s("div", {staticClass: "container clearfix"},
                            [s("div", {staticClass: "swiper"},
                                [s("swiper", {attrs: {options: t.swiperOption}},
                                    [s("swiper-slide", [s("img", {
                                      attrs: {
                                        src: "./imgs/detail/phone-1.jpg",
                                        alt: ""
                                      }
                                    })]), s("swiper-slide", [s("img", {
                                      attrs: {
                                        src: "./imgs/detail/phone-2.jpg",
                                        alt: ""
                                      }
                                    })]), s("swiper-slide", [s("img", {
                                      attrs: {
                                        src: "./imgs/detail/phone-3.jpg",
                                        alt: ""
                                      }
                                    })]), s("swiper-slide", [s("img", {
                                      attrs: {
                                        src: "./imgs/detail/phone-4.jpg",
                                        alt: ""
                                      }
                                    })]), s("div", {
                                      staticClass: "swiper-pagination",
                                      attrs: {slot: "pagination"},
                                      slot: "pagination"
                                    })], 1)], 1), s("div", {staticClass: "content"},
                                [s("h2", {staticClass: "item-title"},
                                    [t._v(t._s(t.product.name))]), t._m(0),
                                  s("div", {staticClass: "delivery"},
                                      [t._v("小米自营")]),
                                  s("div", {staticClass: "item-price"},
                                      [t._v(t._s(t.product.price) + "元"),
                                        s("span", {staticClass: "del"},
                                            [t._v("1999元")])]),
                                  s("div", {staticClass: "line"}), t._m(1),
                                  s("div", {staticClass: "item-version clearfix"},
                                      [s("h2", [t._v("选择版本")]), s("div", {
                                        staticClass: "phone fl",
                                        class: {checked: 1 == t.version},
                                        on: {
                                          click: function (i) {
                                            t.version = 1
                                          }
                                        }
                                      }, [t._v("6GB+64GB 全网通")]), s("div", {
                                        staticClass: "phone fr",
                                        class: {checked: 2 == t.version},
                                        on: {
                                          click: function (i) {
                                            t.version = 2
                                          }
                                        }
                                      }, [t._v("4GB+64GB 移动4G")])]), t._m(2),
                                  s("div", {staticClass: "item-total"}, [s("div",
                                      {staticClass: "phone-info clearfix"},
                                      [s("div", {staticClass: "fl"}, [t._v(
                                          t._s(t.product.name) + " " + t._s(
                                          1 == t.version ? "6GB+64GB 全网通"
                                              : "4GB+64GB 移动4G") + " 深灰色")]),
                                        s("div", {staticClass: "fr"},
                                            [t._v(t._s(t.product.price) + "元")])]),
                                    s("div", {staticClass: "phone-total"}, [t._v(
                                        "总计：" + t._s(t.product.price) + "元")])]),
                                  s("div", {staticClass: "btn-group"}, [s("a", {
                                    staticClass: "btn btn-huge fl",
                                    attrs: {href: "javascript:;"},
                                    on: {click: t.addCart}
                                  }, [t._v("加入购物车")])])])])]), t._m(3),
                    s("service-bar")], 1)
            }, e = [function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("p", {staticClass: "item-info"},
                  [t._v("相机全新升级 / 960帧超慢动作 / 手持超级夜景 / 全球首款双频GPS / 骁龙845处理器 / 红"),
                    s("br"), t._v("外人脸解锁 / AI变焦双摄 / 三星 AMOLED 屏")])
            }, function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("div", {staticClass: "item-addr"},
                  [s("i", {staticClass: "icon-loc"}),
                    s("div", {staticClass: "addr"}, [t._v("北京 北京市 朝阳区 安定门街道")]),
                    s("div", {staticClass: "stock"}, [t._v("有现货")])])
            }, function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("div", {staticClass: "item-color"}, [s("h2", [t._v("选择颜色")]),
                s("div", {staticClass: "phone checked"},
                    [s("span", {staticClass: "color"}), t._v(" 深空灰 ")])])
            }, function () {
              var t = this, i = t.$createElement, s = t._self._c || i;
              return s("div", {staticClass: "price-info"},
                  [s("div", {staticClass: "container"}, [s("h2", [t._v("价格说明")]),
                    s("div", {staticClass: "desc"}, [s("img", {
                      attrs: {
                        src: "./imgs/detail/item-price.jpeg",
                        alt: ""
                      }
                    })])])])
            }], c = s("0f1c"), n = s("9f26"), r = s("984c"), o = {
              name: "detail",
              data: function () {
                return {
                  id: this.$route.params.id,
                  err: "",
                  version: 1,
                  product: {},
                  swiperOption: {
                    autoplay: !0,
                    pagination: {el: ".swiper-pagination", clickable: !0}
                  }
                }
              },
              components: {
                swiper: c["swiper"],
                swiperSlide: c["swiperSlide"],
                ProductParam: n["a"],
                ServiceBar: r["a"]
              },
              mounted: function () {
                this.getProductInfo()
              },
              methods: {
                getProductInfo: function () {
                  var t = this;
                  this.axios.get("/products/".concat(this.id)).then((function (i) {
                    t.product = i
                  }))
                }, addCart: function () {
                  var t = this;
                  this.axios.post("/carts",
                      {productId: this.id, selected: !0}).then((function () {
                    var i = arguments.length > 0 && void 0 !== arguments[0]
                        ? arguments[0] : {cartProductVoList: 0};
                    t.$store.dispatch("saveCartCount", i.cartTotalQuantity)
                  }))
                }
              }
            }, l = o, d = (s("f8df"), s("ebb3")),
            v = Object(d["a"])(l, a, e, !1, null, null, null);
        i["default"] = v.exports
      }, f807: function (t, i, s) {
      }, f8df: function (t, i, s) {
        "use strict";
        var a = s("26ca"), e = s.n(a);
        e.a
      }
    }]);