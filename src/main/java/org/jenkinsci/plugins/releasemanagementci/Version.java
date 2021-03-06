/*
 * The MIT License
 *
 * Copyright 2016 angoya.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.releasemanagementci;

/**
 *
 * @author angoya
 */
public class Version
{
    
    private String id;
    private String name;
    private String sourceBranch;

    /**
    * 
    * @return
    * The id
    */
    public String getId()
    {
        return id;
    }

    /**
    * 
    * @param id
    * The id
    */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
    * 
    * @return
    * The name
    */
    public String getName()
    {
        return name;
    }

    /**
    * 
    * @param name
    * The name
    */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
    * 
    * @return
    * The sourceBranch
    */
    public String getSourceBranch()
    {
        return sourceBranch;
    }

    /**
    * 
    * @param sourceBranch
    * The sourceBranch
    */
    public void setSourceBranch(String sourceBranch)
    {
        this.sourceBranch = sourceBranch;
    }
}
