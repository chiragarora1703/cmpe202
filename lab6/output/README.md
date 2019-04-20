Design pattern :

1. For displaying in two different way  : Invoice and assembly note,  I choose strategy pattern. Because we have the same data but different way to process it. So therefore, strategy pattern seems best to me.
2. Composite pattern : Used composite pattern to add and print the ingredients of the  menu item.

In my design, first order manager adds the menu item such as burger or fries to the order.

For each menu item, we also need to enter the subitem or ingredients. All the ingredients or subitem are also part of MenuItem making it a composite pattern.

To Print we use strategy pattern such as invoice or AssemblyNote strategy. Each strategy provides a function to the content generator to reorder the internal list. Once the list is reordered, we get the content to print.

Output of the System
```
Invoice

----------------------------------------

1     LBB  5.59

    {{{{ BACON }}}}

    LETTUCE

    TOMATO

    ->|G Onion

    ->|JALA Grilled

1 LTL  CAJ  2.79



SubTotal:  $8.38

Tax:   $0.75

Total:   $9.13

----------------------------------------

Assembly Note

----------------------------------------

1     LBB

    LETTUCE

    TOMATO

    ->|G Onion

    ->|JALA Grilled

    {{{{ BACON }}}}

1 LTL  CAJ

----------------------------------------
```
