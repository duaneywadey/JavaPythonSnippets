#                 VARIABLES


#   -  Variables start with a lowercase 
#      letter or " _ " and may contain
#      numbers.

#  -  “puts” prints output plus a new line.




#class Part1
#  puts "future programmer"
#  end




#                   BASIC DATA TYPES

#     1.) Numbers
#     2.) Strings
#     3.) True, False, and Nil
#     4.) Arrays

#a=5
#a1 = 2.50
#b = "cheesehakdog"
#c = true
#d = false 
#e = nil
##
#puts a
#puts b
#puts c
#puts d 
#puts e


#              GETTING INPUT FROM A USER

#gets.chomp()   (gets the user input)

#gets.to_i      (integer number)

#gets.to_f      (float)







## print prints the string to screen 
#without a newline
#
print "Enter a Value: "
#### 
########    Variables start with a lowercase 
######      letter or "_" and may contain numbers 
#####       gets stores input from the user and
#####       to_i turns it into an integer
####
####
first_num = gets.to_i
## 
print "Enter Another Value: "
 
second_num = gets.to_i
## 
##
###
#####    puts prints output plus a newline, 
####     to_s converts the variable into a
#####    string, you can combine values using +
###
###
#puts first_num.to_s + " + " + second_num.to_s + " = " + (first_num + second_num).to_s
#






##  A Constant starts with an uppercase letter 
#   and if you try to change the value 
#   you will be warned

# 
#A_CONSTANT = 3.14
#A_CONSTANT = 1.6
#puts A_CONSTANT




#                 ARRAYS 

## Creating an array
#
# numbers = [1, 2, 3, 4, 5]
#
##
### Printing every element from an array
### using for loop
## 
# 
# 
#for number in numbers
#  puts number
#end

# Inserting all items of an array
# to another array

groceries = ["bananas", "sweet potatoes", 
              "pasta", "tomatoes"]
# 
groceries.each do |food|
  puts "Get some " + food
end
##

for f in food
  puts food
end






  