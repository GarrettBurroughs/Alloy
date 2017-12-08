package org.montclairrobotics.Alloy.Vector;

/**
 * Created by MHS Robotics on 11/14/2017. <br />
 * <br />
 * Interface for creating vector classes, implemented in Vector.XY and Vector.Polar <br />
 * <br />
 * Since a 2D vector can be made up of an angle and a Magnitude or it's vector components (XY)
 * The vector interface contains all functionality that a vector should have and it is then implemented
 * in each vector subclass <br />
 * <br />
 * NOTE: No mathematical operations are performed on the vector but return a new vector that is the result of the operation <br />
 * <br />
 * To read more about vectors see here <link>https://en.wikipedia.org/wiki/Euclidean_vector</link> <br />
 * To read more about dot products see here <link>https://en.wikipedia.org/wiki/Dot_product</link> <br />
 * To read more about cross products see here <link>https://en.wikipedia.org/wiki/Cross_product</link> <br />
 * @see Polar
 * @see XY
 *
 *
 *
 * @author Garrett Burroughs
 * @version 0.1
 * @since 0.1
 */
public interface Vector {
    /**
     * Gets the X component of the vector
     *
     * @return the X component of the Vector
     */
    public double getX();

    /**
     * Gets the Y component of the vector
     *
     * @return the Y component of the Vector
     */
    public double getY();

    /**
     * Gets the magnitude of the vector
     *
     * @return the magnitude of the Vector
     */
    public double getManitude();

    /**
     * Gets the angle in standard position that the vector makes
     *
     * @return the angle in standard position that the vector makes
     */
    public Angle getAngle();

    /**
     * Adds two vectors together and returns the result
     *
     * <p>
     *     The result of a vector addition will be another vector,
     *     One way of adding two vectors together is splitting it up into it's x and y components and adding them
     *     together and making a new vector out of those components <br />
     *     EX: <br />
     *     V1 = 3i + 4j <br />
     *     V2 = 7i + 5j <br />
     * <br />
     *     V1 + V2 = 3i + 7i + 4j + 5j = 10i + 9j
     * <br />
     *     Geometric Visualization: <br />
     *     Vectors can also be added in a geometric way through the "Tip-To-Tail" method,
     *     In this method both the vectors are drawn using arrow vector notation <link>https://en.wikipedia.org/wiki/Vector_notation</link>
     *     one vector is then drawn at the edge of the first vector.
     *     The resultant vector is then drawn from the start of the first vector to the tip of the second vector
     *     This is where the name tip to tail comes from
     *
     * </p>
     *
     * @param vector The vector to be added
     * @return The result of the two vectors being added
     */
    public Vector add(Vector vector);

    /**
     * Subtracts a vector and returns the result
     *
     * <p>
     *     Vector subtraction is similar to vector addition but the direction of the vector being subtracted
     *     is simply reversed <br />
     *     EX: <br />
     *     V1 = 3i + 4j <br />
     *     V2 = 7i + 5j <br />
     * <br />
     *     V1 + V2 = 3i + 7i + 4j + 5j = 10i + 9j <br />
     *     V1 - V2 = 3i + (-7i) + 4j + (-5j) = -4i + -j <br />
     * </p>
     *
     *
     * @param vector The vector to be subtracted
     * @return The result of the passed in vector being subtracted from the vector object
     */
    public Vector subtract(Vector vector);

    /**
     * Scales the vectors magnitude by a scalar value
     *
     * @param scalar double to scale the vector by
     * @return The result of the vector being
     */
    public Vector scale(double scalar);

    /**
     * Returns the product of two vectors that have been crossed
     *
     * <p>
     *     The result of the cross product is a vector,
     *     The cross product of a vector is the vector that is perpendicular to both vectors
     *     When crossing two 2dimensional vectors the result will be a 3dimensional vector
     *     Because of this this method only returns the magnitude (Z component) of the cross product
     *     The magnitude of the cross product is same as the area of the parallelogram that the two
     *     vectors make in the X/Y plane. <br />
     *     <link>https://en.wikipedia.org/wiki/Cross_product</link>
     * </p>
     *
     * @param vector the vector to be multiplied using the cross product
     * @return the magnitude of the cross product of the two vectors
     */
    public double cross(Vector vector);

    /**
     * Returns the dot product of two vectors
     *
     * <p>
     *     The result of the dot product is a scalar value (number),
     *     The dot product can be viewed as the projection of one vector on to another times the magnitude of the
     *     original vector <br />
     *     This can be written mathematically as |A||B|cos(theta), where theta is the angle between A and B
     *     Another mathematical representation of the dot product using its components is: <br />
     *     A = {@literal <a1, a2>} <br />
     *     B = {@literal <b1, b2>} <br />
     *     A . B = {@literal <a1*b1, a2*b2>} <br />
     *     <link>https://en.wikipedia.org/wiki/Dot_product</link>
     * </p>
     *
     * @param vector The vector to be multiplied using the dot product
     * @return the scalar result of the dot of the two vectors
     */
    public double dot(Vector vector);

    /**
     * returns a vector rotated by a given angle
     *
     * @param angle the angle that the vector is to be rotated by
     * @return the result of the rotated vector
     */
    public Vector rotate(Angle angle);

    /**
     * gets the angle between two vectors
     *
     * @param vector the vector that will be used to find the angle between
     * @return the angle between the vectors
     */
    public Vector angleBetween(Vector vector);

    /**
     * Normalizes a vector and returns the result
     *
     * <p>
     *     A normalized vector is a vector with magnitude 1.
     *     Normalized vectors are also called unit vectors.
     *     A normalized vector keeps it's direction as well as the same proportions of its components.
     *     When a vector is defined by its components it can be normalized it can be expressed as <br />
     *     A = {@literal <a1, a2>} <br />
     *     A' = {@literal <a1/|A|, a2/|A|>} <br />
     * </p>
     *
     * @return the normalized vector
     */
    public Vector normalize();

    /**
     * Creates a copy of the vector
     *
     * @return a copy of the vector
     */
    public Vector copy();

}
