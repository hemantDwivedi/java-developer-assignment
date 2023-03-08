// 2. Invoke a function using call() and apply(). Also Spot the difference between them.

const person2 = {
    fullName: function(city, country) {
      return this.firstName + " " + this.lastName + "," + city + "," + country;
    }
  }
  
  const person3 = {
    firstName:"John",
    lastName: "Doe"
  }
  
  person.fullName.call(person1, "Oslo", "Norway");

  const person = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  }
  
  const person1 = {
    firstName: "Mary",
    lastName: "Doe"
  }
  
  person.fullName.apply(person1); // This will return "Mary Doe":