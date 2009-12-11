(ns simplest.servlet           
  (:import (java.util Date))
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn -doGet [this req resp]
  (let [title "Simple, but it works!"]
    (doto (.getWriter resp)
      (.println (format "<html><head><title>%s</title></head>" title))
      (.println (format "<body><h1>%s</h1><p>%s</p></body></html>" title (Date.))))))
