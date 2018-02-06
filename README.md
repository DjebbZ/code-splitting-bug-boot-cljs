## Code-splitting bug with [boot-cljs](https://github.com/boot-clj/boot-cljs) with **NO** `.cljs.edn` file

### Goal:

Use code-splitting to wrap an Closure js lib defined under `:libs` as a CLJS split, so that I can lazy-load it. 
Think trackers like Google analytics etc. that don't need to be loaded first. The goal is to reduce the Time-to-Interactive.

### Steps to reproduce:

1. `git clone https://github.com/DjebbZ/code-splitting-bug-boot-cljs.git`
2. `cd code-splitting-bug-boot-cljs`
3. `boot dev`
4. Visit `http://localhost:3000` and open the browser devtools.

### Expected:

The main file (`js/app.js`) is loaded, then the split. All modules loading should be logged in the browser console.
The `track` module should be loaded lazily after the `cljs-deps` module.
The `js/main.out/track.js` file should contain the code compiled from `src/cljs/code_splitting_bug_boot_cljs/tracking.cljs`.

### Actual:

Both `cljs-deps` and `track` modules are loaded instantly. The `js/main.out/track.js` file is empty. The `js/app.js` file contains the code of the `track` module whereas it shouldn't.

So the code works, but code-splitting doesn't.

### Notes:

The code is based on the [Tenzing](https://github.com/martinklepsch/tenzing) Clojurescript template.
The relevant dependencies have been updated to the latest version: ClojureScript and Boot-cljs.
It **does NOT** uses a `.cljs.edn` file, all compiler options are in `build.boot`.

Thanks for taking a look!
