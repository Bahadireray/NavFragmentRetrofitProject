package com.example.bahadir_eray_retrofitproject.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$MarsHolder;", "marsList", "", "Lcom/example/bahadir_eray_retrofitproject/model/MarsModel;", "listener", "Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$Listener;", "(Ljava/util/List;Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$Listener;)V", "getMarsList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "MarsHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.MarsHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.bahadir_eray_retrofitproject.model.MarsModel> marsList = null;
    private final com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.Listener listener = null;
    
    public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.bahadir_eray_retrofitproject.model.MarsModel> marsList, @org.jetbrains.annotations.NotNull()
    com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.Listener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.bahadir_eray_retrofitproject.model.MarsModel> getMarsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.MarsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.MarsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$Listener;", "", "onItemClick", "", "marsModel", "Lcom/example/bahadir_eray_retrofitproject/model/MarsModel;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.bahadir_eray_retrofitproject.model.MarsModel marsModel);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$MarsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "recyclerRowLayoutBinding", "Lcom/example/bahadir_eray_retrofitproject/databinding/RowLayoutBinding;", "(Lcom/example/bahadir_eray_retrofitproject/databinding/RowLayoutBinding;)V", "getRecyclerRowLayoutBinding", "()Lcom/example/bahadir_eray_retrofitproject/databinding/RowLayoutBinding;", "bind", "", "marsModel", "Lcom/example/bahadir_eray_retrofitproject/model/MarsModel;", "position", "", "listener", "Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$Listener;", "app_debug"})
    public static final class MarsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding recyclerRowLayoutBinding = null;
        
        public MarsHolder(@org.jetbrains.annotations.NotNull()
        com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding recyclerRowLayoutBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding getRecyclerRowLayoutBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.bahadir_eray_retrofitproject.model.MarsModel marsModel, int position, @org.jetbrains.annotations.NotNull()
        com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.Listener listener) {
        }
    }
}