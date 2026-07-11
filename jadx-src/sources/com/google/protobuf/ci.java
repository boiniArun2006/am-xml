package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class ci implements iF {
    private static final ci instance = new ci();

    public static ci getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.iF
    public boolean isSupported(Class<?> cls) {
        return g9s.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.iF
    public InterfaceC1922m messageInfoFor(Class<?> cls) {
        if (!g9s.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC1922m) g9s.getDefaultInstance(cls.asSubclass(g9s.class)).buildMessageInfo();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
        }
    }

    private ci() {
    }
}
