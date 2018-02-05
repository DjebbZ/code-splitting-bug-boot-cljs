## Code-splitting bug with boot-cljs

### Goal:

Use code-splitting to wrap an Closure js lib defined under `:libs` as a CLJS split, so that I can lazy-load it. 
Think trackers like Google analytics etc. that don't need to be loaded first. The goal is to reduce the Time-to-Interactive.

### Steps to reproduce:

1. `git clone https://github.com/DjebbZ/code-splitting-bug-boot-cljs.git`
2. `cd code-splitting-bug-boot-cljs`
3. `boot dev`
4. Visit `http://localhost:3000` and open the browser devtools.

### Expected:

The main file (`js/app.js`) is loaded, then the split. All modules load should be logged in the browser console.

### Actual:

The main file isn't loaded because it doesn't exist!

### Notes:

The code is based on the [Tenzing](https://github.com/martinklepsch/tenzing) Clojurescript template.
The relevant dependencies have been updated to the latest version: ClojureScript and Boot-cljs.
It uses the `.cljs.edn` file, located in `resources/js/app.cljs.edn`.

Thanks for taking a look!
