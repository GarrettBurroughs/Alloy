# Alloy  [![Build Status](https://travis-ci.org/GarrettBurroughs/Alloy.svg?branch=master)](https://travis-ci.org/GarrettBurroughs/Alloy) [![CodeFactor](https://www.codefactor.io/repository/github/garrettburroughs/alloy/badge)](https://www.codefactor.io/repository/github/garrettburroughs/alloy) 

![AlloyLogo](http://gdurl.com/AFl8)

Status: **Beta**

Developed by FTC147 and FRC555

The goal of Alloy is to provide a robot framework that allows anyone, including new programmers, to be able to implement
high functioning and quality code for their robots. In other terms, Alloy aims to prevent robot code from being a limiting
factor on the performance of the robot. 


Alloy is a robot framework designed specifically for the First Tech Challenge (FTC), but is also designed 
with expandibility in mind. FRC implementation is possible and will be coming in the future.

Alloy is based off the FRC robot framework [Sprocket](https://github.com/MontclairRobotics/Sprocket), but redesigned to abstract away the more complex ideas but still allow for advanced robot functionality.

Any information regarding Alloy, including how it works, project structure, as well as in-depth explanation on how to use all of the components
can be found in the project [Wiki](https://github.com/GarrettBurroughs/Alloy/wiki) as well as a [quick start guide]().



# FAQ 

### Q. What is the purpose of/how do I use ___?

A. Every class is heavily documented as well as wiki articles explaining the use of more complex/important parts of alloy

### Q. I tried to update ___ method using @Update, but it isn't working?

A. The way alloy is designed, is that everything is split up into components, and a method can only be updated if it is within a component. 
you can read more about this topic [Here](https://github.com/GarrettBurroughs/Alloy/wiki/Alloy-Update-System) 

### Q. What is a component/what is the difference between the components?
A. Different components have different purposes, for example, a control component would be used for an advanced control system, 
whereas a motor component, or motor ocmponent group would be used to control a drivetrain or manipulator

### Q. What if I don't want to use components?

A. Things can be done in alloy without the use of components, but if you are designing code for a specific tool or component on the robot, 
such as a shooter, drivetrain, or control system, it is highly recommended as components add extra functionality like toggleability,
easier debugging, and updateable methods. But again, all of this can be done without the use of components. 

### Q. ___ isn't working.

A. If you have a problem first see our [Troubleshooting guide](https://github.com/GarrettBurroughs/Alloy/wiki/Troubleshooting-Guide). If that does not fix your problem you can file an [Issue](https://github.com/GarrettBurroughs/Alloy/issues/new) 
using our issue template, please provide as much information as possible so we can fully understand the probelm and fix the issue. 

