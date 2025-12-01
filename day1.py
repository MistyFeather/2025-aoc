import fileinput

def part1():
    dial = 50
    password = 0
    for line in fileinput.input(r'C:\Users\sarim\Informatik\2025_aoc\BlueJ template 2025\input\d1i.txt'):
        line.strip
        if(line[0] == "R"):
            line = line.replace("R","")
            rotation = int(line)
            dial += rotation
        if(line[0] == "L"):
            line = line.replace('L','')
            rotation = int(line)
            dial -= rotation
        if(dial > 99):
            dial = dial%100
        if(dial < 0):
            dial = dial%100
        if(dial == 0):
            password += 1

    print(password)

def part2():
    dial = 50
    password = 0
    for line in fileinput.input(r'C:\Users\sarim\Informatik\2025_aoc\BlueJ template 2025\input\d1i.txt'):
        line.strip
        if(line[0] == "R"):
            line = line.replace("R","")
            rotation = int(line)
            dial += rotation
        if(line[0] == "L"):
            line = line.replace('L','')
            rotation = int(line)
            dial -= rotation
        if(dial > 99):
            password += int(dial/100)
        if(dial < 0):
            password += int(dial/-100)
            if((-dial) < rotation):
                password += 1
        if(dial == 0):
            password += 1
        dial = dial%100

    print(password)

part2()
        
