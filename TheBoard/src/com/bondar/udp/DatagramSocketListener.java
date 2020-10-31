package com.bondar.udp;

/**
 *
 * @author truebondar
 */
public interface DatagramSocketListener {
    
    public abstract void onReceiveData(int type, byte[] data);
}
