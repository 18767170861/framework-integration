(function (t) {
  function e(e) {
    for (var s, n, c = e[0], o = e[1], l = e[2], u = 0, d = []; u < c.length;
        u++) {
      n = c[u], Object.prototype.hasOwnProperty.call(i, n) && i[n]
      && d.push(i[n][0]), i[n] = 0;
    }
    for (s in o) {
      Object.prototype.hasOwnProperty.call(o, s) && (t[s] = o[s]);
    }
    m && m(e);
    while (d.length) {
      d.shift()();
    }
    return r.push.apply(r, l || []), a()
  }

  function a() {
    for (var t, e = 0; e < r.length; e++) {
      for (var a = r[e], s = !0, n = 1; n < a.length; n++) {
        var c = a[n];
        0 !== i[c] && (s = !1)
      }
      s && (r.splice(e--, 1), t = o(o.s = a[0]))
    }
    return t
  }

  var s = {}, n = {app: 0}, i = {app: 0}, r = [];

  function c(t) {
    return o.p + "js/" + ({}[t] || t) + "." + {
      "chunk-0b781772": "e89ab732",
      "chunk-2d0bce61": "2b013fbc",
      "chunk-33045717": "3ca7b895",
      "chunk-4194c08a": "0fea368d",
      "chunk-5a5c1570": "72fb3ce1",
      "chunk-65f89279": "b177bdde",
      "chunk-757e0d78": "e97ea9ce",
      "chunk-7ca464ce": "efb69bdc",
      "chunk-9975cdee": "37c5cd20"
    }[t] + ".js"
  }

  function o(e) {
    if (s[e]) {
      return s[e].exports;
    }
    var a = s[e] = {i: e, l: !1, exports: {}};
    return t[e].call(a.exports, a, a.exports, o), a.l = !0, a.exports
  }

  o.e = function (t) {
    var e = [], a = {
      "chunk-0b781772": 1,
      "chunk-33045717": 1,
      "chunk-4194c08a": 1,
      "chunk-5a5c1570": 1,
      "chunk-65f89279": 1,
      "chunk-757e0d78": 1,
      "chunk-7ca464ce": 1,
      "chunk-9975cdee": 1
    };
    n[t] ? e.push(n[t]) : 0 !== n[t] && a[t] && e.push(
        n[t] = new Promise((function (e, a) {
          for (var s = "css/" + ({}[t] || t) + "." + {
                "chunk-0b781772": "81318af9",
                "chunk-2d0bce61": "31d6cfe0",
                "chunk-33045717": "8b48ed71",
                "chunk-4194c08a": "4fac7a40",
                "chunk-5a5c1570": "66eb3f93",
                "chunk-65f89279": "4cf0bd69",
                "chunk-757e0d78": "df92447f",
                "chunk-7ca464ce": "b26370e2",
                "chunk-9975cdee": "022d881e"
              }[t] + ".css", i = o.p + s, r = document.getElementsByTagName("link"),
              c = 0; c < r.length; c++) {
            var l = r[c],
                u = l.getAttribute("data-href") || l.getAttribute("href");
            if ("stylesheet" === l.rel && (u === s || u === i)) {
              return e()
            }
          }
          var d = document.getElementsByTagName("style");
          for (c = 0; c < d.length; c++) {
            l = d[c], u = l.getAttribute("data-href");
            if (u === s || u === i) {
              return e()
            }
          }
          var m = document.createElement("link");
          m.rel = "stylesheet", m.type = "text/css", m.onload = e, m.onerror = function (e) {
            var s = e && e.target && e.target.src || i, r = new Error(
                "Loading CSS chunk " + t + " failed.\n(" + s + ")");
            r.code = "CSS_CHUNK_LOAD_FAILED", r.request = s, delete n[t], m.parentNode.removeChild(
                m), a(r)
          }, m.href = i;
          var p = document.getElementsByTagName("head")[0];
          p.appendChild(m)
        })).then((function () {
          n[t] = 0
        })));
    var s = i[t];
    if (0 !== s) {
      if (s) {
        e.push(s[2]);
      } else {
        var r = new Promise((function (e, a) {
          s = i[t] = [e, a]
        }));
        e.push(s[2] = r);
        var l, u = document.createElement("script");
        u.charset = "utf-8", u.timeout = 120, o.nc && u.setAttribute("nonce",
            o.nc), u.src = c(t);
        var d = new Error;
        l = function (e) {
          u.onerror = u.onload = null, clearTimeout(m);
          var a = i[t];
          if (0 !== a) {
            if (a) {
              var s = e && ("load" === e.type ? "missing" : e.type),
                  n = e && e.target && e.target.src;
              d.message = "Loading chunk " + t + " failed.\n(" + s + ": " + n
                  + ")", d.name = "ChunkLoadError", d.type = s, d.request = n, a[1](
                  d)
            }
            i[t] = void 0
          }
        };
        var m = setTimeout((function () {
          l({type: "timeout", target: u})
        }), 12e4);
        u.onerror = u.onload = l, document.head.appendChild(u)
      }
    }
    return Promise.all(e)
  }, o.m = t, o.c = s, o.d = function (t, e, a) {
    o.o(t, e) || Object.defineProperty(t, e, {enumerable: !0, get: a})
  }, o.r = function (t) {
    "undefined" !== typeof Symbol && Symbol.toStringTag
    && Object.defineProperty(t, Symbol.toStringTag,
        {value: "Module"}), Object.defineProperty(t, "__esModule", {value: !0})
  }, o.t = function (t, e) {
    if (1 & e && (t = o(t)), 8 & e) {
      return t;
    }
    if (4 & e && "object" === typeof t && t && t.__esModule) {
      return t;
    }
    var a = Object.create(null);
    if (o.r(a), Object.defineProperty(a, "default",
        {enumerable: !0, value: t}), 2 & e && "string"
    != typeof t) {
      for (var s in t) {
        o.d(a, s, function (e) {
          return t[e]
        }.bind(null, s));
      }
    }
    return a
  }, o.n = function (t) {
    var e = t && t.__esModule ? function () {
      return t["default"]
    } : function () {
      return t
    };
    return o.d(e, "a", e), e
  }, o.o = function (t, e) {
    return Object.prototype.hasOwnProperty.call(t, e)
  }, o.p = "/", o.oe = function (t) {
    throw console.error(t), t
  };
  var l = window["webpackJsonp"] = window["webpackJsonp"] || [],
      u = l.push.bind(l);
  l.push = e, l = l.slice();
  for (var d = 0; d < l.length; d++) {
    e(l[d]);
  }
  var m = u;
  r.push([0, "chunk-vendors"]), a()
})({
  0: function (t, e, a) {
    t.exports = a("56d7")
  }, 2362: function (t, e, a) {
  }, "30db": function (t, e, a) {
    "use strict";
    var s = a("42ff"), n = a.n(s);
    n.a
  }, "371b": function (t, e, a) {
    "use strict";
    var s = a("4ad0"), n = a.n(s);
    n.a
  }, "42ff": function (t, e, a) {
  }, "4ad0": function (t, e, a) {
  }, 5043: function (t, e, a) {
  }, "56d7": function (t, e, a) {
    "use strict";
    a.r(e);
    a("f62b"), a("12a1"), a("3c62");
    var s = a("c6e4"), n = a.n(s),
        i = (a("06c4"), a("d9f2"), a("26a1"), a("d95e"), a("17dc")),
        r = a("ff8f"), c = function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", [a("nav-header"), a("router-view"), a("nav-footer")], 1)
        }, o = [], l = function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "header"},
              [a("div", {staticClass: "nav-topbar"},
                  [a("div", {staticClass: "container"}, [t._m(0),
                    a("div", {staticClass: "topbar-user"},
                        [t.username ? a("a", {attrs: {href: "javascript:;"}},
                            [t._v(t._s(t.username))]) : t._e(),
                          t.username ? t._e() : a("a",
                              {attrs: {href: "javascript:;"}, on: {click: t.login}},
                              [t._v("登录")]), t.username ? a("a",
                            {attrs: {href: "javascript:;"}, on: {click: t.logout}},
                            [t._v("退出")]) : t._e(),
                          t.username ? a("a", {attrs: {href: "/#/order/list"}},
                              [t._v("我的订单")]) : t._e(), a("a", {
                          staticClass: "my-cart",
                          attrs: {href: "javascript:;"},
                          on: {click: t.goToCart}
                        }, [a("span", {staticClass: "icon-cart"}),
                          t._v("购物车(" + t._s(t.cartCount) + ")")])])])]),
                a("div", {staticClass: "nav-header"},
                    [a("div", {staticClass: "container"}, [t._m(1),
                      a("div", {staticClass: "header-menu"},
                          [a("div", {staticClass: "item-menu"},
                              [a("span", [t._v("小米手机")]),
                                a("div", {staticClass: "children"},
                                    [a("ul", t._l(t.phoneList, (function (e, s) {
                                      return a("li",
                                          {key: s, staticClass: "product"}, [a("a",
                                              {
                                                attrs: {
                                                  href: "/#/product/" + e.id,
                                                  target: "_blank"
                                                }
                                              }, [a("div", {staticClass: "pro-img"},
                                                  [a("img", {
                                                    directives: [{
                                                      name: "lazy",
                                                      rawName: "v-lazy",
                                                      value: e.mainImage,
                                                      expression: "item.mainImage"
                                                    }], attrs: {alt: e.subtitle}
                                                  })]),
                                                a("div", {staticClass: "pro-name"},
                                                    [t._v(t._s(e.name))]),
                                                a("div", {staticClass: "pro-price"},
                                                    [t._v(t._s(t._f("currency")(
                                                        e.price)))])])])
                                    })), 0)])]), t._m(2),
                            a("div", {staticClass: "item-menu"},
                                [a("span", [t._v("电视")]),
                                  a("div", {staticClass: "children"}, [a("ul",
                                      [a("li", {staticClass: "product"}, [a("a",
                                          {attrs: {href: "", target: "_blank"}},
                                          [a("div", {staticClass: "pro-img"},
                                              [a("img", {
                                                directives: [{
                                                  name: "lazy",
                                                  rawName: "v-lazy",
                                                  value: "./imgs/nav-img/nav-3-1.jpg",
                                                  expression: "'./imgs/nav-img/nav-3-1.jpg'"
                                                }], attrs: {alt: ""}
                                              })]),
                                            a("div", {staticClass: "pro-name"},
                                                [t._v("小米壁画电视 65英寸")]),
                                            a("div", {staticClass: "pro-price"},
                                                [t._v("6999元")])])]),
                                        a("li", {staticClass: "product"}, [a("a",
                                            {attrs: {href: "", target: "_blank"}},
                                            [a("div", {staticClass: "pro-img"},
                                                [a("img", {
                                                  directives: [{
                                                    name: "lazy",
                                                    rawName: "v-lazy",
                                                    value: "./imgs/nav-img/nav-3-2.jpg",
                                                    expression: "'./imgs/nav-img/nav-3-2.jpg'"
                                                  }], attrs: {alt: ""}
                                                })]),
                                              a("div", {staticClass: "pro-name"},
                                                  [t._v("小米全面屏电视E55A")]),
                                              a("div", {staticClass: "pro-price"},
                                                  [t._v("1999元")])])]),
                                        a("li", {staticClass: "product"}, [a("a",
                                            {attrs: {href: "", target: "_blank"}},
                                            [a("div", {staticClass: "pro-img"},
                                                [a("img", {
                                                  directives: [{
                                                    name: "lazy",
                                                    rawName: "v-lazy",
                                                    value: "./imgs/nav-img/nav-3-3.png",
                                                    expression: "'./imgs/nav-img/nav-3-3.png'"
                                                  }], attrs: {alt: ""}
                                                })]),
                                              a("div", {staticClass: "pro-name"},
                                                  [t._v("小米电视4A 32英寸")]),
                                              a("div", {staticClass: "pro-price"},
                                                  [t._v("699元")])])]),
                                        a("li", {staticClass: "product"}, [a("a",
                                            {attrs: {href: "", target: "_blank"}},
                                            [a("div", {staticClass: "pro-img"},
                                                [a("img", {
                                                  directives: [{
                                                    name: "lazy",
                                                    rawName: "v-lazy",
                                                    value: "./imgs/nav-img/nav-3-4.jpg",
                                                    expression: "'./imgs/nav-img/nav-3-4.jpg'"
                                                  }], attrs: {alt: ""}
                                                })]),
                                              a("div", {staticClass: "pro-name"},
                                                  [t._v("小米电视4A 55英寸")]),
                                              a("div", {staticClass: "pro-price"},
                                                  [t._v("1799元")])])]),
                                        a("li", {staticClass: "product"}, [a("a",
                                            {attrs: {href: "", target: "_blank"}},
                                            [a("div", {staticClass: "pro-img"},
                                                [a("img", {
                                                  directives: [{
                                                    name: "lazy",
                                                    rawName: "v-lazy",
                                                    value: "./imgs/nav-img/nav-3-5.jpg",
                                                    expression: "'./imgs/nav-img/nav-3-5.jpg'"
                                                  }], attrs: {alt: ""}
                                                })]),
                                              a("div", {staticClass: "pro-name"},
                                                  [t._v("小米电视4A 65英寸")]),
                                              a("div", {staticClass: "pro-price"},
                                                  [t._v("2699元")])])]),
                                        a("li", {staticClass: "product"}, [a("a",
                                            {attrs: {href: "", target: "_blank"}},
                                            [a("div", {staticClass: "pro-img"},
                                                [a("img", {
                                                  directives: [{
                                                    name: "lazy",
                                                    rawName: "v-lazy",
                                                    value: "./imgs/nav-img/nav-3-6.png",
                                                    expression: "'./imgs/nav-img/nav-3-6.png'"
                                                  }], attrs: {alt: ""}
                                                })]),
                                              a("div", {staticClass: "pro-name"},
                                                  [t._v("查看全部")]),
                                              a("div", {staticClass: "pro-price"},
                                                  [t._v("查看全部")])])])])])])]),
                      t._m(3)])])])
        }, u = [function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "topbar-menu"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("小米商城")]),
                a("a", {attrs: {href: "javascript:;"}}, [t._v("MUI")]),
                a("a", {attrs: {href: "javascript:;"}}, [t._v("云服务")]),
                a("a", {attrs: {href: "javascript:;"}}, [t._v("协议规则")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "header-logo"},
              [a("a", {attrs: {href: "/#/index"}})])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "item-menu"},
              [a("span", [t._v("RedMi红米")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "header-search"},
              [a("div", {staticClass: "wrapper"},
                  [a("input", {attrs: {type: "text", name: "keyword"}}),
                    a("a", {attrs: {href: "javascript:;"}})])])
        }], d = (a("694b"), a("06d5"), a("9189"), a("3675"), a("2af8"), a(
        "647c"), a("7e30"), a("ed18")), m = a("9e74");

    function p(t, e) {
      var a = Object.keys(t);
      if (Object.getOwnPropertySymbols) {
        var s = Object.getOwnPropertySymbols(t);
        e && (s = s.filter((function (e) {
          return Object.getOwnPropertyDescriptor(t, e).enumerable
        }))), a.push.apply(a, s)
      }
      return a
    }

    function v(t) {
      for (var e = 1; e < arguments.length; e++) {
        var a = null != arguments[e] ? arguments[e] : {};
        e % 2 ? p(Object(a), !0).forEach((function (e) {
          Object(d["a"])(t, e, a[e])
        })) : Object.getOwnPropertyDescriptors ? Object.defineProperties(t,
            Object.getOwnPropertyDescriptors(a)) : p(Object(a)).forEach(
            (function (e) {
              Object.defineProperty(t, e, Object.getOwnPropertyDescriptor(a, e))
            }))
      }
      return t
    }

    var f = {
          name: "nav-header",
          data: function () {
            return {phoneList: []}
          },
          computed: v({}, Object(m["c"])(["username", "cartCount"])),
          filters: {
            currency: function (t) {
              return t ? "￥" + t.toFixed(2) + "元" : "0.00"
            }
          },
          mounted: function () {
            this.getProductList();
            var t = this.$route.params;
            t && "login" == t.from && this.getCartCount()
          },
          methods: {
            login: function () {
              this.$router.push("/login")
            }, getProductList: function () {
              var t = this;
              this.axios.get("/products",
                  {params: {categoryId: "100012", pageSize: 6}}).then(
                  (function (e) {
                    t.phoneList = e.list
                  }))
            }, getCartCount: function () {
              var t = this;
              this.axios.get("/carts/products/sum").then((function () {
                var e = arguments.length > 0 && void 0 !== arguments[0]
                    ? arguments[0] : 0;
                t.$store.dispatch("saveCartCount", e)
              }))
            }, logout: function () {
              var t = this;
              this.axios.post("/user/logout").then((function () {
                t.$message.success("退出成功"), t.$cookie.set("userId", "",
                    {expires: "-1"}), t.$store.dispatch("saveUserName",
                    ""), t.$store.dispatch("saveCartCount", "0")
              }))
            }, goToCart: function () {
              this.$router.push("/cart")
            }
          }
        }, h = f, g = (a("8ee7"), a("ebb3")),
        _ = Object(g["a"])(h, l, u, !1, null, null, null), b = _.exports,
        C = a("f091"),
        y = {name: "nav-home", components: {NavHeader: b, NavFooter: C["a"]}},
        k = y, w = Object(g["a"])(k, c, o, !1, null, null, null), j = w.exports,
        x = function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "index"},
              [a("div", {staticClass: "container"},
                  [a("div", {staticClass: "swiper-box"},
                      [a("div", {staticClass: "nav-menu"},
                          [a("ul", {staticClass: "menu-wrap"},
                              [a("li", {staticClass: "menu-item"},
                                  [a("a", {attrs: {href: "javascript:;"}},
                                      [t._v("手机 电话卡")]),
                                    a("div", {staticClass: "children"},
                                        t._l(t.menuList, (function (e, s) {
                                          return a("ul", {key: s},
                                              t._l(e, (function (e, s) {
                                                return a("li", {key: s}, [a("a",
                                                    {
                                                      attrs: {
                                                        href: e ? "/#/product/"
                                                            + e.id : ""
                                                      }
                                                    }, [a("img", {
                                                      attrs: {
                                                        src: e ? e.img
                                                            : "./imgs/item-box-1.png",
                                                        alt: ""
                                                      }
                                                    }), t._v(" " + t._s(
                                                        e ? e.name : "小米9")
                                                        + " ")])])
                                              })), 0)
                                        })), 0)]), t._m(0), t._m(1), t._m(2),
                                t._m(3), t._m(4), t._m(5), t._m(6)])]),
                        a("swiper", {attrs: {options: t.swiperOption}},
                            [t._l(t.slideList, (function (t, e) {
                              return a("swiper-slide", {key: e},
                                  [a("a", {attrs: {href: "/#/product/" + t.id}},
                                      [a("img", {attrs: {src: t.img}})])])
                            })), a("div", {
                              staticClass: "swiper-pagination",
                              attrs: {slot: "pagination"},
                              slot: "pagination"
                            }), a("div", {
                              staticClass: "swiper-button-prev",
                              attrs: {slot: "button-prev"},
                              slot: "button-prev"
                            }), a("div", {
                              staticClass: "swiper-button-next",
                              attrs: {slot: "button-next"},
                              slot: "button-next"
                            })], 2)], 1), a("div", {staticClass: "ads-box"},
                      t._l(t.adsList, (function (t, e) {
                        return a("a",
                            {key: e, attrs: {href: "/#/product/" + t.id}},
                            [a("img", {
                              directives: [{
                                name: "lazy",
                                rawName: "v-lazy",
                                value: t.img,
                                expression: "item.img"
                              }], attrs: {alt: ""}
                            })])
                      })), 0), a("div", {staticClass: "banner"},
                      [a("a", {attrs: {href: "/#/product/30"}}, [a("img", {
                        directives: [{
                          name: "lazy",
                          rawName: "v-lazy",
                          value: "./imgs/banner-1.png",
                          expression: "'./imgs/banner-1.png'"
                        }], attrs: {alt: ""}
                      })])])]), a("div", {staticClass: "product-box"},
                  [a("div", {staticClass: "container"}, [a("h2", [t._v("手机")]),
                    a("div", {staticClass: "wrapper"},
                        [a("div", {staticClass: "banner-left"},
                            [a("a", {attrs: {href: "/#/product/35"}}, [a("img",
                                {
                                  directives: [{
                                    name: "lazy",
                                    rawName: "v-lazy",
                                    value: "./imgs/mix-alpha.jpg",
                                    expression: "'./imgs/mix-alpha.jpg'"
                                  }], attrs: {alt: ""}
                                })])]), a("div", {staticClass: "list-box"},
                            t._l(t.phoneList, (function (e, s) {
                              return a("div", {key: s, staticClass: "list"},
                                  t._l(e, (function (e, s) {
                                    return a("div",
                                        {key: s, staticClass: "item"},
                                        [a("span",
                                            {class: {"new-pro": s % 2 == 0}},
                                            [t._v("新品")]),
                                          a("div", {staticClass: "item-img"},
                                              [a("img", {
                                                directives: [{
                                                  name: "lazy",
                                                  rawName: "v-lazy",
                                                  value: e.mainImage,
                                                  expression: "item.mainImage"
                                                }], attrs: {alt: ""}
                                              })]),
                                          a("div", {staticClass: "item-info"},
                                              [a("h3", [t._v(t._s(e.name))]),
                                                a("p",
                                                    [t._v(t._s(e.subtitle))]),
                                                a("p", {
                                                  staticClass: "price",
                                                  on: {
                                                    click: function (a) {
                                                      return t.addCart(e.id)
                                                    }
                                                  }
                                                }, [t._v(
                                                    t._s(e.price) + "元")])])])
                                  })), 0)
                            })), 0)])])]), a("service-bar"), a("modal", {
                attrs: {
                  title: "提示",
                  sureText: "查看购物车",
                  btnType: "1",
                  modalType: "middle",
                  showModal: t.showModal
                }, on: {
                  submit: t.goToCart, cancel: function (e) {
                    t.showModal = !1
                  }
                }, scopedSlots: t._u([{
                  key: "body", fn: function () {
                    return [a("p", [t._v("商品添加成功！")])]
                  }, proxy: !0
                }])
              })], 1)
        }, O = [function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("电视 盒子")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("笔记本 平板")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("家电 插线板")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("出行 穿戴")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("智能 路由器")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("电源 配件")])])
        }, function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("li", {staticClass: "menu-item"},
              [a("a", {attrs: {href: "javascript:;"}}, [t._v("生活 箱包")])])
        }], $ = (a("f052"), a("984c")), E = a("714b"), T = a("0f1c"),
        N = (a("87d8"), {
          name: "index",
          components: {
            swiper: T["swiper"],
            swiperSlide: T["swiperSlide"],
            ServiceBar: $["a"],
            Modal: E["a"]
          },
          data: function () {
            return {
              swiperOption: {
                autoplay: !0,
                loop: !0,
                effect: "cube",
                cubeEffect: {shadowOffset: 100, shadowScale: .6},
                pagination: {el: ".swiper-pagination", clickable: !0},
                navigation: {
                  nextEl: ".swiper-button-next",
                  prevEl: ".swiper-button-prev"
                }
              },
              slideList: [{id: "42", img: "./imgs/slider/slide-1.jpg"},
                {id: "45", img: "./imgs/slider/slide-2.jpg"},
                {id: "46", img: "./imgs/slider/slide-3.jpg"},
                {id: "", img: "./imgs/slider/slide-4.jpg"},
                {id: "", img: "./imgs/slider/slide-1.jpg"}],
              menuList: [[{id: 30, img: "./imgs/item-box-1.png", name: "小米CC9"},
                {id: 31, img: "./imgs/item-box-2.png", name: "小米8青春版"},
                {id: 32, img: "./imgs/item-box-3.jpg", name: "Redmi K20 Pro"},
                {id: 33, img: "./imgs/item-box-4.jpg", name: "移动4G专区"}],
                [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0],
                [0, 0, 0, 0]],
              adsList: [{id: 33, img: "./imgs/ads/ads-1.png"},
                {id: 48, img: "./imgs/ads/ads-2.jpg"},
                {id: 45, img: "./imgs/ads/ads-3.png"},
                {id: 47, img: "./imgs/ads/ads-4.jpg"}],
              phoneList: [],
              showModal: !1
            }
          },
          mounted: function () {
            this.init()
          },
          methods: {
            init: function () {
              var t = this;
              this.axios.get("/products",
                  {params: {categoryId: 100012, pageSize: 14}}).then(
                  (function (e) {
                    e.list = e.list.slice(6, 14), t.phoneList = [e.list.slice(0,
                        4), e.list.slice(4, 8)]
                  }))
            }, addCart: function (t) {
              var e = this;
              this.axios.post("/carts", {productId: t, selected: !0}).then(
                  (function (t) {
                    e.showModal = !0, e.$store.dispatch("saveCartCount",
                        t.cartTotalQuantity)
                  }))
            }, goToCart: function () {
              this.$router.push("/cart")
            }
          }
        }), z = N,
        P = (a("bd5f"), Object(g["a"])(z, x, O, !1, null, null, null)),
        S = P.exports;
    i["default"].use(r["a"]);
    var L = new r["a"]({
          routes: [{
            path: "/",
            name: "home",
            component: j,
            redirect: "/index",
            children: [{path: "/index", name: "index", component: S}, {
              path: "/product/:id", name: "product", component: function () {
                return a.e("chunk-0b781772").then(a.bind(null, "2320"))
              }
            }, {
              path: "/detail/:id", name: "detail", component: function () {
                return a.e("chunk-5a5c1570").then(a.bind(null, "afa2"))
              }
            }]
          }, {
            path: "/login", name: "login", component: function () {
              return a.e("chunk-9975cdee").then(a.bind(null, "c6f7"))
            }
          }, {
            path: "/cart", name: "cart", component: function () {
              return a.e("chunk-7ca464ce").then(a.bind(null, "7cb1"))
            }
          }, {
            path: "/order",
            name: "order",
            component: function () {
              return a.e("chunk-2d0bce61").then(a.bind(null, "2a62"))
            },
            children: [{
              path: "list", name: "order-list", component: function () {
                return a.e("chunk-757e0d78").then(a.bind(null, "c56b"))
              }
            }, {
              path: "confirm", name: "order-confirm", component: function () {
                return a.e("chunk-33045717").then(a.bind(null, "2c69"))
              }
            }, {
              path: "pay", name: "order-pay", component: function () {
                return a.e("chunk-65f89279").then(a.bind(null, "5d59"))
              }
            }, {
              path: "alipay", name: "alipay", component: function () {
                return a.e("chunk-4194c08a").then(a.bind(null, "064a"))
              }
            }]
          }]
        }), M = a("12bc"), A = a.n(M), I = a("608c"), U = a.n(I), D = a("b4a2"),
        R = a("7d23"), B = a.n(R), F = (a("65ac"), {
          saveUserName: function (t, e) {
            t.username = e
          }, saveCartCount: function (t, e) {
            t.cartCount = e
          }
        }), H = {
          saveUserName: function (t, e) {
            t.commit("saveUserName", e)
          }, saveCartCount: function (t, e) {
            t.commit("saveCartCount", e)
          }
        };
    i["default"].use(m["a"]);
    var q = {username: "", cartCount: 0},
        J = new m["a"].Store({state: q, mutations: F, actions: H}),
        K = function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {attrs: {id: "app"}}, [a("router-view")], 1)
        }, G = [], Q = {
          name: "app", components: {}, data: function () {
            return {}
          }, mounted: function () {
            this.$cookie.get("userId") && (this.getUser(), this.getCartCount())
          }, methods: {
            getUser: function () {
              var t = this;
              this.axios.get("/user").then((function () {
                var e = arguments.length > 0 && void 0 !== arguments[0]
                    ? arguments[0] : {};
                t.$store.dispatch("saveUserName", e.username)
              }))
            }, getCartCount: function () {
              var t = this;
              this.axios.get("/carts/products/sum").then((function () {
                var e = arguments.length > 0 && void 0 !== arguments[0]
                    ? arguments[0] : 0;
                t.$store.dispatch("saveCartCount", e)
              }))
            }
          }
        }, V = Q, W = (a("5c0b"), Object(g["a"])(V, K, G, !1, null, null, null)),
        X = W.exports, Y = !1;
    Y && a(
        "fc6e"), A.a.defaults.baseURL = "/api", A.a.defaults.timeout = 8e3, A.a.interceptors.response.use(
        (function (t) {
          var e = t.data;
          return 0 == e.status ? e.data : 10 == e.status
              ? (window.location.href = "/#/login", Promise.reject(e))
              : (n.a.warning(e.msg), Promise.reject(e))
        }), (function (t) {
          var e = t.response;
          return n.a.error(e.data.message), Promise.reject(t)
        })), i["default"].use(U.a, A.a), i["default"].use(
        B.a), i["default"].use(D["a"],
        {loading: "./imgs/loading-svg/loading-bars.svg"}), i["default"].prototype.$message = n.a, i["default"].config.productionTip = !1, new i["default"](
        {
          store: J, router: L, render: function (t) {
            return t(X)
          }
        }).$mount("#app")
  }, "5c0b": function (t, e, a) {
    "use strict";
    var s = a("5043"), n = a.n(s);
    n.a
  }, "714b": function (t, e, a) {
    "use strict";
    var s = function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("transition", {attrs: {name: "slide"}}, [a("div", {
            directives: [{
              name: "show",
              rawName: "v-show",
              value: t.showModal,
              expression: "showModal"
            }], staticClass: "modal"
          }, [a("div", {staticClass: "mask"}),
            a("div", {staticClass: "modal-dialog"},
                [a("div", {staticClass: "modal-header"},
                    [a("span", [t._v(t._s(t.title))]), a("a", {
                      staticClass: "icon-close",
                      attrs: {href: "javascript:;"},
                      on: {
                        click: function (e) {
                          return t.$emit("cancel")
                        }
                      }
                    })]), a("div", {staticClass: "modal-body"}, [t._t("body")], 2),
                  a("div", {staticClass: "modal-footer"}, [1 == t.btnType ? a("a", {
                    staticClass: "btn",
                    attrs: {href: "javascript:;"},
                    on: {
                      click: function (e) {
                        return t.$emit("submit")
                      }
                    }
                  }, [t._v(t._s(t.sureText))]) : t._e(), 2 == t.btnType ? a("a", {
                    staticClass: "btn",
                    attrs: {href: "javascript:;"},
                    on: {
                      click: function (e) {
                        return t.$emit("cancel")
                      }
                    }
                  }, [t._v(t._s(t.cancelText))]) : t._e(),
                    3 == t.btnType ? a("div", {staticClass: "btn-group"}, [a("a", {
                      staticClass: "btn",
                      attrs: {href: "javascript:;"},
                      on: {
                        click: function (e) {
                          return t.$emit("submit")
                        }
                      }
                    }, [t._v(t._s(t.sureText))]), a("a", {
                      staticClass: "btn btn-default",
                      attrs: {href: "javascript:;"},
                      on: {
                        click: function (e) {
                          return t.$emit("cancel")
                        }
                      }
                    }, [t._v(t._s(t.cancelText))])]) : t._e()])])])])
        }, n = [], i = {
          name: "modal",
          props: {
            modalType: {type: String, default: "form"},
            title: String,
            btnType: String,
            sureText: {type: String, default: "确定"},
            cancelText: {type: String, default: "取消"},
            showModal: Boolean
          }
        }, r = i, c = (a("30db"), a("ebb3")),
        o = Object(c["a"])(r, s, n, !1, null, null, null);
    e["a"] = o.exports
  }, 7883: function (t, e, a) {
  }, "7e60": function (t, e, a) {
  }, "8ee7": function (t, e, a) {
    "use strict";
    var s = a("7883"), n = a.n(s);
    n.a
  }, "984c": function (t, e, a) {
    "use strict";
    var s = function () {
          var t = this, e = t.$createElement;
          t._self._c;
          return t._m(0)
        }, n = [function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "service"},
              [a("div", {staticClass: "container"}, [a("ul", [a("li",
                  [a("span", {staticClass: "icon-setting"}), t._v("预约维修服务")]),
                a("li", [a("span", {staticClass: "icon-7day"}), t._v("7天无理由退货")]),
                a("li", [a("span", {staticClass: "icon-15day"}), t._v("15天免费换货")]),
                a("li",
                    [a("span", {staticClass: "icon-post"}), t._v("满150元包邮")])])])])
        }], i = {name: "service-bar"}, r = i, c = (a("f8b2"), a("ebb3")),
        o = Object(c["a"])(r, s, n, !1, null, null, null);
    e["a"] = o.exports
  }, bd5f: function (t, e, a) {
    "use strict";
    var s = a("2362"), n = a.n(s);
    n.a
  }, f091: function (t, e, a) {
    "use strict";
    var s = function () {
          var t = this, e = t.$createElement;
          t._self._c;
          return t._m(0)
        }, n = [function () {
          var t = this, e = t.$createElement, a = t._self._c || e;
          return a("div", {staticClass: "footer"},
              [a("div", {staticClass: "footer-logo"},
                  [a("img", {attrs: {src: "./imgs/logo-footer.png", alt: ""}}),
                    a("p", [t._v("小米商城")])]), a("div", {staticClass: "footer-link"},
                  [a("a", {
                    attrs: {
                      href: "https://www.imooc.com/u/1343480",
                      target: "_blank"
                    }
                  }, [t._v("河畔一角主页")]), a("span", [t._v("|")]), a("a", {
                    attrs: {
                      href: "https://coding.imooc.com/class/113.html",
                      target: "_blank"
                    }
                  }, [t._v("Vue全栈课程")]), a("span", [t._v("|")]), a("a", {
                    attrs: {
                      href: "https://coding.imooc.com/class/236.html",
                      target: "_blank"
                    }
                  }, [t._v("React全家桶课程")]), a("span", [t._v("|")]), a("a", {
                    attrs: {
                      href: "https://coding.imooc.com/class/343.html",
                      target: "_blank"
                    }
                  }, [t._v("微信支付专项课程（H5+小程序+Node+Mongo）")])]),
                a("div", {staticClass: "copyright"}, [t._v("Copyright ©2019 "),
                  a("span", {staticClass: "domain"}, [t._v("mi.futurefe.com")]),
                  t._v(" All Rights Reserved.")])])
        }], i = {name: "nav-footer"}, r = i, c = (a("371b"), a("ebb3")),
        o = Object(c["a"])(r, s, n, !1, null, "6bb7f4f0", null);
    e["a"] = o.exports
  }, f8b2: function (t, e, a) {
    "use strict";
    var s = a("7e60"), n = a.n(s);
    n.a
  }, fc6e: function (t, e, a) {
    "use strict";
    a.r(e);
    var s = a("f396"), n = a.n(s);
    n.a.mock("/api/user/login", {
      status: 0,
      data: {
        "id|10001-11000": 0,
        username: "@cname",
        email: "admin@51purse.com",
        phone: null,
        role: 0,
        createTime: 1479048325e3,
        updateTime: 1479048325e3
      }
    })
  }
});