# visitor_pattern_example
In the RIT gym there're so many choices of sports,this project tries to use vistor pattern to build up an application that can be used in the gym.
We have a SportsVisitor interface defining the visit methods for different types of sports.
We have a concrete visitor SportsEquipmentChecker that checks the equipment for different sports.
We have Sports interface representing elements in the object structure.
We have concrete sports classes Football, Basketball, and Tennis implementing the Sports interface.
Each sport class implements the accept method which takes a visitor as an argument and calls the appropriate visit method on the visitor.
In the Main class, we create an array of sports and a SportsEquipmentChecker visitor. We then iterate over the sports, accepting visits from the SportsEquipmentChecker, which checks the equipment for each sport.




