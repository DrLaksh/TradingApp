package com.TradingApp.TradingProject.Model;


import jakarta.persistence.Entity;
import lombok.Data;

@Entity
/**
 * 
 */
@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
