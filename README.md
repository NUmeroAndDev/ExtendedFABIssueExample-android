# ExtendedFAB's issue example

- Android Studio 3.5.3
- material-component 1.1.0-rc01


## This is bug?

When scrolling upward by linking CollapsingToolbar and ExtendedFAB, ExtendedFAB moves down for a moment.  


- Happens when device is in landscape orientation.  
- Happens when the content view is RecyclerView.  
Does not happen when using NestedScrollView.
- Happens only for ExtendedFAB.  
Does not happen in FAB.

## Screen

<img src="/screenshot/movie.gif" >
