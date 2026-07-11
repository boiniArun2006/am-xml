package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class hQ implements InterfaceC1922m {
    private final int[] checkInitialized;
    private final yg defaultInstance;
    private final UGc[] fields;
    private final boolean messageSetWireFormat;
    private final o7q syntax;

    public static final class j {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<UGc> fields;
        private boolean messageSetWireFormat;
        private o7q syntax;
        private boolean wasBuilt;

        public j() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public hQ build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new hQ(this.syntax, this.messageSetWireFormat, this.checkInitialized, (UGc[]) this.fields.toArray(new UGc[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(UGc uGc) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(uGc);
        }

        public void withMessageSetWireFormat(boolean z2) {
            this.messageSetWireFormat = z2;
        }

        public void withSyntax(o7q o7qVar) {
            this.syntax = (o7q) nKK.checkNotNull(o7qVar, "syntax");
        }

        public j(int i2) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i2);
        }
    }

    public static j newBuilder() {
        return new j();
    }

    public static j newBuilder(int i2) {
        return new j(i2);
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.InterfaceC1922m
    public yg getDefaultInstance() {
        return this.defaultInstance;
    }

    public UGc[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.InterfaceC1922m
    public o7q getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.InterfaceC1922m
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    hQ(o7q o7qVar, boolean z2, int[] iArr, UGc[] uGcArr, Object obj) {
        this.syntax = o7qVar;
        this.messageSetWireFormat = z2;
        this.checkInitialized = iArr;
        this.fields = uGcArr;
        this.defaultInstance = (yg) nKK.checkNotNull(obj, "defaultInstance");
    }
}
