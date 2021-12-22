.include "../framework.asm"

.name "TEST"

.section "main"
    main:
        call clearVRAM;
        

        ld a, 200
        ld c, 1
        ld b, 1
        ld bc, field
        pop bc
        call setTile
        ld a, 1
        ld c, 1
        ld b, 2
        ld bc, field
        call setTile
        ld a, 1
        ld c, 1
        ld b, 3
        call setTile  
        ld a, 1
        ld c, 2
        ld b, 1
        call setTile
        ld a, 1
        ld c, 2
        ld b, 2
        call setTile
        ld a, 1
        ld c, 2
        ld b, 3
        call setTile

        ld a, 1
        ld c, 3
        ld b, 1
        call setTile
        ld a, 1
        ld c, 3
        ld b, 2
        call setTile
        ld a, 1
        ld c, 3
        ld b, 3
        call setTile
        call waitVBlank
        ret
  .ends


