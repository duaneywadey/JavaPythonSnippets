class Book
attr_accessor :title, :author, :page

end

book1 = Book.new()
book1.title = "Bob's Amazing Stories"
book1.author = "BJ Visitacion"
book1.page = 700

puts book1.title
puts book1.author
puts book1.page




def func(a,b)
  return a*b
  
end

puts func(5,2)

