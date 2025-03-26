/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.CartItem;
import dto.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Admin
 */
public class CartDAO {
    public List<CartItem> getCartItems(HttpSession session) {
        System.out.println("[DEBUG] getCartItems() called. Session ID: " + session.getId());

        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
        if (cartItems == null) {
            System.out.println("[DEBUG] Cart is empty. Initializing new cart...");
            cartItems = new ArrayList<>();
            session.setAttribute("cartItems", cartItems);
        } else {
            System.out.println("[DEBUG] Retrieved cart from session. Items count: " + cartItems.size());
        }
        return cartItems;
    }

    public void addToCart(HttpSession session, String movieID, int quantity) throws Exception {
        List<CartItem> cartItems = getCartItems(session);

        for (CartItem item : cartItems) {
            if (item.getMovieID().equals(movieID)) {
                item.setQuantity(item.getQuantity() + quantity);
                session.setAttribute("cartItems", cartItems);  // ✅ Cập nhật session
                System.out.println("[DEBUG] Updated quantity for: " + movieID);
                return;
            }
        }

        Movie movie = new MovieDAO().getMovieByID(movieID);
        if (movie != null) {
            CartItem newItem = new CartItem(movie.getId(), movie.getName(), quantity, 45);
            cartItems.add(newItem);
            session.setAttribute("cartItems", cartItems);  // ✅ Cập nhật session
            System.out.println("[DEBUG] Added new item to cart: " + movieID);
        } else {
            System.out.println("[ERROR] Food item not found: " + movieID);
        }
    }

    public void updateCart(HttpSession session, String movieID, int quantity) {
        List<CartItem> cartItems = getCartItems(session);
        for (CartItem item : cartItems) {
            if (item.getMovieID().equals(movieID)) {
                item.setQuantity(quantity);
                System.out.println("[DEBUG] Updated cart item: " + movieID);
                break;
            }
        }
        session.setAttribute("cartItems", cartItems);  // ✅ Cập nhật session
    }

    public void removeFromCart(HttpSession session, String foodID) {
        List<CartItem> cartItems = getCartItems(session);
        cartItems.removeIf(item -> item.getMovieID().equals(foodID));
        session.setAttribute("cartItems", cartItems);  // ✅ Cập nhật session
        System.out.println("[DEBUG] Removed cart item: " + foodID);
    }
}
