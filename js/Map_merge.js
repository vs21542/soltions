import { Map, merge } from "immutable";

const parent = Map({ a: 100, b: 300, c: 500 });

const child = Map({ a: 200, b: 400, z: 600 });

const MergedMap = conflate(parent, child);

console.log("Parent map - ", parent);
console.log("Child map- ", child);
console.log("Merged Map - ", MergedMap);

function conflate(parent, child)
{
    const mergeMap = merge(parent, child);
    return mergeMap;
}