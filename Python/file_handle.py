def fileHandling() -> None:
    fname = input("Enter the file name: ")
    try:
        fhandle = open(fname)
    except: 
        print(f"The file {fname} is not present")
        return
        
    topic: int = 0
    for line in fhandle:
        line = line.rstrip() # removes the white space character at the end of line while printing the contents of the file
        if line.startswith('Topic'):
            topic = topic+1
    print(f"Number of topics in {fname} is : {topic}")
    """
    fread: str = fhandle.read()
    print(fread[:10]) # prints out first 10 characters of the file


    
    print(fhandle) # handle varaible is just the wrapper
                   # it does not actually has the contents of the file in it
    """

if __name__ == "__main__":
    fileHandling()

