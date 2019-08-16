CSS : Cascading Style Sheets

Inline Style sheet:
    Scope is limited to current element only.
    Can override all other styles.

Internal Style sheet:
    Scope is limited to single html document only.
    Can override all styles defined by External style sheet.
    Requires a SELECTOR to filter elements while applying style definitions.

    TAG Selector : Uses HTML Tag as filter for selecting elements.
                    Hack: the TAG used may not be a valid HTML tag.

    Class selector: Filter HTML Elements by their CLASS attribute.
                    CLASS is globally comman attribute for EVERY tag
                    which can be written inside BODY tag.

    ID Selector:    Unique ID for element. Ideally, it MUST be Unique, but linient 
                    nature of html may result in NOT SHOWING any ERROR if two elements  
                    have same ID.    

External Style sheet:
    Scope is not limited, can be applied to entire website.
    Requires SELECTOR for applying style sheet rules.