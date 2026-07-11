package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class h implements RzR {
    private static final iF EMPTY_FACTORY = new j();
    private final iF messageInfoFactory;

    class j implements iF {
        @Override // com.google.protobuf.iF
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.iF
        public InterfaceC1922m messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        j() {
        }
    }

    private static class w6 implements iF {
        private iF[] factories;

        @Override // com.google.protobuf.iF
        public boolean isSupported(Class<?> cls) {
            for (iF iFVar : this.factories) {
                if (iFVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.iF
        public InterfaceC1922m messageInfoFor(Class<?> cls) {
            for (iF iFVar : this.factories) {
                if (iFVar.isSupported(cls)) {
                    return iFVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        w6(iF... iFVarArr) {
            this.factories = iFVarArr;
        }
    }

    public h() {
        this(getDefaultMessageInfoFactory());
    }

    static /* synthetic */ class n {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[o7q.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[o7q.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private h(iF iFVar) {
        this.messageInfoFactory = (iF) nKK.checkNotNull(iFVar, "messageInfoFactory");
    }

    private static boolean allowExtensions(InterfaceC1922m interfaceC1922m) {
        return n.$SwitchMap$com$google$protobuf$ProtoSyntax[interfaceC1922m.getSyntax().ordinal()] != 1;
    }

    private static iF getDefaultMessageInfoFactory() {
        return new w6(ci.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static iF getDescriptorMessageInfoFactory() {
        try {
            return (iF) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> R6 newSchema(Class<T> cls, InterfaceC1922m interfaceC1922m) {
        return g9s.class.isAssignableFrom(cls) ? allowExtensions(interfaceC1922m) ? l4Z.newSchema(cls, interfaceC1922m, O.lite(), vd.lite(), pq.unknownFieldSetLiteSchema(), s4.lite(), P.lite()) : l4Z.newSchema(cls, interfaceC1922m, O.lite(), vd.lite(), pq.unknownFieldSetLiteSchema(), null, P.lite()) : allowExtensions(interfaceC1922m) ? l4Z.newSchema(cls, interfaceC1922m, O.full(), vd.full(), pq.unknownFieldSetFullSchema(), s4.full(), P.full()) : l4Z.newSchema(cls, interfaceC1922m, O.full(), vd.full(), pq.unknownFieldSetFullSchema(), null, P.full());
    }

    @Override // com.google.protobuf.RzR
    public <T> R6 createSchema(Class<T> cls) {
        pq.requireGeneratedMessage(cls);
        InterfaceC1922m interfaceC1922mMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (interfaceC1922mMessageInfoFor.isMessageSetWireFormat()) {
            if (g9s.class.isAssignableFrom(cls)) {
                return mz.newSchema(pq.unknownFieldSetLiteSchema(), s4.lite(), interfaceC1922mMessageInfoFor.getDefaultInstance());
            }
            return mz.newSchema(pq.unknownFieldSetFullSchema(), s4.full(), interfaceC1922mMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, interfaceC1922mMessageInfoFor);
    }
}
