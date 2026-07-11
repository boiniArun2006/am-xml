package io.grpc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ManagedChannelProvider {
    protected abstract z n(String str);

    protected abstract boolean rl();

    protected abstract int t();

    public static final class ProviderNotFoundException extends RuntimeException {
        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    public static ManagedChannelProvider nr() {
        ManagedChannelProvider managedChannelProviderNr = ManagedChannelRegistry.rl().nr();
        if (managedChannelProviderNr != null) {
            return managedChannelProviderNr;
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
