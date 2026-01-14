node {
    git url: 'https://github.com/dragandbot/dragandbot_common.git', branch: 'devel'
    dir ('dnb_msgs') { registerROS('ros:melodic-ros-base', [], []) }
}
