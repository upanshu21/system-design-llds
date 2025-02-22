package com.patterns.lld.examples.amazonlocker.models;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class Locker {

        private LockerSize capacity;
        private boolean available;
        private Date inUse;
        private Optional<List<Order>> history;
        private HashSet<String> token;
        private Optional<String> location;

        public Locker(LockerSize capacity, boolean available, Date inUse, Optional<List<Order>> history, HashSet<String> token, Optional<String> location) {
            this.capacity = capacity;
            this.available = available;
            this.inUse = inUse;
            this.history = history;
            this.token = token;
            this.location = location;
        }

        public LockerSize getCapacity() {
            return capacity;
        }   

        public boolean isAvailable() {
            return available;
        }

        public Date getInUse() {
            return inUse;
        }

        public Optional<List<Order>> getHistory() {
            return history;
        }

        public HashSet<String> getToken() {
            return token;
        }

        public Optional<String> getLocation() {
            return location;
        }

        public void setCapacity(LockerSize capacity) {
            this.capacity = capacity;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
}