# Image Activity
Using an spinner attached to a custom adapter, we display images for a specific theme.
The spinner will show instructions at launch and show no images. When you select an
item from the dropdown menu, it will display the image of the item selected.

## Problems
When we first open the spinner, we can't select the first option because it is 
already selected. Although the text appears different, it is still the first
option; we used a setText in the beginning to change it.

## References
I used these to help solve some of my issues
[How to customize spinner](https://stackoverflow.com/questions/23990046/how-to-customize-the-spinner-dropdown-view)
[LayoutInflater](https://stackoverflow.com/questions/7803771/call-to-getlayoutinflater-in-places-not-in-activity)
