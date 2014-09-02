package apiprovider

class Book {

    static constraints = {
    }
	
	String name
	String author
	String genre
	
	def String toString() {
		"Name: ${name} - Author: ${author} - Genre: ${genre}"
	}
}
