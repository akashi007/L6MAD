package com.example.todoapplication;

/**
 * Categories class
 */

public class Categories {
    private String name;
    private int color;
    private boolean show;

    /**
     * Constructor
     * @param n name
     * @param c color
     */
    public Categories(String n, int c)
    {
        this.name = n;
        this.color = c;
        show = true;
    }

    /**
     * Returns the name of the category
     * @return name of the category
     */
    public String getName()
    {
        return (this.name);
    }

    /**
     * Returns the color of the category
     * @return color of the category
     */
    public int getColor()
    {
        return (this.color);
    }

    /**
     * Set the name of the category
     * @param n name
     */
    public void setName(String n)
    {
        this.name = n;
    }

    /**
     * Set the color
     * @param c color
     */
    public void setColor(int c)
    {
        this.color = c;
    }

    /**
     * category should be displayed
     * @return boolean category view
     */
    public boolean getShow() {
        return this.show;
    }

    /**
     * Set the category to visible or invisible
     * @param show1 true or false
     */
    public void setShow(boolean show1) {
        this.show = show1;
    }
}
