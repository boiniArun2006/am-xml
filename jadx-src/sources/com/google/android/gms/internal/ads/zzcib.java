package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcib extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcic zzb;

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcic zzcicVar = this.zzb;
        if (zzcicVar.zzm() > 0) {
            socket.setReceiveBufferSize(zzcicVar.zzm());
        }
        zzcicVar.zzl(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i2, inetAddress, i3);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    zzcib(zzcic zzcicVar) {
        Objects.requireNonNull(zzcicVar);
        this.zzb = zzcicVar;
        this.zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i2, inetAddress2, i3);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z2) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(socket, str, i2, z2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }
}
