package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteString f38068n;
    private volatile ByteString nr;
    private ExtensionRegistryLite rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected volatile MessageLite f38069t;

    public int hashCode() {
        return 1;
    }

    public ByteString O() {
        if (this.nr != null) {
            return this.nr;
        }
        ByteString byteString = this.f38068n;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.nr != null) {
                    return this.nr;
                }
                if (this.f38069t == null) {
                    this.nr = ByteString.f37740t;
                } else {
                    this.nr = this.f38069t.toByteString();
                }
                return this.nr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f38069t;
        MessageLite messageLite2 = lazyFieldLite.f38069t;
        return (messageLite == null && messageLite2 == null) ? O().equals(lazyFieldLite.O()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.t(messageLite.getDefaultInstanceForType())) : t(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    protected void n(MessageLite messageLite) {
        if (this.f38069t != null) {
            return;
        }
        synchronized (this) {
            if (this.f38069t != null) {
                return;
            }
            try {
                if (this.f38068n != null) {
                    this.f38069t = (MessageLite) messageLite.getParserForType().n(this.f38068n, this.rl);
                    this.nr = this.f38068n;
                } else {
                    this.f38069t = messageLite;
                    this.nr = ByteString.f37740t;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f38069t = messageLite;
                this.nr = ByteString.f37740t;
            }
        }
    }

    public MessageLite nr(MessageLite messageLite) {
        MessageLite messageLite2 = this.f38069t;
        this.f38068n = null;
        this.nr = null;
        this.f38069t = messageLite;
        return messageLite2;
    }

    public int rl() {
        if (this.nr != null) {
            return this.nr.size();
        }
        ByteString byteString = this.f38068n;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f38069t != null) {
            return this.f38069t.getSerializedSize();
        }
        return 0;
    }

    public MessageLite t(MessageLite messageLite) {
        n(messageLite);
        return this.f38069t;
    }
}
