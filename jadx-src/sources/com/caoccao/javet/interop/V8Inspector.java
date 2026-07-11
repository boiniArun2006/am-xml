package com.caoccao.javet.interop;

import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.utils.SimpleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class V8Inspector {
    private final List<IV8InspectorListener> listeners = new ArrayList();
    private IJavetLogger logger;
    private final String name;
    private final IV8Native v8Native;
    private final V8Runtime v8Runtime;

    public void addListeners(IV8InspectorListener... iV8InspectorListenerArr) {
        List<IV8InspectorListener> list = this.listeners;
        Objects.requireNonNull(iV8InspectorListenerArr);
        Collections.addAll(list, iV8InspectorListenerArr);
    }

    public void flushProtocolNotifications() {
        this.logger.logDebug("Receiving flushProtocolNotifications", new Object[0]);
        Iterator<IV8InspectorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().flushProtocolNotifications();
            } catch (Throwable th) {
                this.logger.logError(th, th.getMessage(), new Object[0]);
            }
        }
    }

    public IJavetLogger getLogger() {
        return this.logger;
    }

    public String getName() {
        return this.name;
    }

    public void receiveNotification(String str) {
        this.logger.logDebug("Receiving notification: {0}", str);
        Iterator<IV8InspectorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().receiveNotification(str);
            } catch (Throwable th) {
                this.logger.logError(th, th.getMessage(), new Object[0]);
            }
        }
    }

    public void receiveResponse(String str) {
        this.logger.logDebug("Receiving response: {0}", str);
        Iterator<IV8InspectorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().receiveResponse(str);
            } catch (Throwable th) {
                this.logger.logError(th, th.getMessage(), new Object[0]);
            }
        }
    }

    public void removeListeners(IV8InspectorListener... iV8InspectorListenerArr) {
        this.listeners.removeAll(SimpleList.of(iV8InspectorListenerArr));
    }

    public void runIfWaitingForDebugger(int i2) {
        this.logger.logDebug("Receiving runIfWaitingForDebugger(): {0}", Integer.toString(i2));
        Iterator<IV8InspectorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().runIfWaitingForDebugger(i2);
            } catch (Throwable th) {
                this.logger.logError(th, th.getMessage(), new Object[0]);
            }
        }
    }

    public void sendRequest(String str) throws JavetException {
        this.logger.logDebug(FijIa.kwtlEYTJQearjQm, str);
        Iterator<IV8InspectorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().sendRequest(str);
            } catch (Throwable th) {
                this.logger.logError(th, th.getMessage(), new Object[0]);
            }
        }
        this.v8Native.v8InspectorSend(this.v8Runtime.getHandle(), str);
    }

    V8Inspector(V8Runtime v8Runtime, String str, IV8Native iV8Native) {
        this.logger = v8Runtime.getLogger();
        this.name = str;
        this.v8Runtime = v8Runtime;
        this.v8Native = iV8Native;
        iV8Native.createV8Inspector(v8Runtime.getHandle(), this);
    }

    public void setLogger(IJavetLogger iJavetLogger) {
        Objects.requireNonNull(iJavetLogger);
        this.logger = iJavetLogger;
    }
}
