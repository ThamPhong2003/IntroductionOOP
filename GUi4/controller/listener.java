package controller;
import java.net.http.WebSocket.Listener;
import java.util.EventListener;
import javax.swing.Action;
import View.view;
import javax.swing.*;
import java.awt.event.ActionListener;

public class listener implements Listener{
            private view  v;
public listener (view v){
    this. v = v;
}
public void actionPerformed( Action e){
   String src = e.getActionCommand();
}
} 