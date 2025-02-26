package com.football.manager.domain.role;

/**
 * This is enum that represents role in football of {@link com.football.manager.domain.User}.
 *
 * @author Igor Fliginskikh
 * @version 1.0
 */

public enum RoleInFootball {
    GK, //GK (ГК) - Goalkeeper ( вратарь )
    SW, //SW (ЦЗ) - Free Defender ( свободный защитник )
    RB, //RB (ПЗ) - Right Defender ( правый защитник )
    LB, //LB (ЛЗ) - Left Defender ( левый защитник )
    CB, //CB (ЦЗ) - Central Defender ( центр защитник )
    RBW, //RWB (ЗПФ) - Right Attacking Defender ( правый атакующий защитник )
    LBW, //LWB (ЗЛФ) - Left Attacking Defender ( левый атакующий защитник )
    CDM, //CDM (ЦОПЗ) - Central Defensive Midfielder ( опорный/оборонительный полузащитник )
    RM, //RM (ППЗ) - Right Midfielder ( правый полузащитник )
    CM, //CM (ЦПЗ) - Central Midfielder ( центральный полузащитник )
    LM, //LM (ЛПЗ) - Left Midfielder   ( левый полузащитник )
    RMM, //RWM (ПЗПФ) - Right Side Midfielder ( правый атакующий полузащитник )
    LMM, //LWM (ПЗЛФ) -   Left Side Midfielder ( левый атакующий полузащитник )
    CAM, //CAM (ЦАПЗ) - Central Attacking Midfielder ( центральный атакующий полузащитник )
    RF, //RF (ПН) - Right Forward ( правый отянутый форвард )
    CF, //CF (СН) - Central Forward ( центральный отянутый форвард )
    LF, //LF (ЛН) - Left Forward ( левый отянутый форвард )
    RS, //RS (ПФ) - Right Striker ( правый конечный форвард )
    LS, //LS (ЛФ) - Left Striker ( левый конечный форвард )
    ST //ST (ЦФ) - Striker ( центр форвард )
}
